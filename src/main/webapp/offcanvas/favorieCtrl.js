/**
 *
 * Created by root on 2017/4/11.
 */
var app2 = angular.module('JSPager', ['ui.bootstrap']);
app2.controller('PagerDemoCtrl', function ($scope, $http,$log) {
    $http.post("/api/ed6429e4a6907d5653b4629582c0796c").then(function (response) {
        $scope.videos=response.data;
        console.log($scope.videos.length);
        $scope.totalItems =  $scope.videos.length;
        $scope.currentPage = 1;
        $scope.viewby = 20;
        $scope.maxSize =10;
        $scope.bigTotalItems =$scope.videos.length;
        $scope.bigCurrentPage = 1;
        $scope.itemsPerPage = $scope.viewby;
        $scope.numPages=Math.ceil($scope.bigTotalItems/$scope.viewby);
        $scope.totalPage=Math.ceil($scope.bigTotalItems/$scope.viewby);
        $scope.videoList=$scope.videos.slice(0,$scope.viewby);
    });
    $scope.setPage = function (pageNo) {
        var start,end;
        if(pageNo==1){
            start=0;
        }else{
            start=(pageNo-1) * $scope.viewby;
        }
        if(pageNo==$scope.numPages){
            end=$scope.videos.length;
        }else{
            end=(pageNo)*$scope.viewby;
        }
        $scope.videoList =$scope.videos.slice(start,end );
        console.log("start:"+start+",end:"+end);
        console.log($scope.videoList);
        $scope.currentPage = pageNo;
    };

    $scope.pageChanged = function () {
        $log.log('Page changed to: ' + $scope.currentPage);
    };

});
