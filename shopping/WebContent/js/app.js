
//	var app = angular.module('app',[]);
//	app.controller('categoryController',function($scope, $hhtp){
//		$http.get('http://localhost:8080/shopping/rest/category').success(function(response){
////			$scope.listCategory = response;
//			$scope.list = [ { user: { address: { city: 'Boston'} } } ];
//			$scope.title = "Test";
//		}) ;
//	});



var app = angular.module('app', []);

app.controller('myCtrl', function ($scope) {
    $scope.results = [
        {birthDate: '01/08/1982'},
        {birthDate: '11/08/1992'},
        {birthDate: '21/08/2002'},
        {birthDate: '31/08/2012'}
    ]
});



app.controller('myCtrl1', function ($scope) {
    $scope.results = [
                      {"category":{"categoryId":"CAT_1234","categoryName":"Jewellery","categoryPosition":1,"categoryImage":"js/images/accessories.jpg"}},
                      {"category":{"categoryId":"CAT_1235","categoryName":"Toys","categoryPosition":2,"categoryImage":"js/images/clothing.jpg"}},
                      {"category":{"categoryId":"CAT_1236","categoryName":"Clothing","categoryPosition":3,"categoryImage":"js/images/clothing.jpg"}}]
});


app.controller('myCtrl2', function ($scope,$http) {
	$http({
		  method: 'GET',
		  url: 'http://localhost:8080/shopping/rest/category'
		}).then(function successCallback(response) {
			console.log(response);
			  $scope.results = response.data;
		  });
	$scope.deleteCategory = function(category) {
        $http({
  		  method: 'DELETE',
  		  url: 'http://localhost:8080/shopping/rest/category',
  		  data : category,
  		  headers : {
  	        'Content-Type' : 'application/json',
  	        'Accept': 'application/json'
  		  }
  		}).then(function successCallback(response) {
  			console.log(response);
  			  //$scope.results = response.data;
  		  });
    }
});


app.controller('myPrd', function ($scope,$http) {
	$http({
		  method: 'GET',
		  url: 'http://localhost:8080/shopping/rest/product'
		}).then(function successCallback(response) {
			console.log(response);
			  $scope.results = response.data;
		  });
});
