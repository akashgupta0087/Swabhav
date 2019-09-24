angular.module('studentModule', [])
    .factory('studentFactory', ['$http','$log', function ($http,$log) {
        var factory = {}
       
        factory.getStudents = function () {
          return  $http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students")
        }

        factory.addStudent = function(data){
            return $http.post("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students",data)
        }

        return factory
    }])
    