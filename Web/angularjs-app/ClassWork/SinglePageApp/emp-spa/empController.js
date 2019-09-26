angular.module('emp.module')
    .controller('homeController', ['$rootScope', '$scope', 'empFactory', 'authService', function ($rootScope, $scope, empFactory, authService) {
        console.log("Inside Home")
        $scope.employees = []
        $scope.employees = empFactory.getEmployees()
        authService.isLogged = authService.getLoginStatus()
        console.log(authService.isLogged)
        if (authService.isLogged) {
            document.getElementById("logout").innerHTML = "Logout"
            console.log(authService.isLogged)
            $rootScope.username = authService.admin.username
            console.log("Inside if")
            console.log($rootScope.username)
        }
        if (!authService.isLogged) {
            console.log("Inside else")
            console.log(authService.isLogged)
            document.getElementById("logout").innerHTML = ""
        }
    }])
    .controller('addController', ['$scope', 'empFactory', 'authService', function ($scope, empFactory, authService) {
        $scope.jobs = []
        $scope.jobs = empFactory.jobs
        if (authService.isLogged) {
        $scope.addEmployee = function () {
            // $scope.id = Date.now().toString()
                var employee = new empFactory.Employee($scope.name, $scope.age, $scope.gender, $scope.job, $scope.salary)
                console.log(employee)
                empFactory.addEmployee(employee)
            }
        }
        else {
            window.location.href = "#/login"
        }
    }])
    .controller('deleteController', ['$scope', 'empFactory', '$mdDialog', 'authService', function ($scope, empFactory, $mdDialog, authService) {

        $scope.deleteEmployee = function (employeeId) {
            console.log("Inside delete")
            if (authService.isLogged) {
                showConfirm(employeeId)
            }
            if (!authService.isLogged) {
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
        if (!authService.isLogged) {
            window.location.href = "#/login"
        }
    }])

    .controller('loginController', ['$rootScope', '$scope', 'authService', function ($rootScope, $scope, authService) {
        $scope.empLogin = function () {
            if (authService.login($scope.username, $scope.password)) {
                document.getElementById("logout").innerHTML = "Logout"
                window.location.href = "#/home"
            }
        }

        $scope.empLogout = function () {
            console.log("Inside empLogout()")
            authService.logout()
            $rootScope.username = ""
            document.getElementById("logout").innerHTML = ""

        }

    }])