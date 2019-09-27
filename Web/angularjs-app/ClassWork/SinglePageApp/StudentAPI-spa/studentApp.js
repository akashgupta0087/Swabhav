angular.module('studentModule',['ngRoute','ngMaterial'])
.config(['$routeProvider',function($routeProvider){
    console.log("Inside config")
    $routeProvider.when('/',{
        templateUrl: "studentFragments/homeStudent.html",
        controller: "homeController"
    })
    .when('/home',{
        templateUrl: "studentFragments/homeStudent.html",
        controller: "homeController"
    })
    .when('/add',{
        templateUrl: "studentFragments/addStudent.html",
        controller: "addController"
    })
    .when('/update/:studentId',{
        templateUrl: "studentFragments/updateStudent.html",
        controller: "updateController"
    })
}])