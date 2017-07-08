(function () {
    'use strict';

    /* Factory */

    angular
        .module('demo')
        .factory('demoFactory', DemoFactory);

    function DemoFactory($http,urls) {

        this.http = $http;

        this.login = function (loginRequest) {
            console.debug("login request");
            var req = {
                method: 'POST',
                url: urls.LOGIN,
                data: loginRequest
            };
            return this.http(req);
        };


        return this;

    }


})();
