<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>	
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<div class="row mt-5">
	<div class="col-md-8 col-md-offset-2">
		<div class="card">
			<div class="card-header" style="background-color:#90EE90">
				<h6>Edit Status Update</h6>
			</div>
			<div class="card-body">
			<!--  ======== Form ================= -->
				<form:form modelAttribute="statusUpdate">
				   <form:input type="hidden" path="id" />
				    <form:input type="hidden" path="added" />
				   <div class="errors">
				       <form:errors path="text" />
				        <form:errors path="id" />
				         <form:errors path="added" />
				   </div>
					<div class="form-group">
						<form:textarea class="form-control" path="text" name="text" cols="5" rows="10"></form:textarea>
					</div>
					<input type="submit" name="submit" class="btn btn-primary mb-2" style="margin-left:5px;" value="Save"> 
				</form:form>
				<!--  ======== End Form ================= -->
			</div>
		</div>
	</div>
</div>

<!--  ======= What You See Is What You Get Editor=================== -->
 <script src="https://cdn.tiny.cloud/1/no-api-key/tinymce/5/tinymce.min.js" referrerpolicy="origin"></script>
    <script>
      tinymce.init({
        selector: 'textarea',
        pluging: "link"
      });
    </script>
    <!--  ======= End What You See Is What You Get Editor=================== -->