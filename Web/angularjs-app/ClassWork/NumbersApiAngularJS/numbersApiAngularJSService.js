
angular.module('numbersModule', [])
    .factory('numbersFactory', ['$http', '$q', function ($http, $q) {
        var factory = {}
        factory.facts = []
        factory.facts = localStorage.getItem("factsArrayAngular") ? JSON.parse(localStorage.getItem("factsArrayAngular")) : []

        factory.loadFacts = function (inputNumber) {
            return $q(function (resolve, reject) {
                var link = "http://numbersapi.com/" + inputNumber
                $http.get(link)
                    .then(function success(response) {
                        factory.facts.unshift(response.data)
                        localStorage.setItem("factsArrayAngular", JSON.stringify(factory.facts))
                        resolve(factory.facts)
                    },
                        function error(response) {
                            reject("Data not found")
                        })
                return factory.facts
            })

        }

        factory.loadPreviousFacts = function () {
            return $q(function(resolve,reject){
                resolve(factory.facts)
            }) 
        }

        return factory
    }])

