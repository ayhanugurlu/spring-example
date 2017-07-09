angular.module('app.services', [])

.factory('demoFactory', ['$http',function($http){

		this.http = $http;

        this.login = function (loginRequest) {
            console.debug("login request");
            var req = {
                method: 'POST',
                url: 'http://95.85.19.116:8080/demo/login/login',
                data: loginRequest
            };
            return this.http(req);
        };

        this.fligthList = function (token) {
            console.debug("get fligthList");
            var req = {
                method: 'GET',
                url: 'http://95.85.19.116:8080/demo/flight/flightList/'+token

            };
            return this.http(req);
        };
		
		this.pnlCheck = function (pnlRequest,token) {
            console.debug("login request");
            var req = {
                method: 'POST',
                url: 'http://95.85.19.116:8080/demo/pnl/check/'+token,
                data: pnlRequest
            };
            return this.http(req);
        };
		
		this.autoCheck = function (token) {
            console.debug("get autoCheck");
            var req = {
                method: 'GET',
                url: 'http://95.85.19.116:8080/demo/autoCheck/check/'+token

            };
            return this.http(req);
        };


        return this;


}])

.service('BlankService', [function(){

}]);