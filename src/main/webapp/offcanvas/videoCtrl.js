/**
 *
 * Created by root on 2017/4/11.
 */
var x;
var app3=angular.module('JSVideosApp',[]);
app3
// app3.directive('swfTemplate', function(
// ){
//     return {
//         link: function(scope, element, attrs) {
//             element.html('<div class="video-container" style="height: 597px;"><param name="movie" value="' + scope.swf + '"><embed src="' + scope.swf + '"  type="application/x-shockwave-flash" width="100%" height="100%" bgcolor="#ececec" quality="high" allowfullscreen="true" allowscriptaccess="always" wmode="opaque"></embed></div>');
//             // element.html('<object><param name="movie" value="' + scope.swf + '"><embed src="' + scope.swf + '"  type="application/x-shockwave-flash" width="100%" height="100%" bgcolor="#ececec" quality="high" allowfullscreen="true" allowscriptaccess="always" wmode="opaque"></embed></object>');
//         }
//     };
// })
// .directive('jwTemplate',function () {
//     var filmId=location.search.split('?')[1];
//     var url="http://www.85porn.net/media/nuevo/player.swf?config=http://www.85porn.net/media/nuevo/config.php?key=" +  filmId + "-0-1";
//     var player = jwplayer('player');
//     player.setup({
//         file: url,
//         image: "//content.jwplatform.com/thumbs/xJ7Wcodt-720.jpg"
//     });
//     return {
//         link: function(scope, element, attrs) {
//             element.html('<div class="video-container" style="height: 597px;"><param name="movie" value="' + scope.swf + '"><embed src="' + scope.swf + '"  type="application/x-shockwave-flash" width="100%" height="100%" bgcolor="#ececec" quality="high" allowfullscreen="true" allowscriptaccess="always" wmode="opaque"></embed></div>');
//             // element.html('<object><param name="movie" value="' + scope.swf + '"><embed src="' + scope.swf + '"  type="application/x-shockwave-flash" width="100%" height="100%" bgcolor="#ececec" quality="high" allowfullscreen="true" allowscriptaccess="always" wmode="opaque"></embed></object>');
//         }
//     };
// })
    .directive('onIframe',function ($scope) {
        return{

        }
    })
    .controller('VideoDetailCtrl',function ($scope, $sce, $http) {
        var filmId=location.search.split('?')[1];
        var url="https://www.85porn.com/embed/"+filmId;
        $http.get("../api/85/"+filmId).then(function (response) {
            $scope.datas=response.data;
            x = response.data;
            console.log(response.data);
            var yy=response.data.imgUrl;
            $scope.videoStyle ="display: block;background-size:contain;background-image: url("+ yy+");background-repeat:no-repeat;border:none;position:absolute;top:120px;left:0;width:749px;height:421px;";
        });

        // $scope.embedUrl='<iframe src='+url+'style=\"width:100%;height:100%;\"></iframe>'
        $scope.embedUrl = $sce.trustAsResourceUrl(url);

    })

// .controller('MainCtrl', function(
// ){
//     var filmId=location.search.split('?')[1];
//     // var url="http://www.85porn.net/media/nuevo/player.swf?config=http://www.85porn.net/media/nuevo/config.php?key=" +  filmId + "-0-1";
//     var url="https://www.85porn.com/embed/"+filmId;
//
//     console.log(url);
//     this.swfs = [
//         // "http://www.85porn.net/media/nuevo/config.php?key=2259-0-1",
//         url
//     ];
// });
;
// app3.directive('embedSrc', function () {
//     return {
//         restrict: 'A',
//         link: function (scope, element, attrs) {
//
//             var current = element;
//             scope.$watch(attrs.embedSrc, function () {
//                 var clone = element
//                     .clone()
//                     .attr('src', attrs.embedSrc);
//                 current.replaceWith(clone);
//                 current = clone;
//             });
//         }
//     };
// });
