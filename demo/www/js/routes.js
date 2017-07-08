angular.module('app.routes', [])

.config(function($stateProvider, $urlRouterProvider) {

  // Ionic uses AngularUI Router which uses the concept of states
  // Learn more here: https://github.com/angular-ui/ui-router
  // Set up the various states which the app can be in.
  // Each state's controller can be found in controllers.js
  $stateProvider
    

      .state('iATATimaticMobileLogin', {
    url: '/login',
    templateUrl: 'templates/iATATimaticMobileLogin.html',
    controller: 'iATATimaticMobileLoginCtrl'
  })

  .state('iATATimaticMobileHome', {
    url: '/home',
    templateUrl: 'templates/iATATimaticMobileHome.html',
    controller: 'iATATimaticMobileHomeCtrl',
      params: {
          obj: null,
          token:null

      }
  })

  .state('page3', {
    url: '/passportScanSuccess',
    templateUrl: 'templates/page3.html',
    controller: 'page3Ctrl',
	params: {
        obj: null   

    }
  })

  .state('page5', {
    url: '/autoCheckSuccesfull',
    templateUrl: 'templates/page5.html',
    controller: 'page5Ctrl'
  })

  .state('flightList', {
          url: '/flightList',
          templateUrl: 'templates/flightList.html',
          controller: 'flightListCtrl',
          params: {
              obj: null,
              token:null

          }
      })

$urlRouterProvider.otherwise('/login')


});