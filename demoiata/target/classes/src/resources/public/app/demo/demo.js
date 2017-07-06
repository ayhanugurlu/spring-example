// angular application context wiring
(function () {
    'use strict';

    /* App Module */
    var app = angular.module('demo',[]);


    app.constant('urls', {
        BASE: 'http://localhost:8080/demo/',
        LOGIN: 'http://localhost:8080/demo/login',
    });

})();