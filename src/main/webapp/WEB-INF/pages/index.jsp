<!DOCTYPE html>
<html lang="en" xml:lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<head>
    <link rel="shortcut icon" href="/resources/images/favicon.ico" type="image/x-icon" />
    <link rel="icon" href="/resources/images/favicon.ico" type="image/x-icon" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name='verify-v1' content='1e470597ffe8b80bb524b403a9d7a7d5'/>
    <meta name="keywords" content="online medical portal noida, Buy Medicines, Fix appointments, Locate hospitals, In-House Nursing, Health Articles, First Aid Tips, BMI Calculators" />
    <meta name="description" content="Dawaaii.com is an entryway that satisfies regular medicinal necessities of its clients." />
    <title>Dawaaii:: Welcome Dawaaii.com | Online Medical Portal Noida</title>
    <link href="/resources/css/style.css" rel="stylesheet" type="text/css" />
    <script src="/resources/js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <script src="/resources/js/custom.js" type="text/javascript"></script>
    <meta name="viewport" content="width=device-width, user-scalable=no" />
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">


    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/
libs/jquery/1.3.0/jquery.min.js"></script>



    <script>
        // you can use just jquery for this
        $(document).ready(function(){

            $("#login").click(function () {

                $('#overlay-back').fadeIn(1000,function(){
                    $('#popup').show();
                });

            });
            $("#signup").click(function () {

                $('#overlay-back').fadeIn(1000,function(){
                    $('#popup_sign').show();
                });

            });


            $("#closeButton").click(function () {
                //alert('Manish');
                $('#popup').hide();
                $('#overlay-back').fadeOut(500);
            });

            $("#closeButtonsignup").click(function () {
                //alert('Manish');

                $('#popup_sign').hide();
                $('#overlay-back').fadeOut(500);

            });



            $("#loc_submit").click(function () {
                var msg = $("#loc").val();
                document.getElementById("city").value= msg;
                document.getElementById("wcity").value= msg;
                $('#popup').hide();
                $('#overlay-back').fadeOut(500);

            });

        });
    </script>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
    <script type="text/javascript">
        var rowCount = 1;
        function addMoreRows(frm) {
            rowCount ++;
            var recRow = '<p style="padding: 10px 0px;" id="rowCount'+rowCount+'"><input type="text" name="search" class="fsearch" placeholder="Eg: Crocin Advance" id="chatinput1" onkeyup="showtext()"><a href="javascript:void(0);" onclick="removeRow('+rowCount+');"><img style="margin: 0px 0px 0px 3px; padding-top: 0px;    float: right; width: 49px;height: 46px;" src="/resources/images/idelete.jpg"></a></p>';
            jQuery('#addedRows').append(recRow);
        }

        function removeRow(removeNum) {
            jQuery('#rowCount'+removeNum).remove();
        }
    </script>

    <script>
        function showtext()
        {
            var inputBox = document.getElementById('chatinput1').value;
            document.getElementById('printchatbox').innerHTML = inputBox;
        }

        function upload()
        {
            document.getElementById('chat').style.display = 'block';
            document.getElementById('Upload').style.display = 'none';
            document.getElementById('rem').style.display = 'block';
        }
        function rem()
        {
            document.getElementById('chat').style.display = 'none';
            document.getElementById('Upload').style.display = 'block';
            document.getElementById('rem').style.display = 'none';
        }

    </script>



</head>

<body>
<div class="globalMainCont">

<!-- header -->
<div class="header">
    <!-- topBar -->
    <div class="topBar">
        <div class="topBarContent">
            <!-- topLeftPart -->
            <div class="topLeftPart">
                <div class="locationInfo">
                    <p><span> </span> Noida, Sector 15 <a href="#">(Change)</a></p>
                </div>
            </div><!-- /topLeftPart -->
            <!-- topRightPart -->
            <div class="topRightPart">
                <div class="topBarIcon locationCont">
                    <p><a href="#"><img title="cart" alt="My Cart"  src="/resources/images/location_icon.png"/></a></p>
                </div>
                <div class="topBarIcon favCont">
                    <p><a href="#"><img title="cart" alt="My Cart"  src="/resources/images/fav_icon.png"/></a></p>
                </div>
                <div class="topBarIcon cartCont">
                    <p><a href="#"><img title="cart" alt="My Cart"  src="/resources/images/cart_icon.png"/></a></p>
                </div>
                <div class="topBarText joinUsCont">
                    <p><a href="#">Join Us</a></p>
                </div>
                <div class="topBarText signUpCont">
                    <p><a id="signup" href="#">Sign Up</a></p>
                </div>
                <div class="topBarText signUpCont">
                    <p><a id="login" href="#">Log In</a></p>
                </div>
                <div class="clear"></div>
            </div>
            <!-- /topRightPart -->
            <div class="clear"></div>
        </div>
    </div><!-- /topBar -->
    <!-- logoBar -->
    <div class="logoBar">
        <!-- logo -->
        <div class="logoCont">
            <h1><a href="/index.php"><img title="dawaaii.com" alt="Home"  src="/resources/images/logo.png"/></a></h1>
        </div><!-- /logo -->

        <!-- navigation -->

        <div class="nav">
            <ul>
                <li class="firstItem"><p><a href="#">PRODUCTS</a></p></li>
                <li><p><a href="#">SERVICES</a></p></li>
                <li><p><a href="#">TOOLS</a></p></li>
                <li><p><a href="#">SUPPORT</a></p></li>
                <li class="lastItem"><p><a href="#">LATEST NEWS</a></p></li>
            </ul>
            <div class="clear"></div>
        </div><!-- /navigation -->

        <!-- utilityCont -->
        <div class="utilityCont">
            <!-- Search -->
            <div class="searchCont">
                <a href="#"><img title="Search" alt="Search"  src="/resources/images/search.jpg"/></a>
            </div><!-- /Search -->
            <div class="phoneCont">
                <a href="#"><img title="phone number" alt="phone number"  src="/resources/images/phone_icon.jpg"/></a>
            </div>
            <div class="clear"></div>
        </div><!-- /utilityCont -->
        <div class="menuBttn"><p><a href="javascript:void(0)">MENU</a></div>
        <div class="clear"></div>
    </div><!-- /logoBar -->

</div><!-- /header -->


<!-- parentCont -->
<div class="parentCont">
<!-- bannerCont -->
<div class="bannerCont">
    <div class="bannerContent">

        <div class="container-fluid bgclr-litgry">

            <div class="container-left">

                <h1 class="margin-none">
                    <img class="img-responsive" src="/resources/images/search_discount_title_images.png" style="width:600px;height:70px;" alt="Discounts on Online Medicines and Pharmacy">
                </h1>

                <input type="text" name="search" class="fsearch" placeholder="Eg: Crocin Advance" id='chatinput1' onkeyup="showtext()">

                <div id="addedRows" style="display: inline;float: left;"></div>
					<span class="input-group-btn">
					<button class="btn btn-danger btn-lg border-none" type="button" onclick="addMoreRows(this.form);" ></button>
					</span>

                <div class="upload_sec">

                    <button class="ubtn btn-danger border-none" type="button" onclick="upload();" id="Upload">Upload</button>

                    <button class="ubtn btn-danger border-none" type="button" onclick="rem();" id="rem" style="display:none;padding: 10px 3px;">Remove</button>

                    <input type="file" name="search" class="fsearch" placeholder="Upload" id='chat' style="display:none;">


                </div>

            </div>

            <div class="container-right">
                <h1 class="margin-none">Medicines Details</h1>
                <ul>
                    <li id='printchatbox'>Medicines</li>
                </ul>
            </div>



            <div style="clear:both;"></div>

            <div class="container-left" style="border: none !important;">


                <h1 class="margin-none">Alternatives</h1>
                <br/>

                <table>
                    <thead>
                    <tr>
                        <th>Name</th>
                        <th>Form</th>
                        <th>Pack Size</th>
                        <th>MRP</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>ALGINA PLUS 650MG TABLET <br/><small>Mfg: <span itemprop="name">GENO PHARMA</span></small></td>
                        <td>TABLET</td>
                        <td>10</td>
                        <td><i class="faco fa fa-inr"></i> 12.70</td>
                    </tr>
                    <tr>
                        <td>ALGINA PLUS 650MG TABLET <br/><small>Mfg: <span itemprop="name">GENO PHARMA</span></small></td>
                        <td>TABLET</td>
                        <td>10</td>
                        <td><i class="faco fa fa-inr"></i> 12.70</td>
                    </tr>
                    <tr>
                        <td>ALGINA PLUS 650MG TABLET <br/><small>Mfg: <span itemprop="name">GENO PHARMA</span></small></td>
                        <td>TABLET</td>
                        <td>10</td>
                        <td><i class="faco fa fa-inr"></i> 12.70</td>
                    </tr>
                    <tr>
                        <td>ALGINA PLUS 650MG TABLET <br/><small>Mfg: <span itemprop="name">GENO PHARMA</span></small></td>
                        <td>TABLET</td>
                        <td>10</td>
                        <td><i class="faco fa fa-inr"></i> 12.70</td>
                    </tr>
                    <tr>
                        <td>ALGINA PLUS 650MG TABLET <br/><small>Mfg: <span itemprop="name">GENO PHARMA</span></small></td>
                        <td>TABLET</td>
                        <td>10</td>
                        <td><i class="faco fa fa-inr"></i> 12.70</td>
                    </tr>
                    <tr>
                        <td>ALGINA PLUS 650MG TABLET <br/><small>Mfg: <span itemprop="name">GENO PHARMA</span></small></td>
                        <td>TABLET</td>
                        <td>10</td>
                        <td><i class="faco fa fa-inr"></i> 12.70</td>
                    </tr>
                    </tbody>
                </table>

            </div>

            <div class="container-right" style="min-height:408px;">
                <h1 class="margin-none" style="font-size: 25px;">Medicine Information</h1>
                <br/>
                <ul class="tabs">
                    <li>
                        <input type="radio" checked="" name="tabs" id="tab1">
                        <label for="tab1">Caffeine</label>
                        <div id="tab-content1" class="tab-content animated fadeIn">
                            <h4>What is Caffeine for:</h4>
                            <p>This medication stimulates the brain; hence it is used as a central nervous stimulant. It is used along with Nonsteroidal Anti-Inflammatory Drugs (NSAIDs) andor ergotamine for migraine (severe headaches with nausea). It is also used for a breathing condition (apnea) in premature infants.</p>

                            <h4>How should Caffeine be used:</h4>
                            <p>It may be administered orally at a dose of 100-200 mg , repeated after 3-4 hours as needed. For apnea in premature babies, it is administered intravenously or orally at an initial dose of 20 mgkg, followed by 5 mgkgday. It comes as a tablet, capsule to take by mouth. It is also available in injection, administered by the healthcare providers, directly into the vein.</p>

                        </div>
                    </li>
                    <li>
                        <input type="radio" name="tabs" id="tab2">
                        <label for="tab2">Paracetamol</label>
                        <div id="tab-content2" class="tab-content animated fadeIn">
                            <h4>What is Paracetamol for:</h4>
                            <p>It is used to used to relieve mild to moderate pain and to reduce fever.</p>

                            <h4>How should Paracetamol be used:</h4>
                            <p>Take this as directed by your doctor. Do not take more than instructed by your doctor. Never take more than 1000 mg at any one time and no more than 4 times in one day. The dose for a child is different from the adult dose. Be sure to check with your doctor or pharmacist before giving this medicine to a child. It may be taken with or without food. If you need pain relief fast, take it on an empty stomach as food may slow down the absorption. You may stop taking it when you have no more pain or fever. Take it only when you need to.</p>
                        </div>
                    </li>

                </ul>


            </div>


            <br/>
            <br/>

            <br/>
            <br/>
            <br/>



        </div>
    </div>
</div><!-- /bannerCont -->

<!-- footer -->
<div class="footer">
    <div class="footerContent">
        <div class="footRow footRow1 dawaaiiLink1">
            <h2>DAWAAII.COM</h2>
            <div class="firstList">
                <ul>
                    <li><p><a href="#">Blog</a></p></li>
                    <li><p><a href="#">F.A.Q</a></p></li>
                    <li><p><a href="#">Home</a></p></li>
                    <li><p><a href="#">Career</a></p></li>
                    <li><p><a href="#">Join Us</a></p></li>
                    <li><p><a href="#">About Us</a></p></li>
                </ul>
            </div>
            <div class="secondList">
                <ul>
                    <li><p><a href="#">Disclaimer</a></p></li>
                    <li><p><a href="#">Specialities</a></p></li>
                    <li><p><a href="#">Contact Us</a></p></li>
                    <li><p><a href="#">Privacy Policy</a></p></li>
                    <li><p><a href="#">Refund Policy</a></p></li>
                    <li><p><a href="#">Advertise With Us</a></p></li>
                </ul>
            </div>
        </div>
        <div class="footRow footRow2 newsletter1">
            <h2>NEWSLETTER</h2>
            <p>Sign up with your name and email to get updates fresh updates.</p>
            <div><!-- form -->
                <div class="textInput name">
                    <input type="text" name="name" placeholder="Your Name"/>
                </div>
                <div class="textInput email">
                    <input type="text" name="email" placeholder="Email Address"/>
                </div>
                <div class="submitBttn">
                    <input class="shadow" type="submit" value="SUBSCRIBE"/>
                </div>
            </div><!-- /form -->
        </div>
        <div class="footRow footRow3 latestNews1">
            <h2>LATEST TWEETS</h2>
        </div>
        <div class="footRow footRow4 touchLink1">
            <h2>GET IN TOUCH</h2>
            <h3>STRIVE Services</h3>
            <p class="firstPara">STRIVE Services, Horam Singh Complex, Sector-15, Noida, U.P 201301</p>
            <p class="secondPara"><a href="www.dawaaii.com">www.dawaaii.com</a></p>
            <p class="thirdPara"><a href="tel:120-4567335">120-4567335</a></p>

        </div>
        <!-- only for mob -->
        <div class="leftColFooter footRow onlyMob">
            <div class="targetCont dawaaiiLink">
                <h2>DAWAAII.COM</h2>
                <div class="firstList">
                    <ul>
                        <li><p><a href="#">Blog</a></p></li>
                        <li><p><a href="#">F.A.Q</a></p></li>
                        <li><p><a href="#">Home</a></p></li>
                        <li><p><a href="#">Career</a></p></li>
                        <li><p><a href="#">Join Us</a></p></li>
                        <li><p><a href="#">About Us</a></p></li>
                    </ul>
                </div>
                <div class="secondList">
                    <ul>
                        <li><p><a href="#">Disclaimer</a></p></li>
                        <li><p><a href="#">Specialities</a></p></li>
                        <li><p><a href="#">Contact Us</a></p></li>
                        <li><p><a href="#">Privacy Policy</a></p></li>
                        <li><p><a href="#">Refund Policy</a></p></li>
                        <li><p><a href="#">Advertise With Us</a></p></li>
                    </ul>
                </div>
            </div>

        </div>

        <div class="rightColFooter onlyMob">
            <div class="appBttns">
                <div class="appsDwnld">
                    <a href="#"><img title="google play" alt="google play"  src="/resources/images/g_play.jpg"/></a>
                </div>
                <div class="appsDwnld">
                    <a href="#"><img title="app store" alt="app store"  src="/resources/images/app_store.jpg"/></a>
                </div>
                <div class="clear"></div>
            </div>
            <div class="combinedBttns">
                <div class="clickBoxes preFirstBox active" id="dawaaiiLink">
                    <a href="javascript:void(0)">DAWAAII.COM</a>
                </div>
                <div class="clickBoxes firstBox" id="touchLink">
                    <a href="javascript:void(0)">GET IN TOUCH</a>
                </div>
                <div class="clickBoxes secondBox" id="newsletter">
                    <a href="javascript:void(0)">NEWSLETTER</a>
                </div>
                <div class="clickBoxes thirdBox" id="latestNews">
                    <a href="javascript:void(0)">LATEST TWEETS</a>
                </div>
            </div>
        </div><!-- /only for mob -->
        <!-- social sites -->
        <div class="shareIconsCont">
            <div class="shareIcons">
                <a href="#"><img title="facebook" alt="facebook"  src="/resources/images/fb_icon.png"/></a>
            </div>
            <div class="shareIcons">
                <a href="#"><img title="tweeter" alt="tweeter"  src="/resources/images/tweet_icon.png"/></a>
            </div>
            <div class="shareIcons">
                <a href="#"><img title="linkdIn" alt="linkdIn"  src="/resources/images/lkin_icon.png"/></a>
            </div>
            <div class="shareIcons">
                <a href="#"><img title="google plus" alt="google plus"  src="/resources/images/gplus_icon.png"/></a>
            </div>
            <div class="shareIcons">
                <a href="#"><img title="RSS Feed" alt="RSS Feed"  src="/resources/images/rss_icon.png"/></a>
            </div>
            <div class="shareIcons">
                <a href="#"><img title="youtube" alt="youtube"  src="/resources/images/ytube_icon.png"/></a>
            </div>
            <div class="shareIcons">
                <a href="#"><img title="pin it" alt="pin it"  src="/resources/images/pin_icon.png"/></a>
            </div>
            <div class="clear"></div>
        </div><!-- /social sites -->
        <div class="clear"></div>
    </div>
    <div class="copyrightText">
        <div class="copyrightTextCont">
            <p>Copyright @ 2015 Strive Services. All Rights Reserved.</p>
        </div>
    </div>
</div>
<!-- /footer -->







</div><!-- /parentCont -->


</div><!-- /globalMainCont -->


<!-- Login -->
<div id="overlay-back"></div>
<div id="popup">
    <img src="/resources/images/Deep_Close.png" class="close-image" id="closeButton"/>
    <c:url value="./j_spring_security_check" var="loginUrl" />
    <form action="${loginUrl}" accept-charset="utf-8" class="form-login" method='post'>
        <h2 class="form-login-heading">sign in now</h2>

        <div class="login-wrap">
            <input type="text" id="username" name="username" value="" class="form-control" placeholder="User ID" required="">
            <br>
            <input type="password" id="password" name="password" value="" class="form-control" placeholder="Password" required="">
            <label class="checkbox">
<span class="pull-right">
<a data-toggle="modal" href="login.html#myModal"> Forgot Password?</a>
</span>
            </label>
            <input class="btn btn-theme btn-block" type="submit" value="SIGN IN"><i class="fa fa-lock"></i>
            <hr>
        </div>
    </form>
</div>

<div id="popup_sign">
    <img src="/resources/images/Deep_Close.png" class="close-image" id="closeButtonsignup"/>
    <form action="/vendorRegister" method="post" accept-charset="utf-8" class="form-login" enctype="multipart/form-data">
        <h2 class="form-login-heading">sign up now</h2>

        <div class="login-wrap">
            <input type="text" id="username" name="firstName" value="" class="form-control" placeholder="First Name" required="">
            <input type="text" id="username" name="lastName" value="" class="form-control" placeholder="Last Name" required="">
            <input type="text" id="username" name="email" value="" class="form-control" placeholder="Email Id" required="">
            <input type="number" class="form-control" name="phoneNumber" id="phone" value="" size="35" placeholder="Phone Number" required="">
            <input type="text" id="username" name="address" value="" class="form-control" placeholder="Address" required="">
            <input type="text" id="username" name="city" value="" class="form-control" placeholder="City" required="">
            <input type="text" id="username" name="userName" value="" class="form-control" placeholder="Username" required="">
            <input type="text" id="username" name="password" value="" class="form-control" placeholder="Password" required="">
            <input id="username" type="file" name="file" class="form-control" size="35" placeholder="Upload Photo" required="">
            <select name="vendorType">
                <option value="AMBULANCE">AMBULANCE</option>
            </select>

            <input class="btn btn-theme btn-block" type="submit" value="SIGN UP"><i class="fa fa-sign-in"></i>

        </div>
    </form>
</div>
<!-- End Login -->

</body>
</html>