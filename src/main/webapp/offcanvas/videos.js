/**
 * Created by Show on 2017/5/17.
 */
var app4 = angular.module('VideoView', ['ui.bootstrap']);
app4.controller('keywordCtrl',function($scope,$http){
        // $http
        $scope.autoCreate=function () {
            console.log("123");
            var btnhtml;
            for(var i=0;i<10;i++) {
                btnhtml+='<button class="list-group-item btn btn-primary active" type="button"> Messages'+i+' <span class="badge">4</span> </button>'
            }
            var temp = $compile(btnhtml)($scope);
            angular.element(document.getElementById('keywordList')).append(temp);
        };
    })
    .controller('VideoViewCtrl', function ($scope, $http,$log) {
    var params = { "totalPages": 0,
        "currentPage": 1,
        "viewBy": 20,
        "condition": "%"};
    $http.post("/api/85/page",params).then(function (response) {
        $scope.videos=response.data;
        console.log($scope.videos);
        $scope.totalItems =  $scope.videos.totalItems;
        $scope.currentPage = $scope.videos.currentPage;
        $scope.viewby = $scope.videos.viewBy;
        $scope.maxSize =10;
        $scope.bigTotalItems =$scope.videos.totalItems;
        $scope.bigCurrentPage = 1;
        $scope.itemsPerPage = $scope.viewby;
        $scope.numPages=$scope.videos.pages;
        $scope.totalPage=$scope.videos.pages;
        $scope.videoList=$scope.videos.porn85Views;
    });
    $scope.setPage = function (pageNo) {
        var params = { "totalPages": 0,
            "currentPage": pageNo,
            "viewBy": 20,
            "condition": searchText.value};
        $http.post("/api/85/page",params).then(function (response) {
            $scope.videoList = response.data.porn85Views;
            console.log($scope.videoList);
            // console.log(response.data);
            $scope.currentPage = response.data.currentPage;
            $scope.bigCurrentPage = pageNo;
            $scope.bigTotalItems = response.data.totalItems;
            $scope.numPages = response.data.pages;
            $scope.totalPage= response.data.pages;
        });

    };

    $scope.pageChanged = function () {
        $log.log('Page changed to: ' + $scope.currentPage);
    };
    $scope.next=function ($event) {
        if($scope.currentPage<$scope.numPages){
            $scope.currentPage=$scope.currentPage+1;
            $scope.setPage($scope.currentPage);
        }

    };
    $scope.prev=function ($event) {
        if($scope.currentPage>1){
            $scope.currentPage=$scope.currentPage-1;
            $scope.setPage($scope.currentPage);
        }

    };

})
    .controller('searchCtrl',['$scope','$timeout',function($scope,$timeout){
        $scope.remove = false;
        $scope.search=true;
        $scope.editing = false;
        $scope.typing = function(){
            $scope.search = false;
            $scope.editing = true;
            $timeout(operation,1000);

        }
        $scope.removeIcon = function(){
            $scope.remove = false;
            $scope.search = true;
            $scope.searchText = '';
        }
        function operation(){
            //perform operation
            $scope.editing = false;
            $scope.remove = true;
        }
    }]);



