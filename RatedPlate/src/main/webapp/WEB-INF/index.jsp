<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Rated Plate - Home</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="keywords" content="Real Estate Template" />
        <meta name="description" content="Proper - Real Estate Responsive HTML5 Template">
        <meta name="author" content="yobio.indiewebstyle.com">
        <!-- Bootstrap -->
        <link href="../../assets/css/bootstrap.min.css" rel="stylesheet" media="screen">
        <link href="../../assets/css/bootstrap-responsive.min.css" rel="stylesheet">
        <link href="../../assets/css/style.css" rel="stylesheet" media="screen">
        <link href="../../assets/js/colorbox/colorbox.css" rel="stylesheet" media="screen">
        <!-- FONTAWESOME STYLE -->
        <link rel="stylesheet" href="../../assets/font/FortAwesome/css/font-awesome.css"/>
        <!--[if IE 7]>
        <link rel="stylesheet" href="assets/css/font-awesome-ie7.min.css">
        <![endif]-->

        <!--[if lt IE 9]>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

        <link rel="shortcut icon" href="../../assets/images/logo.png">
    </head>
    <body>
        <!-- Start Wrapper-->
        <div id="wrapper">

            <jsp:include page="jsp/includes/breadcrumbs.jsp"/>
            <jsp:include page="jsp/includes/header.jsp"/>
            <jsp:include page="jsp/includes/navigation.jsp"/>
            <!-- start Content -->
            <div id="content">


                <div class="panel googleMaparea">
                    <div id="googleMap" class="">         
                    </div>
                    <div class="map-with-agent visible-desktop"> 
                        <h3>Promote a place..?</h3>
<!--                        <img src="assets/images/agents/n5.png" alt="ceo"/> maybe have a restaurant or plate of food here-->
                    </div>
                </div>


                <jsp:include page="jsp/includes/headerCarousel.jsp"/>

                <div class="container">
                    <div class="row-fluid">
                        <div class="span9">
                            <div class="panel right-line">
                                <jsp:include page="jsp/includes/featuredGrid.jsp"/>
                            </div>

                            <jsp:include page="jsp/includes/plateNews.jsp"/>
                        </div>
                    </div>
                        <div class="span3">
                            <div class="panel">
                                <!--Start Form Search Properties-->
                                <h3 class="main-heading bottom-line line-before"><span class="main-circle-icon"><i class="icon-search"></i></span>  Find Plates</h3>
                                <form class="bottom-line line-before" action="http://yobithemes.com/wb/html/realestate/?" method="get">
                                    <label>Location</label>
                                    <input type="text" placeholder="Type Your Location" name="" value="" class="input-block-level" required=""/>
                                    <label>Radius</label>
                                    <select name="" class="input-block-level" required="">
                                        <option value="">This area only</option>
                                        <option value="">Within 1/4 mile</option>
                                        <option value="">Within 1/2 mile</option>
                                        <option value="">Within 1 mile</option>
                                        <option value="">Within 3 miles</option>
                                        <option value="">Within 5 miles</option>
                                        <option value="">Within 10 miles</option>
                                        <option value="">Within 15 miles</option>
                                        <option value="">Within 20 miles</option>
                                        <option value="">Within 30 miles</option>
                                        <option value="">Within 40 miles</option>
                                    </select>
                                    <div class="control-group-form">
                                        <div class="control-group half pull-left">
                                            <label class="control-label" >Min Price</label>
                                            <div class="controls">
                                                <select name="" class="input-block-level" required="">
                                                    <option value="">All</option>
                                                    <option value="1">1000</option>
                                                    <option value="9">2000</option>
                                                    <option value="9">3000</option>
                                                    <option value="9">4000</option>
                                                    <option value="9">5000+</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="control-group half text-right pull-right">
                                            <label class="control-label">Max Price</label>
                                            <div class="controls">
                                                <select name=""   class="input-block-level" required="">
                                                    <option value="">All</option>
                                                    <option value="1">10000</option>
                                                    <option value="9">20000</option>
                                                    <option value="9">30000</option>
                                                    <option value="9">40000</option>
                                                    <option value="9">50000+</option>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="control-group-form">
                                        <div class="control-group half pull-left">
                                            <label class="checkbox">
                                                <input type="checkbox" > Rent Property
                                            </label>
                                        </div>
                                        <div class="control-group half text-right pull-right">
                                            <label class="checkbox">
                                                <input type="checkbox"> Sell Property
                                            </label>
                                        </div>
                                        <div class="clearfix"></div>
                                    </div>
                                    <label>Bath</label>
                                    <select name=""  class="input-block-level " required="">
                                        <option value="">All</option>
                                        <option value="1">1</option>
                                        <option value="9">2</option>
                                        <option value="9">3</option>
                                        <option value="9">4</option>
                                        <option value="9">5+</option>
                                    </select>
                                    <label>Beds</label>
                                    <select name=""  class="input-block-level " required="">
                                        <option value="">All</option>
                                        <option value="1">1</option>
                                        <option value="9">2</option>
                                        <option value="9">3</option>
                                        <option value="9">4</option>
                                        <option value="9">5+</option>
                                    </select>

                                    <button type="submit" class="input-block-level btn-proper btn btn-large"> Search</button>
                                </form>
                                <!--End Form Search Properties-->

                                <!--Start List Our Agent-->
                                <h3 class="bottom-line  line-before main-heading"><span class="main-circle-icon"><i class="icon-list"></i></span>  Following</h3>
                                <div class="list-items ">

                                    <div class="item">
                                        <div class="img-preview">
                                            <img src="../../assets/images/agents/thum_list/a2.jpg" alt="Corin Langpost" />
                                        </div>
                                        <div class="item-desk">
                                            <div class="title">
                                                <h3><a href="index.jsp#">Angelina Cos</a></h3>
                                            </div>
                                            <div class="location">Palo Alto CA</div>
                                            <a href="index.jsp#" class="btn-proper btn-mini btn">Profile Page</a>
                                        </div>
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="item">
                                        <div class="img-preview">
                                            <img src="../../assets/images/agents/thum_list/a1.jpg" alt="Corin Langpost" />
                                        </div>
                                        <div class="item-desk">
                                            <div class="title">
                                                <h3><a href="index.jsp#">Angelina Cos</a></h3>
                                            </div>
                                            <div class="location">Palo Alto CA</div>
                                            <a href="index.jsp#" class="btn-proper btn-mini btn">Profile Page</a>
                                        </div>
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="item">
                                        <div class="img-preview">
                                            <img src="http://placehold.it/100x80" alt="Corin Langpost" />
                                        </div>
                                        <div class="item-desk">
                                            <div class="title">
                                                <h3><a href="index.jsp#">Angelina Cos</a></h3>
                                            </div>
                                            <div class="location">Palo Alto CA</div>
                                            <a href="index.jsp#" class="btn-proper btn-mini btn">Profile Page</a>
                                        </div>
                                        <div class="clearfix"></div>
                                    </div>
                                </div>
                                <!--End List Our AGents -->
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        <jsp:include page="jsp/includes/footer.jsp"/>
        </div><!-- End Wrapper-->

        <!-- Just For Demo You can Remove it if unnecessary-->
        <a href="../html/custum-bg.html" class="ajax-demo">Change Your Plate - Watch Background><i class="icon-cogs"></i></a>

        <!-- Defaut Js Bootsrap
         ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="../../assets/js/jquery.js"></script>
        <script src="../../assets/js/bootstrap/bootstrap-transition.js"></script>
        <script src="../../assets/js/bootstrap/bootstrap-alert.js"></script>
        <script src="../../assets/js/bootstrap/bootstrap-modal.js"></script>
        <script src="../../assets/js/bootstrap/bootstrap-dropdown.js"></script>
        <script src="../../assets/js/bootstrap/bootstrap-scrollspy.js"></script>
        <script src="../../assets/js/bootstrap/bootstrap-tab.js"></script>
        <script src="../../assets/js/bootstrap/bootstrap-tooltip.js"></script>
        <script src="../../assets/js/bootstrap/bootstrap-popover.js"></script>
        <script src="../../assets/js/bootstrap/bootstrap-button.js"></script>
        <script src="../../assets/js/bootstrap/bootstrap-collapse.js"></script>
        <script src="../../assets/js/bootstrap/bootstrap-carousel.js"></script>
        <script src="../../assets/js/bootstrap/bootstrap-typeahead.js"></script>


        <!-- Grid -->
        <script src="../../assets/js/Grid-A-Licious-master/jquery.grid-a-licious.min.js"></script>

        <!-- Slider -->
        <script src="../../assets/js/carouFredSel-6.2.1/jquery.carouFredSel-6.2.1-packed.js"></script>
        <!-- optionally include helper plugins carouFredSel -->
        <script src="../../assets/js/carouFredSel-6.2.1/helper-plugins/jquery.mousewheel.min.js"></script>
        <script src="../../assets/js/carouFredSel-6.2.1/helper-plugins/jquery.touchSwipe.min.js"></script>
        <script src="../../assets/js/carouFredSel-6.2.1/helper-plugins/jquery.transit.min.js"></script>
        <script src="../../assets/js/carouFredSel-6.2.1/helper-plugins/jquery.ba-throttle-debounce.min.js"></script>

        <!-- JS GMAP3  -->
        <script src="http://maps.googleapis.com/maps/api/js?sensor=false"></script>
        <script src='../../assets/js/gmap3/gmap3.min.js'></script>

        <script src="../../assets/js/colorbox/jquery.colorbox-min.js"></script>
        <script src="../../assets/js/main.js"></script>


    </body>
</html>
