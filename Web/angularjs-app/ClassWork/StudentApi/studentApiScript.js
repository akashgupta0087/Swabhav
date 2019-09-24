angular.module('studentModule')
    .controller('studentController', ['$scope', 'studentFactory', function ($scope, studentFactory) {
        $scope.students = []
        studentFactory.getStudents().then(function (response) {
            $scope.students = response.data
        })

        function Student(rollNo, name, age, email, date, isMale) {
            this.rollNo = rollNo
            this.name = name
            this.age = age
            this.email = email
            let formattedDate = date.getFullYear() + "-" + ("0" + (date.getMonth() + 1)).slice(-2) + "-" + ("0" + date.getDate()).slice(-2);
            this.date = formattedDate
            this.isMale = isMale
        }

        $scope.addStudent = function () {
            console.log("Inside addStudent()")
            var student = new Student($scope.rollNo, $scope.name, $scope.age, $scope.email, $scope.date, $scope.gender)
            studentFactory.addStudent(student).then(function (response) {
                alert("Student added")
                $scope.clearFormData()
                studentFactory.getStudents().then(function (response) {
                    $scope.students = response.data
                })
            })
        }

        $scope.getGender = function (isMale) {
            if (isMale)
                return "Male"
            else
                return "Female"
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
