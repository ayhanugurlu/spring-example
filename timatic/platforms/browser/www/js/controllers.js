angular.module('app.controllers', [])
  
.controller('iATATimaticMobileLoginCtrl', function ($scope, $state, $stateParams, demoFactory) {

    // Define initial values
        $scope.username= '';
      //  $scope.loginReq = new LoginRequest();
        $scope.inputPattern = /^\s*\w*\s*$/;

        $scope.demoFactory = demoFactory;


        /**
         * public
         */
        $scope.login = function () {
            console.debug("call logın service ");
            console.debug($scope.loginReq);
            $scope.demoFactory.login($scope.loginReq).success(function (data) {
                console.debug("Got response data from server, response message: " + data);
				if(data.name!== null){
					$state.go('iATATimaticMobileHome', {userName: data.name});	
				}else{
					console.debug("ayhan ");
				}
				
                
				
            }).error(function (data, status) {
                var errorMessage = 'Unable to load metrics, data: ' + data + ' status: ' + status;
                console.debug(errorMessage);
            });

        };


})
   
.controller('iATATimaticMobileHomeCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])
   
.controller('page3Ctrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])
   
.controller('page5Ctrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])
 