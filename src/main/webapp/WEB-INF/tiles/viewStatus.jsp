<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>	
<%@ taglib tagdir="/WEB-INF/tags" prefix="pagin" %>

<c:url var="url" value="/view-status" />

<div class="row">
	<div class="col-md-8 col-md-offset-2 mt-5">
		
		<pagin:pagination url="${url}" page="${page}" size="${size}" />
		
		
		<c:forEach var="statusUpdate" items="${page.content}">
		<div class="card">
			<div class="card-header">Status Update added on
			<fmt:formatDate pattern="EEEE d MMMM y 'at' H:mm:s" value="${statusUpdate.added}" />
			</div>
			<div class="card-body">			
			    <p><c:out value="${statusUpdate.text}" /></p>			
			</div>						
		</div>
		</c:forEach>	
	</div>
</div>
