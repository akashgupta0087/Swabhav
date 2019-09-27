angular.module('studentModule')
    .controller('homeController', ['$scope', 'studentFactory', function ($scope, studentFactory) {
        $scope.students = []
        studentFactory.getStudents().then(function (response) {
            $scope.students = response.data
        })
        $scope.getGender = function (isMale) {
            if (isMale)
                return "Male"
            else
                return "Female"
        }
    }])
    .controller('addController', ['$scope', 'studentFactory', function ($scope, studentFactory) {
        $scope.addStudent = function () {
            console.log("Inside addStudent()")
            var student = new studentFactory.Student($scope.rollNo, $scope.name, $scope.age, $scope.email, $scope.date, $scope.gender)
            studentFactory.addStudent(student).then(function (response) {
                alert("Student added")
                $scope.clearFormData()
            })
        }

        $scope.clearFormData = function () {
            $scope.rollNo = ""
            $scope.name = ""
            $scope.age = ""
            $scope.email = ""
            $scope.date = ""
            $scope.gender = ""
        }
    }])
    .controller('updateController', ['$scope', 'studentFactory', '$routeParams', function ($scope, studentFactory, $routeParams) {
        studentFactory.getStudentById($routeParams.studentId).then(function (response) {
            $scope.student = response.data         // Response data returns an array
            $scope.rollNo = $scope.student[0].rollNo
            $scope.name = $scope.student[0].name
            $scope.age = $scope.student[0].age
            $scope.email = $scope.student[0].email
            $scope.date = new Date($scope.student[0].date)
            // console.log(new Date($scope.student[0].date).format("YYYY-MM-DD"))
            // var gender = $scope.getGender($scope.student[0].isMale)
            $scope.gender = $scope.student[0].isMale+''
            // $scope.gender = false
        })

        $scope.updateStudent = function () {
            var updatedStudent = angular.copy($scope.student[0])
            updatedStudent.rollNo = $scope.rollNo
            updatedStudent.name = $scope.name
            updatedStudent.age = $scope.age
            updatedStudent.email = $scope.email
            let formattedDate = $scope.date.getFullYear() + "-" + ("0" + ($scope.date.getMonth() + 1)).slice(-2) + "-" + ("0" + $scope.date.getDate()).slice(-2);
            updatedStudent.date = formattedDate
            updatedStudent.isMale = $scope.gender

            studentFactory.updateStudent(updatedStudent).then(function (response) {
                alert("Student data updated")
                window.location.href = "#/home"
            })
        }
    }])
    .controller('deleteController', ['$scope', 'studentFactory', '$mdDialog', function ($scope, studentFactory, $mdDialog) {
        
        $scope.deleteStudent = function(studentId){
            showConfirm(studentId)
        }

        var showConfirm = function (studentId) {
            var confirm = $mdDialog.confirm()
                .title('Are you sure to delete the record?')
                .textContent('Record will be deleted permanently.')
                .ok('Yes')
                .cancel('No');
            $mdDialog.show(confirm).then(function () {
                studentFactory.deleteStudent(studentId).then(function(response){
                    window.location.href = "#/home"
                })
            });
        };
    
    }])