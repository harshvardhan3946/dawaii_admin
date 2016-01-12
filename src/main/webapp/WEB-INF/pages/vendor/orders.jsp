<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
    <title>Bootstrap Case</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <script src="/resources/js/jquery.min.js"></script>
    <script src="/resources/js/bootstrap.min.js"></script>
    <link href="<c:url value='/resources/css/toastr.css'/>" rel="stylesheet" type="text/css"/>
    <script src="<c:url value='/resources/js/toastr.js'/>"></script>
    <script src="/resources/js/custom.js" type="text/javascript"></script>
    <script>
        $(document).ready(function () {

            function exportTableToCSV($table, filename) {

                var $rows = $table.find('tr:has(td)'),

                // Temporary delimiter characters unlikely to be typed by keyboard
                // This is to avoid accidentally splitting the actual contents
                        tmpColDelim = String.fromCharCode(11), // vertical tab character
                        tmpRowDelim = String.fromCharCode(0), // null character

                // actual delimiter characters for CSV format
                        colDelim = '","',
                        rowDelim = '"\r\n"',

                // Grab text from table into CSV formatted string
                        csv = '"' + $rows.map(function (i, row) {
                            var $row = $(row),
                                    $cols = $row.find('td');

                            return $cols.map(function (j, col) {
                                var $col = $(col),
                                        text = $col.text();

                                return text.replace(/"/g, '""'); // escape double quotes

                            }).get().join(tmpColDelim);

                        }).get().join(tmpRowDelim)
                                .split(tmpRowDelim).join(rowDelim)
                                .split(tmpColDelim).join(colDelim) + '"',

                // Data URI
                        csvData = 'data:application/csv;charset=utf-8,' + encodeURIComponent(csv);

                $(this)
                        .attr({
                            'download': filename,
                            'href': csvData,
                            'target': '_blank'
                        });
            }

            // This must be a hyperlink
            $(".export").on('click', function (event) {
                // CSV
                exportTableToCSV.apply(this, [$('#dvData>table'), 'export.csv']);

                // IF CSV, don't do event.preventDefault() or return false
                // We actually need this to be a typical hyperlink
            });
        });
    </script>
</head>
<body>
<h2 align="center"><img src="/resources/images/logo.png" /></h2>
<c:url value="/j_spring_security_logout" var="logoutUrl" />
<a href="${logoutUrl}"><span class="sprite-image login"> | </span>Logout</a>
<div class="container">
<div class="container">

<ul class="nav nav-tabs">
    <li><a href="/ambulance/viewAmbulances">My Ambulance</a></li>
    <li class="active"><a href="/ambulance/viewOrders">My Orders</a></li>
    <li><a href="/ambulance/registerPage">Add Ambulance</a></li>
    <%--<li><a data-toggle="tab" href="#menu3">My Account</a></li>--%>
    <%--<li><a data-toggle="tab" href="#menu4">Contact Us</a></li>--%>
</ul>

<div class="tab-content">
    <div id="home" class="tab-pane fade in active">
        <h3>My Orders</h3>
        <div id="dvData">

            <table class="ordertable">
                <thead>
                <tr>
                    <th>User Email</th>
                    <th>User Number</th>
                    <th>User EmailId</th>
                    <th>Vehicle Number</th>
                    <th>Date of Booking</th>
                    <th>Total Price</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="ambulaneBooking"
                           items="${ambulanceBookings}"
                           varStatus="status">
                    <tr>
                        <td>${ambulaneBooking.name}</td>
                        <td>${ambulaneBooking.number}</td>
                        <td>${ambulaneBooking.email}</td>
                        <td>${ambulaneBooking.vehicleNumber}</td>
                        <td>${ambulaneBooking.date}</td>
                        <td>${ambulaneBooking.price}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>

        <a href="#" class="export">Export INTO Excel</a>


    </div>
</div>

</div>

</body>
</html>

</div>
</body>
<script>

    $(document).ready(function () {

        if ('${msg}'.length>0) {
            toastr.success('${msg}')
        }
        if ('${error}'.length>0) {
            toastr.error('${error}')
        }

    });

</script>
</html>