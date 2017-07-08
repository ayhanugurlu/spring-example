// angular application context wiring
(function () {
    'use strict';

    // create an angular module
    angular.module('AngularApplication', [
            'ngRoute',
            'pascalprecht.translate',
            'ngAlertify',
            'angularCSS'
        ])
        .run(function ($rootScope, Language) {
            $rootScope.Language = Language;
        });

})();