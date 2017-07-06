angular.module('app.services', [])

.factory('demoFactory', ['$http',function($http){

		this.http = $http;

        this.login = function (loginRequest) {
            console.debug("login request");
            var req = {
                method: 'POST',
                url: 'http://localhost:8080/demo/login',
                data: loginRequest
            };
            return this.http(req);
        };


        return this;


}])

.service('BlankService', [function(){

}]);