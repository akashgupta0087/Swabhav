angular.module('emp.module')
.controller('homeController',['$scope','empFactory',function($scope,empFactory){
    $scope.employees = []
    $scope.employees = empFactory.getEmployees()
    console.log($scope.employees)
}])
.controller('addController',['$scope','empFactory',function($scope,empFactory){
    $scope.jobs = ["Manager", "Programmer", "Analyst", "Clerk"]

    function Employee(id,name,age,gender,job,salary){
        this.id = id
        this.name = name
        this.age = age
        this.gender = gender
        this.job = job
        this.salary = salary
    }

    $scope.addEmployee = function(){
        $scope.id = Date.now().toString()
        var employee = new Employee($scope.id,$scope.name,$scope.age,$scope.gender,$scope.job,$scope.salary)
        console.log(employee)
        
    }
}])