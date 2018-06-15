Config.$inject = ['$stateProvider', '$urlRouterProvider'];

function Config($stateProvider, $urlRouterProvider) {

    $stateProvider
        .state('index', {
            url: '/books',
            views: {
                "main": {
                    templateUrl: "js/main/main.html",
                    controller: 'MainCtr',
                    controllerAs: 'vm'
                }
            },
            resolve : {
                genres : function(APISrv) {
                    return APISrv.getAllGenres().then(function (response) {
                            if (response.data){
                                return response.data;
                            }
                        },
                        function (error) {

                        });
                },
                authors: function(APISrv) {
                    return APISrv.getAllAuthors().then(function (response) {
                            if (response.data) {
                                return response.data;
                            }
                        },
                        function (error) {
                        });
                }
            }
        })
        .state('book', {
            url: '/books/:bookId',
            views: {
                "main": {
                    templateUrl: "js/book/book.html",
                    controller: 'BookCtr',
                    controllerAs: 'vm'
                }
            },
            resolve : {
                book : function ($stateParams, APISrv) {
                    return APISrv.getBook($stateParams.bookId).then(function (response) {
                        return response.data;
                    })
                }
            }
        })
    ;

    $urlRouterProvider.otherwise("/books");

}

angular.module('App').config(Config);