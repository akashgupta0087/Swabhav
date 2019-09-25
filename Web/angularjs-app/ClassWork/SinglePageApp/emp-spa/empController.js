angular.module('emp.module')
    .controller('homeController', ['$rootScope', '$scope', 'empFactory', 'authService', function ($rootScope, $scope, empFactory, authService) {
        console.log("Inside Home")
        $scope.employees = []
        $scope.employees = empFactory.getEmployees()
        if (authService.isLogged) {
            console.log(authService.isLogged)
            $rootScope.username = authService.admin.username
            console.log($rootScope.username)
        }
    }])
    .controller('addController', ['$scope', 'empFactory', function ($scope, empFactory) {
        $scope.jobs = []
        $scope.jobs = empFactory.jobs

        $scope.addEmployee = function () {
            // $scope.id = Date.now().toString()
            var employee = new empFactory.Employee($scope.name, $scope.age, $scope.gender, $scope.job, $scope.salary)
            console.log(employee)
            empFactory.addEmployee(employee)
        }
    }])
    .controller('deleteController', ['$scope', 'empFactory', '$mdDialog', 'authService', function ($scope, empFactory, $mdDialog, authService) {

        $scope.deleteEmployee = function (employeeId) {
            console.log("Inside delete")
            if (authService.isLogged) {
                showConfirm(employeeId)
            }
            else {
                window.location.href = "#/login"
            }
        }

        var showConfirm = function (employeeId) {
            var confirm = $mdDialog.confirm()
                .title('Are you sure to delete the record?')
                .textContent('Record will be deleted permanently.')
                .ok('Yes')
                .cancel('No');
            $mdDialog.show(confirm).then(function () {
                empFactory.deleteEmployee(employeeId)
            });
        };


    }])

    .controller('updateController', ['$scope', '$routeParams', 'empFactory', 'authService', function ($scope, $routeParams, empFactory, authService) {
        if (authService.isLogged) {
            $scope.jobs = []
            $scope.jobs = empFactory.jobs

            $scope.employee = empFactory.getEmployee($routeParams.empId)
            $scope.name = $scope.employee.name
            $scope.age = $scope.employee.age
            $scope.job = $scope.employee.job
            $scope.salary = $scope.employee.salary
            $scope.gender = $scope.employee.gender

            $scope.updateEmployee = function () {
                var updatedEmp = angular.copy($scope.employee)  //Clonning
                updatedEmp.name = $scope.name
                updatedEmp.age = $scope.age
                updatedEmp.job = $scope.job
                updatedEmp.salary = $scope.salary
                updatedEmp.gender = $scope.gender

                empFactory.updateEmployee(updatedEmp)
                // var employee = new empFactory.Employee($scope.employee.id,$scope.name,$scope.age,$scope.gender,$scope.job,$scope.salary)
                // empFactory.updateEmployee(employee)
                window.location.href = "#/home"
            }
        }
        else {
            window.location.href = "#/login"
        }
    }])

    .controller('loginController', ['$scope', 'authService', function ($scope, authService) {
        $scope.validate = function () {
            if ($scope.username == authService.admin.username && $scope.password == authService.admin.password) {
                alert("Success")
                authService.isLogged = true
                window.location.href = "#/home"
            }
            else
                alert("Failure")
        }
    }])