<div class="container">
	
	<!-- Sidebar -->
	<div class="row">
	
	<div class="col-md-3">
		
		<%@include file="./includes/sidebar.jsp" %>
		
	</div>
	
	<!-- Product -->
	<div class="col-md-9">
	
		<div class="row">
		
			<div class="col-md-12">
				
				<c:if test="${clickAllProducts == true}">
					<ol class="breadcrumb">
						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">All Products</li>
					</ol>
				</c:if>
				
				<c:if test="${clickCategoryProducts == true}">
					<ol class="breadcrumb">
						<li><a href="${contextRoot}/home">Home</a></li>
						<li class="active">Category</li>
						<li class="active">${category.name}</li>
					</ol>
				</c:if>
				
			</div>
		
		</div>	
	
	</div>
	
	
	</div>

</div>