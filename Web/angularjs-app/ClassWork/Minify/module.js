
angular.module('modA', ['modB'])
    .controller('controllerA', ['$rootScope', '$scope', function ($rootScope, $scope) {
        console.log("Inside controller A")
        $scope.msg = "Controller A says Hello"
        $rootScope.company = "Aurion Pro"
    }]);

angular.module('modB', [])
    .controller('controllerB',['$rootScope', '$scope', function ($rootScope, $scope) {
        console.log("Inside controller B")
        console.log($rootScope)
        $scope.msg = "Controller B says Hello"
    }]);
