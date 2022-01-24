<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>	
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="row mt-5">
	<div class="col-md-8 col-md-offset-2">
		<div class="card">
			<div class="card-header" style="background-color:#90EE90">
				<h6>Add A Status Update</h6>
			</div>
			<div class="card-body">
				<form:form modelAttribute="statusUpdate">
				   <div class="errors">
				       <form:errors path="text" />
				   </div>
					<div class="form-group">
						<form:textarea class="form-control" path="text" name="text" cols="5" rows="10"></form:textarea>
					</div>
					<input type="submit" name="submit" class="btn btn-primary mb-2" style="margin-left:5px;" value="Submit"> 
				</form:form>
			</div>
		</div>
	
		<div class="card mt-5">
			<div class="card-header" style="background-color:#90EE90">
				<h6>Status update added on <fmt:formatDate pattern="EEEE d MMMM y 'at' H:mm:s" value="${latestStatusUpdate.added}" /></h6>
			</div>
			<div class="card-body">
                <p style="margin-left:10px;"><c:out value="${latestStatusUpdate.text}"></c:out></p>
			</div>
		</div>
	</div>
</div>