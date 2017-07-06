angular.module('app.controllers', [])
  
.controller('iATATimaticMobileLoginCtrl', function ($scope, $state, $stateParams, demoFactory) {

    // Define initial values

        $scope.loginReq = new LoginRequest();
        $scope.inputPattern = /^\s*\w*\s*$/;

        $scope.demoFactory = demoFactory;


        /**
         * public
         */
        $scope.login = function () {
            console.debug("call logın service ");
            console.debug($scope.loginReq.username);
            console.debug($scope.loginReq.password);
            $scope.demoFactory.login($scope.loginReq).success(function (data) {
                console.debug("Got response data from server, response message: " + data);
				if(data.name!== null){
					$state.go('iATATimaticMobileHome', {"obj": data.name,"token": data.token});
				}else{
					console.debug("ayhan ");
				}
				
                
				
            }).error(function (data, status) {
                var errorMessage = 'Unable to load login, data: ' + data + ' status: ' + status;
                console.debug(errorMessage);
            });

        };


})
   
.controller('iATATimaticMobileHomeCtrl', ['$scope','$state', '$stateParams','demoFactory', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope,$state, $stateParams,demoFactory) {
    $scope.fullname = $stateParams.obj;
    $scope.token = $stateParams.token;
    $scope.demoFactory = demoFactory;
    /**
     * public
     */
    $scope.fligthList = function () {
        console.debug("call fligth service ");
        console.debug($scope.token);

        $scope.demoFactory.fligthList($scope.token).success(function (data) {
            console.debug("Got response data from server, response message: " + data);
            $state.go('flightList', {"obj": data,"token": $scope.token});

        }).error(function (data, status) {
            var errorMessage = 'Unable to load flight, data: ' + data + ' status: ' + status;
            console.debug(errorMessage);
        });

    };


}])
   
.controller('page3Ctrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])


.controller('flightListCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
        function ($scope, $stateParams) {
            $scope.flightData = $stateParams.obj;
            $scope.token = $stateParams.token;

            console.log( $scope.flightData );
        }])

.controller('page5Ctrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])
 