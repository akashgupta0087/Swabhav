angular.module('spa.module',['ngRoute'])
.config(['$routeProvider',function($routeProvider){
    console.log("Inside config")
    $routeProvider.when('/',{
        templateUrl : "fragments/home.html",
        controller : "homeController"         // if we write controller over here then, no need to write in home.html and vice-versa
    })
    .when('/home',{
        templateUrl : "fragments/home.html",
        controller : "homeController"
    })
    .when('/about',{
        templateUrl : "fragments/about.html",
        controller : "aboutController"
    })
    .when('/career',{
        templateUrl : "fragments/career.html",
        controller : "careerController"
    })
}])