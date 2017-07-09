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
					navigator.notification.alert('invalid password or invalid user name', null, 'ERROR', 'OK');
				}
				
                
				
            }).error(function (data, status) {
                var errorMessage = 'Unable to load login, data: ' + data + ' status: ' + status;
                console.debug(errorMessage);
            });

        };


})
   
.controller('iATATimaticMobileHomeCtrl', ['$scope','$state', '$stateParams','$timeout','demoFactory', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope,$state, $stateParams,$timeout,demoFactory) {
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
	
	
	$scope.openCameraAndOcr = function(){
			
			   
			$scope.text = 'ayhan ugurlu';
			navigator.camera.getPicture(onSuccess, onFail, { quality: 50,
			destinationType: Camera.DestinationType.DATA_URL });

			function onSuccess(imageData) {	
				
				
				
			  $scope.image = imageData;
			  
			  $timeout(function() {
				// DOM has finished rendering
				// insert here the call to TesseractPlugin.recognizeText function to recognize the text
				
				/*
				 TesseractPlugin.loadLanguage('eng', function(response) {
					navigator.notification.alert($scope.image, null, 'ERROR', 'OK');
					TesseractPlugin.recognizeText($scope.image, 'eng',  function(recognizedText) {
						$scope.text = recognizedText;
						navigator.notification.alert(recognizedText, null, 'ERROR', 'OK');
						$state.go('page3', {"obj": $scope.text});				  						
					},function(reason) {
						console.log('Error on recognizing text from image. ' + reason);
					
						navigator.notification.alert('faıl'+reason, null, 'ERROR', 'OK');
															
					} );
					
									  						
					
					
				}, function(reason) {
					 navigator.notification.alert('Error on loading OCR file for your language. ' + reason, null, 'ERROR', 'OK');
				 
				});
				*/
				function onPrompt(results) {
					if(results.buttonIndex === 1){
					$state.go('page3', {"obj": results.input1,"token": $scope.token});	
					}else{
						navigator.notification.alert("Operation canceled..");
					}
					
				}
				
				navigator.notification.prompt(
					'Please enter passenger information',  // message
					onPrompt,                  // callback to invoke
					'Passnger Information',            // title
					['Ok','Exit'],             // buttonLabels
					['PassportId','Full Name','Nationalıty']                // defaultText
					
				);
				
				
					
				//navigator.notification.alert('camera return success', null, 'INFO', 'OK');				
				
			  });
				
			}
			
				

			function onFail(message) {
				
				navigator.notification.alert('Failed because: ' + message, null, 'ERROR', 'OK');
			}
			
		};
		
		
		
		
		


}])
   
.controller('page3Ctrl', ['$scope', '$stateParams','demoFactory', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams,demoFactory) {
	 $scope.passpardData = $stateParams.obj;
	 $scope.token = $stateParams.token;
	 
	  $scope.demoFactory = demoFactory;


        /**
         * public
         */
        $scope.pnlCheck = function () {
            console.debug("call pnlCheck service ");
            var temp = $scope.passpardData.split(",")
			pnlRequest = new PnlRequest();
			console.log(temp);
			pnlRequest.passwordNumber = temp[0];
			pnlRequest.passengerFullName = temp[1];
			$scope.demoFactory.pnlCheck(pnlRequest,$scope.token).success(function (data) {
				if(data.resp === "OK"){
					$scope.passegerPnl = null;
					$scope.passegerAutoCheck = "ok";
					$scope.demoFactory.autoCheck($scope.token).success(function (data) {
						$state.go('page5', {"obj": results.input1,"token": data.token});
                	}).error(function (data, status) {
						var errorMessage = 'Unable to load pnlCheck, data: ' + data + ' status: ' + status;
						console.debug(errorMessage);
					});
				}else{
					$scope.passegerPnl ="ok";
				}
				
            }).error(function (data, status) {
                var errorMessage = 'Unable to load pnlCheck, data: ' + data + ' status: ' + status;
                console.debug(errorMessage);
            });

        };
	 
	 
	 
	 
    $scope.openBacodeReader = function(){
 
			 cordova.plugins.barcodeScanner.scan(
			  function (result) {
				  
				   navigator.notification.alert("We got a barcode\n" +
						"Result: " + result.text + "\n" +
						"Format: " + result.format + "\n" +
						"Cancelled: " + result.cancelled, null, 'ERROR', 'OK');
						
						
					$scope.passegerPnl = null;
					$scope.passegerAutoCheck = "ok";
					$scope.demoFactory.autoCheck($scope.token).success(function (data) {
						$state.go('page5', {"obj": results.input1,"token": data.token});
                	}).error(function (data, status) {
						var errorMessage = 'Unable to load pnlCheck, data: ' + data + ' status: ' + status;
						console.debug(errorMessage);
					});
						 
				
			  }, 
			  function (error) {
				  alert("Scanning failed: " + error);
				  navigator.notification.alert("Scanning failed: " + error, null, 'ERROR', 'OK');
			  }
		   );
	 };
	 
	 $scope.pnlCheck()

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
 