<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
    <title>Register Ambulance</title>
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
<c:url value="/j_spring_security_logout" var="logoutUrl" />
<a href="${logoutUrl}"><span class="sprite-image login"> | </span>Logout</a>
<div class="container">

<ul class="nav nav-tabs">
    <li><a href="/ambulance/viewAmbulances">My Ambulance</a></li>
    <li><a href="/ambulance/viewOrders">My Orders</a></li>
    <li class="active"><a href="/ambulance/registerPage">Add Ambulance</a></li>
    <%--<li><a data-toggle="tab" href="#menu3">My Account</a></li>--%>
    <%--<li><a data-toggle="tab" href="#menu4">Contact Us</a></li>--%>
</ul>

<div class="tab-content">
    <div id="menu2" class="tab-pane fade in active">
        <h3>Add Ambulance</h3>
        ${success}
        <form method="post" action="/ambulance/register" enctype="multipart/form-data">
            <ul>
                <li><label>Ambulance Image</label> <input type="file" name="file" accept="image/x-png, image/gif, image/jpeg"  required/></li>
                <li><label>Service Provider Name</label> <input type="text" name="serviceProviderName" placeholder="Service Provider Name" required/></li>
                <li><label>Description</label> <input type="text" name="description" placeholder="Description" required/></li>
                <li><label>City</label> <input type="text" name="city" placeholder="City" required/></li>
                <li><label>State</label> <input type="text" name="state" placeholder="State" required/></li>
                <li><label>Area</label> <input type="text" name="area" placeholder="Area" required/></li>
                <li><label>Address</label> <input type="text" name="address" placeholder="Address" required/></li>
                <li><label>Contact Number</label> <input type="text" name="contactNumber" placeholder="Contact Number" required/></li>
                <li><label>Mobile Number</label> <input type="text" name="mobileNumber" placeholder="Mobile Number" required/></li>
                <li><label>Email</label> <input type="text" name="email" placeholder="Email"/></li>
                <li><label>Vehicle Name</label> <input type="text" name="vehicleName" placeholder="Vehicle   Name" /></li>
                <li><label>Make / Model</label> <input type="text" name="vehicleModel" placeholder="Make / Model" /></li>
                <li><label>Registraton Number</label> <input type="text" name="vehicleNumber" placeholder="Registraton Number" /></li>
                <li><label>Driver Name</label> <input type="text" name="driverName" placeholder="Driver Name" /></li>

                <li><label>&nbsp;</label> <input type="submit" name="submit" class="ambulance" value="Add Ambulance" /></li>

            </ul>
        </form>

    </div>]
</div>

</div>

</body>
</html>

</div>
</body>
<script>

    $(document).ready(function () {

        if ('${msg}'.length>0) {
            alert('${msg}')
        }
        if ('${error}'.length>0) {
            alert('${error}')
        }

    });

</script>
</html>