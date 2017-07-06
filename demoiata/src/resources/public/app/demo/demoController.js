// angular application context wiring
(function () {
    'use strict';
    angular.module('demo').controller('demoController', DemoController);

    /**
     *
     * @param $scope
     * @param $http
     * @param systemInfo
     * @constructor
     */
    function DemoController($scope, $location, demoFactory) {


        // Define initial values
        $scope.test= '';
        $scope.loginReq = new LoginRequest();
        $scope.inputPattern = /^\s*\w*\s*$/;

        this.demoFactory = demoFactory;


        /**
         * public
         */
        this.login = function (self) {
            console.debug("call logın service ");
            console.debug($scope.loginReq);
            this.demoFactory.login($scope.loginReq).success(function (data) {
                console.debug("Got response data from server, response message: " + data.message);
            }).error(function (data, status) {
                var errorMessage = 'Unable to load metrics, data: ' + data + ' status: ' + status;
                console.debug(errorMessage);
            });

        };


        $scope.controller = this;
        return this;
    }


})();