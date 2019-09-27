angular.module('studentModule')
    .factory('studentFactory', ['$http','$log', function ($http,$log) {
        var factory = {}

        factory.Student = function(rollNo, name, age, email, date, isMale) {
            this.rollNo = rollNo
            this.name = name
            this.age = age
            this.email = email
            let formattedDate = date.getFullYear() + "-" + ("0" + (date.getMonth() + 1)).slice(-2) + "-" + ("0" + date.getDate()).slice(-2);
            this.date = formattedDate
            this.isMale = isMale
        }
       
        factory.getStudents = function () {
          return  $http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students")
        }

        factory.addStudent = function(data){
            return $http.post("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students",data)
        }

        factory.getStudentById = function(studentId){
            return  $http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+studentId)
        }

        factory.updateStudent = function(updatedStudent){
            return $http.put("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+updatedStudent.id,updatedStudent)
        }

        factory.deleteStudent = function(studentId){
            return $http.delete("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+studentId)
        }

        return factory
    }])