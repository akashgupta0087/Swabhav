angular.module('emp.module',['ngRoute'])
.config(['$routeProvider',function($routeProvider){
    console.log("Inside config")
    $routeProvider.when('/',{
        templateUrl: "empFragments/home.html",
        controller: "homeController"
    })
    .when('/home',{
        templateUrl: "empFragments/home.html",
        controller: "homeController"
    })
    .when('/add',{
        templateUrl: "empFragments/add.html",
        controller: "addController"
    })
    
}])