<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
 <meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Example of Bootstrap 3 Dropdowns within a Navbar</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style type="text/css">
	.bs-example{
    	margin: 20px;
    }
</style>
</head>
<style>
.search-text{
	margin-top:50px;
	background-color:#7dabdb;
	padding-top:60px;
	padding-bottom:60px;
}
	
.search-text .input-search{
	height:45px;
	width:400px;
	padding-left:20px;
    color:#333;
} 

.search-text .btn-search{
	background-color:#7dabdb;
	border:1px solid #FFF;
	font-family:Roboto;
	color:#FFF;
	padding:11px 20px 11px 20px;
}

.search-text  .btn-search:hover{
	background-color:#FFF;
	color:#7dabdb;
}

.copyright{
    background-color:#f0f0f0;
}

.copyright p{
	font-family:Roboto;
	padding:15px 0 10px 0;
}

footer{
	background-color:#222222;
	min-height:200px;
	padding:80px 0 50px 0;
}

footer .menu li a{
	font-family:Roboto;
	color:#b1aca1;
	padding:10px;
	text-decoration:none;
}

footer .menu li a:hover{
	color:#7dabdb;
}

.fa.fa-facebook , .fa.fa-dropbox, .fa.fa-flickr , .fa.fa-github , .fa.fa-linkedin ,.fa,fa-tumblr ,.fa.fa-google-plus , .fa.fa-tumblr {
	color:#b1aca1;
	font-size:20px;
	padding:10px;
	margin-bottom:50px;
}

.fa.fa-facebook:hover , .fa.fa-dropbox:hover , .fa.fa-flickr:hover  , .fa.fa-github:hover  , .fa.fa-linkedin:hover  ,.fa,fa-tumblr:hover  ,.fa.fa-google-plus:hover  , .fa.fa-tumblr:hover  {
	color:#6794c2;
}

</style>


<body>

<link href="//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
    
    <!-- Footer 1 - Left Social/Right Menu -->
    
    <div class="search-text"> 
       <div class="container">
         <div class="row text-center">
         
           <div class="form">
                <form id="search-form" class="form-search form-horizontal">
                    <input type="text" class="input-search" placeholder="Search">
                    <button type="submit" class="btn-search">Search</button>
                </form>
            </div>
        
          </div>         
       </div>     
	</div>
    
    
    <footer>
     <div class="container">
       <div class="row text-center">
       
                 <div class="col-md-6 col-sm-6 col-xs-12">
                  <ul class="list-inline">
                             
                               <li>
                                    <a href="#"><i class="fa fa-facebook fa-2x"></i></a>
                               </li>
                               
                               <li>
                                    <a href="#"><i class="fa fa-dropbox fa-2x"></i></a>
                               </li>
                               
                               <li>
                                    <a href="#"><i class="fa fa-flickr fa-2x"></i></a> 
                               </li>
                              
                               <li>
                                    <a href="#"><i class="fa fa-github fa-2x"></i></a>
                               </li>
                                
                               <li>
                                    <a href="#"><i class="fa fa-linkedin fa-2x"></i></a>
                               </li>
                               
                               <li>
                                    <a href="#"><i class="fa fa-tumblr fa-2x"></i></a>
                               </li>
                                
                               <li>
                                    <a href="#"><i class="fa fa-google-plus fa-2x"></i></a>
                              </li>
                              
                     </ul>
                   </div>
           
                 <div class="col-md-6 col-sm-6 col-xs-12">
                  <ul class="menu list-inline">
                             
                         <li>
                            <a href="#">Home</a>
                          </li>
                               
                          <li>
                             <a href="#">About</a>
                          </li>
                               
                          <li>
                            <a href="#">Blog</a>
                          </li>
                               
                          <li>
                             <a href="#">Gallery </a>
                          </li>
                               
                          <li>
                            <a href="#">Contact</a>
                         </li>
               
                 </ul>
               </div>
           
           
           </div> 
        </div>
    </footer>
    
    
    <div class="copyright">
     <div class="container">
       
         <div class="row text-center">
         	<p>Copyright � 2017 All rights reserved</p>
         </div>
         
 	   </div>
    </div>
    
    <!-- End -->
    
    	
</body>
</html>