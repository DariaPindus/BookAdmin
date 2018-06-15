
function MainCtr(APISrv, authors, genres) {

    var vm = this;
    vm.authors = authors;
    vm.genres = genres;
    vm.books = [];

    init();

    function init() {
        APISrv.getBooks().then(function (response){
            if (response.data) {
                vm.books = response.data;
            }
        });
    }

    vm.filterChanged = function(type){
        var id = vm.filter;
        if (!id) {
            APISrv.getBooks().then(function (response){
                if (response.data) {
                    vm.books = response.data;
                }
            });
            return;
        }
        if (type == 'genre') {
            vm.author = '';
            APISrv.getBooksBy('genre', id).then(function (response){
                if (response.data) {
                    vm.books = response.data;
                }
            });
        }
        if (type == 'author') {
            vm.genre = '';
            APISrv.getBooksBy('author', id).then(function (response){
                if (response.data) {
                    vm.books = response.data;
                }
            });
        }
    }
}

angular.module('App').controller('MainCtr', MainCtr);