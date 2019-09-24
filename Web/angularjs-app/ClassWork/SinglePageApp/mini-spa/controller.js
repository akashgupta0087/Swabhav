angular.module('spa.module')
.controller('homeController',['$scope',function($scope){
    $scope.home = {
        data: "Welcome to home"
    }
}])
.controller('aboutController',['$scope',function($scope){
    $scope.about = {
        data: "Welcome to about"
    }
}])
.controller('careerController',['$scope',function($scope){
    $scope.career = {
        data: "Welcome to career"
    }
}])