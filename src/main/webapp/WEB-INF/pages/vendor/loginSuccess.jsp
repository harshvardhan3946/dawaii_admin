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
<div class="container">

    <ul class="nav nav-tabs">
        <li class="active"><a href="/ambulance/viewAmbulances">My Ambulance</a></li>
        <li><a href="/ambulance/viewOrders">My Orders</a></li>
        <li><a href="/ambulance/registerPage">Add Ambulance</a></li>
        <%--<li><a data-toggle="tab" href="#menu3">My Account</a></li>--%>
        <%--<li><a data-toggle="tab" href="#menu4">Contact Us</a></li>--%>
    </ul>

    <div class="tab-content">
        <div id="menu1" class="tab-pane fade in active">

            <h3>My Ambulance</h3>

            <table class="ambulancetable">
                <thead>
                <tr>
                    <th>Vechile No.</th>
                    <th>Driver Name</th>
                    <th>Mobile No.</th>
                    <th>Contact Number</th>
                    <th>Email Id</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="ambulance"
                           items="${ambulanceList}"
                           varStatus="status">
                    <tr>
                        <td>"${ambulance.vehicleNumber}"</td>
                        <td>"${ambulance.driverName}"</td>
                        <td>"${ambulance.mobileNumber}"</td>
                        <td>"${ambulance.contactNumber}"</td>
                        <td>"${ambulance.email}"</td>
                        </tr>
                </c:forEach>
                </tbody>
            </table>
            <button type="submit" name="submit" class="bupdate">Update</button>


        </div>
    </div>

</div>

</body>
</html>

</div>
</body>
</html>