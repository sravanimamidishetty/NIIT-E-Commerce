<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
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
<%-- <jsp:include page="showProduct.jsp" /> --%> 

</head>
<div class="container"> 
       <div style='position:absolute;zindex:0;left:0;top:0;width:100%;height:100%'>
           <img src='F:\images\index.jpg' style='width:100%;height:300%' alt='[]' />
       </div>
   </div>
<body>
${ExistingMessage}
<div class="bs-example">
    <nav id="myNavbar" class="navbar navbar-inverse" role="navigation">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Brand</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Profile</a></li>
                    <li class="dropdown">
                        <a href="#" data-toggle="dropdown" class="dropdown-toggle">Messages <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="">Inbox</a></li>
                            <li><a href="#">Drafts</a></li>
                            <li><a href="#">Sent Items</a></li>
                            <li class="divider"></li>
                            <li><a href="#">Trash</a></li>
                        </ul>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="#" data-toggle="dropdown" class="dropdown-toggle">Sign Up <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="login">Login action</a></li>
                            <li><a href="signup">Registration action</a></li>
                            <li class="divider"></li>
                            <!-- <li><a href="logout">Logout</a></li> -->
                         
                              <li> <a href="<c:url value="j_spring_security_logout" />">Logout</a></li>
                            
                           
                            
                        </ul>
                    </li>
                </ul>
                   
                <ul class="nav navbar-nav">
                    <li><a href="#">Home</a></li>
                    <li><a href="viewcart">Cart</a></li>
               </ul>         
            </div><!-- /.navbar-collapse -->
        </div>
    </nav>
</div>
<!-- =================================== -->

	<div class="container">
<div id="myCarousel" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="1" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="2" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="3" class="active"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
    <div class="item active">
      <img class="img-rounded" class="img-responsive center-block"
      src="F:\images\down.jpg" style="width:100%" "height="50%">
    </div>
    <div class="item">
    <img class="img-rounded" class="img-responsive center-block"
      src="F:\images\down2.jpg" style="width:100%" "height="50%">
    </div>

    <div class="item">
    <img class="img-rounded" class="img-responsive center-block"
      src="F:\images\down3.jpg" style="width:100%" "height="20%">
    </div>
 
  </div>
  <!-- Left and right controls -->
  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#myCarousel" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
<!-- =================================== -->
</br>
</br>
</br>
</br>
</br>
</br>
</br>
	<div class="container">
          
        <div class="row">
<c:forEach items="${ProductList}" var="product">     
            <div class="col-sm-4">
                <div class="panel panel-primary">
             <div class="panel-body"> <img src="/dtproject/myImage/imageDisplay?id=${product.id}" class="img-responsive" style="width:100%" alt="Image"></div>
                <%-- <img src="<c:url value="/resources/assets/img/rv_1-gito-1.jpg"/>">
                    --%> <div class="caption">
                        <h3>${product.name}</h3>
                        <ul>
                         <p>${product.description}</p>
                        <li>Price: Rs.<Strong>${product.price}</Strong></li>
                       
     
                   <form:form action="addtoCart/${product.id}" method="POST">
                                <input type="submit" value="Add to Cart" class="btn btn-primary">
                                </form:form>
                                
                                </ul>
                            </div>
                        </div>
                    </div>
         
           </c:forEach>       
                </div>
                
         
        </div>
<br/><br/><br/><br/>



</body>
</html>   