angular.module('emp.module',['ngRoute','ngMaterial'])
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
    // .when('/delete/:empId',{
    //     templateUrl: "empFragments/delete.html",
    //     controller: "deleteController"
    // })
    .when('/update/:empId',{
        templateUrl: 'empFragments/update.html',
        controller: "updateController"
    })

    .when('/login',{
        templateUrl: "empFragments/login.html",
        controller: "loginController"
    })
    
}])