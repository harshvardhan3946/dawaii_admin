<!DOCTYPE html>
<html lang="en">
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
${ambulanceList}
<h2 align="center"><img src="/resources/images/logo.png" /></h2>
<div class="container">

    <ul class="nav nav-tabs">
        <li class="active"><a href="/ambulance/viewOrders">My Orders</a></li>
        <li><a href="/ambulance/viewAmbulances">My Ambulance</a></li>
        <li><a data-toggle="tab" href="#menu2">Add Ambulance</a></li>
        <li><a data-toggle="tab" href="#menu3">My Account</a></li>
        <li><a data-toggle="tab" href="#menu4">Contact Us</a></li>
    </ul>

    <div class="tab-content">
        <div id="home" class="tab-pane fade in active">
            <h3>My Orders</h3>
            <div id="dvData">

                <table class="ordertable">
                    <thead>
                    <tr>
                        <th>Order No.</th>
                        <th>Vechile No.</th>
                        <th>Order Date</th>
                        <th>Pick Point</th>
                        <th>Drop Point</th>
                        <th>Total Price</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>112</td>
                        <td>112</td>
                        <td>11/12/2015</td>
                        <td>Address-1</td>
                        <td>Address-2</td>
                        <td>50-60%</td>
                    </tr>
                    <tr>
                        <td>112</td>
                        <td>112</td>
                        <td>11/12/2015</td>
                        <td>Address-1</td>
                        <td>Address-2</td>
                        <td>50-60%</td>
                    </tr>
                    <tr>
                        <td>112</td>
                        <td>112</td>
                        <td>11/12/2015</td>
                        <td>Address-1</td>
                        <td>Address-2</td>
                        <td>50-60%</td>
                    </tr>
                    <tr>
                        <td>112</td>
                        <td>112</td>
                        <td>11/12/2015</td>
                        <td>Address-1</td>
                        <td>Address-2</td>
                        <td>50-60%</td>
                    </tr>
                    <tr>
                        <td>112</td>
                        <td>112</td>
                        <td>11/12/2015</td>
                        <td>Address-1</td>
                        <td>Address-2</td>
                        <td>50-60%</td>
                    </tr>
                    <tr>
                        <td>112</td>
                        <td>112</td>
                        <td>11/12/2015</td>
                        <td>Address-1</td>
                        <td>Address-2</td>
                        <td>50-60%</td>
                    </tr>
                    </tbody>
                </table>

            </div>

            <a href="#" class="export">Export INTO Excel</a>


        </div>
        <div id="menu1" class="tab-pane fade">

            <h3>My Ambulance</h3>

            <table class="ambulancetable">
                <thead>
                <tr>
                    <th>Vechile No.</th>
                    <th>Driver Name</th>
                    <th>Mobile No.</th>
                    <th>Date</th>
                    <th>Availability</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>112</td>
                    <td>Name</td>
                    <td>999</td>
                    <td>11/12/2015</td>
                    <td><span>Yes</span>&nbsp;&nbsp;<input type="radio" name="op1" />&nbsp;&nbsp;<span>No</span>&nbsp;&nbsp;<input type="radio" name="op1" /></td>
                </tr>
                <tr>
                    <td>112</td>
                    <td>Name</td>
                    <td>999</td>
                    <td>11/12/2015</td>
                    <td><span>Yes</span>&nbsp;&nbsp;<input type="radio" name="op1" />&nbsp;&nbsp;<span>No</span>&nbsp;&nbsp;<input type="radio" name="op1" /></td>
                </tr>
                <tr>
                    <td>112</td>
                    <td>Name</td>
                    <td>999</td>
                    <td>11/12/2015</td>
                    <td><span>Yes</span>&nbsp;&nbsp;<input type="radio" name="op1" />&nbsp;&nbsp;<span>No</span>&nbsp;&nbsp;<input type="radio" name="op1" /></td>
                </tr>
                <tr>
                    <td>112</td>
                    <td>Name</td>
                    <td>999</td>
                    <td>11/12/2015</td>
                    <td><span>Yes</span>&nbsp;&nbsp;<input type="radio" name="op1" />&nbsp;&nbsp;<span>No</span>&nbsp;&nbsp;<input type="radio" name="op1" /></td>
                </tr>
                <tr>
                    <td>112</td>
                    <td>Name</td>
                    <td>999</td>
                    <td>11/12/2015</td>
                    <td><span>Yes</span>&nbsp;&nbsp;<input type="radio" name="op1" />&nbsp;&nbsp;<span>No</span>&nbsp;&nbsp;<input type="radio" name="op1" /></td>
                </tr>
                <tr>
                    <td>112</td>
                    <td>Name</td>
                    <td>999</td>
                    <td>11/12/2015</td>
                    <td><span>Yes</span>&nbsp;&nbsp;<input type="radio" name="op1" />&nbsp;&nbsp;<span>No</span>&nbsp;&nbsp;<input type="radio" name="op1" /></td>
                </tr>

                </tbody>
            </table>
            <button type="submit" name="submit" class="bupdate">Update</button>


        </div>
        <div id="menu2" class="tab-pane fade">
            <h3>Add Ambulance</h3>
            <form method="post" action="/ambulance/register" enctype="multipart/form-data">
                <ul>
                    <li><label>Ambulance Image</label> <input type="file" name="file"/></li>
                    <li><label>Service Provider Name</label> <input type="text" name="serviceProviderName" placeholder="Service Provider Name"/></li>
                    <li><label>Description</label> <input type="text" name="description" placeholder="Description"/></li>
                    <li><label>City</label> <input type="text" name="city" placeholder="City"/></li>
                    <li><label>State</label> <input type="text" name="state" placeholder="State"/></li>
                    <li><label>Area</label> <input type="text" name="area" placeholder="Area"/></li>
                    <li><label>Address</label> <input type="text" name="address" placeholder="Address"/></li>
                    <li><label>Contact Number</label> <input type="text" name="contactNumber" placeholder="Contact Number"/></li>
                    <li><label>Mobile Number</label> <input type="text" name="mobileNumber" placeholder="Mobile Number"/></li>
                    <li><label>Email</label> <input type="text" name="email" placeholder="Email"/></li>
                    <li><label>Vehicle Name</label> <input type="text" name="vehicleName" placeholder="Vehicle   Name" /></li>
                    <li><label>Make / Model</label> <input type="text" name="vehicleModel" placeholder="Make / Model" /></li>
                    <li><label>Driver Name</label> <input type="text" name="driverName" placeholder="Driver Name" /></li>

                    <li><label>&nbsp;</label> <input type="submit" name="submit" class="ambulance" value="Add Ambulance" /></li>

                </ul>
            </form>

        </div>
        <div id="menu3" class="tab-pane fade">
            <h3>My Account</h3>
            <div class="leftside">
                <ul>
                    <li><label><strong>Account No -</strong></label> <span>1234567</span></li>
                    <li><label><strong>Account No -</strong></label> <span>1234567</span></li>
                    <li><label><strong>Account No -</strong></label> <span>1234567</span></li>
                    <li><label><strong>Account No -</strong></label> <span>1234567</span></li>
                    <li><label><strong>Account No -</strong></label> <span>1234567</span></li>
                </ul>
            </div>
            <div class="rightside">
                <ul>
                    <li><label><strong>Account No -</strong></label> <span>1234567</span></li>
                    <li><label><strong>Account No -</strong></label> <span>1234567</span></li>
                    <li><label><strong>Account No -</strong></label> <span>1234567</span></li>
                    <li><label><strong>Account No -</strong></label> <span>1234567</span></li>
                    <li><label><strong>Account No -</strong></label> <span>1234567</span></li>
                </ul>
            </div>

        </div>
        <div id="menu4" class="tab-pane fade">
            <h3>Contact Us</h3>
            <form method="post">
                <ul>
                    <li><label>Name</label> <input type="text" name="name" placeholder="Name" /></li>
                    <li><label>Email</label> <input type="text" name="email" placeholder="Email ID" /></li>
                    <li><label>Mobile No.</label> <input type="text" name="mobile" placeholder="Mobile No." /></li>
                    <li><label>Message</label> <textarea type="text" name="address" placeholder="Message"></textarea></li>
                    <li><label>&nbsp;</label> <input type="submit" name="submit" class="ambulance" value="Submit" /></li>
                </ul>
            </form>
        </div>
    </div>

</div>

</body>
</html>

</div>
</body>
</html>