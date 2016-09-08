<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="app">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Online Shopping</title>
<!--<link href="js/styles.css" rel="stylesheet">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"> -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.16/angular.min.js"></script>
<script type="text/javascript" src="js/app.js"></script>

</head>
<body>
	<!-- <p>
		Enter Name: <input type="text" ng-model="myname">
	</p>
	<p>Hello {{myname}}!!</p>

	<div ng-controller="myCtrl">
		<div ng-repeat="result in results" ng-if="$index % 2 == 0" class="row">
			<div class="col-xs-6">First: {{results[$index].birthDate}}</div>
			<div class="col-xs-6">Second: {{results[$index + 1].birthDate}}</div>
			<br />
		</div>
	</div>

	<div ng-controller="myCtrl1">
		<div ng-repeat="result in results"  class="row">
			<div class="col-xs-6">Category	: {{result.category.categoryName}}</div>
			<br />
		</div>
	</div>
	
	
	<div ng-controller="myCtrl2">
		<div ng-repeat="result in results"  class="row">
			<div class="col-xs-6">CategoryFROMhttp: {{result.category.categoryName}}</div>
			<br />
		</div>
	</div>
	-->

	<h1 id="header">Online Shopping Site</h1>
	<div id="wrapper">
		<div ng-controller="myCtrl2">

			<table border=5px>
				<tr ng-repeat="result in results">
					<td>{{result.category.categoryId}}</td>
					<td>{{result.category.categoryName}}</td>
					<td>{{result.category.categoryPosition}}</td>
					<td><img src="{{result.category.categoryImage}}"></td>
					<td><button ng-click="deleteCategory(result.category)">Delete</button></td>
					<td><button ng-click="editCategory(result.category)">Edit</button></td>
				</tr>
			</table>
			
			
			<p>
				<h2>Add/Edit Category</h2>
			</p>
				
			<table border=5px>
			<tr>
			<td>Category Name :</td> <td><input type="text" /></td>
			</tr>
			<tr>
			<td>Category Position :</td> <td><input type="text" /></td>
			</tr>
			</table>
		</div>
	</div>
	 </div>
 
    <div class="footer">Online Shopping   - Copyright © Divya Veerapandian</div>
  </div>
	
</body>
</html>