<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><tiles:insertAttribute name="title" /></title>
<c:set var="contexRoot" value="${pageContext.request.contextPath }" />
    <!------------------ -Bootstrap----------------- -->	
	<link rel="stylesheet" href="${contexRoot}/css/bootstrap.min.css">
	<!----------------- My Style ------------->
   <link rel="stylesheet" href="${contexRoot}/css/main.css">

</head>
<body>
<div class="container-fluid">
	<nav class="navbar navbar-expand-md navbar-light bg-light"> 
	<a class="navbar-brand" href="#">Logo</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarText" aria-controls="navbarText"
		aria-expanded="false" scr="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarText">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item"><a class="nav-link" href="${contexRoot}/home">Home</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="${contexRoot}/about">About</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="#">Pricing</a></li>
		</ul>
		<span class="navbar-text"> <a class="nav-link" href="#">Profile</a></span>
	</div>
	</nav>


	<tiles:insertAttribute name="content" />


</div>
	<!------------ -Bootstrap ---------------->
     <script src="${contexRoot}/js/bootstrap.min.js"></script>
	<!-- -----------My JavaScript --------------->	
     <script src="${contexRoot}/js/main.js"></script>

 
</body>
</html>