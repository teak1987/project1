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
		<nav class="navbar navbar-expand-md bg-dark  navbar-dark sticky-top"> <a
			class="navbar-brand nav-color" href="#">Logo For The Site</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link nav-color"
					href="${contexRoot}/home">Home</a></li>
				<li class="nav-item"><a class="nav-link nav-color"
					href="${contexRoot}/about">About</a></li>
				<li class="nav-item"><a class="nav-link nav-color" href="#">Link</a></li>
				<li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
         Status
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="${contexRoot}/add-status">Add Status</a>
          <a class="dropdown-item" href="${contexRoot}/view-status">View Status</a>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </li>
			</ul>
			
			<%-- <a style="margin-left:80%;" class="nav-link nav-color" href="${contexRoot}/add-status">Add Status</a> --%>
			
		</div>
		

	 </nav>
	</div>
	
	<div class="container">
		<tiles:insertAttribute name="content" />
	</div>


	<!------------ -Bootstrap ---------------->
	  <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
     <script src="${contexRoot}/js/bootstrap.min.js"></script>
        <script src="${contexRoot}/js/bootstrap.bundle.min.js"></script>
	<!-- -----------My JavaScript --------------->	
     <script src="${contexRoot}/js/main.js"></script>

 
</body>
</html>