/**
 * Created by root on 2017/4/7.
 */
var app = angular.module('websitesApp', []);
app.controller('websitesCtrl', function($scope, $http) {
    $http.get("/api/websites/getall")
        .then(function(response) {
            $scope.websiteList = response.data;
            //替換
            angular.forEach($scope.websiteList,function (v,k) {
                if(v.imgurl==null||v.imgurl.indexOf("/")!=-1||v.imgurl.indexOf(":")!=-1){

                }else{
                    $scope.websiteList[k].imgurl= "../pic/website/"+v.imgurl;
                }
            });
        });
});