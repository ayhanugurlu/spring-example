angular.module('app.services', [])

.factory('demoFactory', ['$http',function($http){

		this.http = $http;

        this.login = function (loginRequest) {
            console.debug("login request");
            var req = {
                method: 'POST',
                url: 'http://localhost:8080/login/login',
                data: loginRequest
            };
            return this.http(req);
        };

        this.fligthList = function (token) {
            console.debug("get fligthList");
            var req = {
                method: 'GET',
                url: 'http://localhost:8080/flight/flightList/'+token

            };
            return this.http(req);
        };


        return this;


}])

.service('BlankService', [function(){

}]);