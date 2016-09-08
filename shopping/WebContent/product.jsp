<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="app">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Online Shopping</title>
<link href="js/styles.css" rel="stylesheet">
<!--  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"> -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.16/angular.min.js"></script>
<script type="text/javascript" src="js/app.js"></script>

</head>
<body>

	<h1 id="header">Online Shopping Site</h1>
	<div id="wrapper">
		<div ng-controller="myPrd">

			<table border=5px>
				<tr ng-repeat="result in results">
					<td>{{result.product.productId}}</td>
					<td>{{result.product.productName}}</td>
					<td>{{result.product.productDescription}}</td>
					<td>{{result.product.productStock}}</td>
					<td>{{result.product.productPrice}}</td>
					<td>{{result.product.categoryId}}</td>
				</tr>
			</table>
		</div>
	</div>
	 </div>
 
    <div class="footer">Online Shopping   - Copyright © Divya Veerapandian</div>
  </div>
	
</body>
</html>