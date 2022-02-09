<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>	
<%@ taglib tagdir="/WEB-INF/tags" prefix="pagin" %>

<c:url var="url" value="/view-status" />

<div class="row">
	<div class="col-md-8 col-md-offset-2 mt-5">
		<!--  ==========  Pagination  =========---->
		<pagin:pagination url="${url}" page="${page}" size="${size}" />
		<!--  ==========  End Pagination  =========---->
		
		
		<c:forEach var="statusUpdate" items="${page.content}">
		 <c:url var="editLink" value="/edit-status?id=${statusUpdate.id}" />
		 <c:url var="deleteLink" value="/delete-status?id=${statusUpdate.id}" />
			<div class="card">
				<div class="card-header">
					Status Update added on
					<fmt:formatDate pattern="EEEE d MMMM y 'at' H:mm:s" value="${statusUpdate.added}" />
				</div>
				<div class="card-body">
					<div>${statusUpdate.text}</div>
					<div class="pull-right">
						<a href="${editLink}">edit</a> | <a onclick="return confirm('Really delete this status update?');" href="${deleteLink}">delete</a>
					</div>
				</div>
			</div>
		</c:forEach>	
	</div>
</div>
