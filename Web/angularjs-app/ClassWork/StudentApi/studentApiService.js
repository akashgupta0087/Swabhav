angular.module('studentModule', [])
    .factory('studentFactory', ['$http','$log', function ($http,$log) {
        var factory = {}
        factory.value = 0

        factory.getStudents = function () {
            $http.get("http://numbersapi.com/100")
                .then(function success(response){
                   factory.value = response.data
                   $log.info(response.data)
                   $log.info(factory.value)
                   $log.info(response)

                })
                return factory.value
        }

        return factory
    }])
    

    // "http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students"