APISrv.$inject = ['$http'];

function APISrv($http) {

    var server_uri = "";
    var service = {
        getAllGenres : getAllGenres,
        getAllAuthors : getAllAuthors,
        getBooks : getBooks,
        getBooksBy : getBooksBy,
        getBook : getBook
    };

    return service;

    function getAllGenres() {
        return $http.get(server_uri + '/genres');
    }

    function getAllAuthors() {
        return $http.get(server_uri + '/authors');
    }

    function getBooks() {
        return $http.get(server_uri + '/books');
    }
    /*lookup - name of relationship (genre/author)
    * */
    function getBooksBy(lookup, id) {
        return $http.get(server_uri + '/books?' + lookup + '=' + id);
    }

    function getBook(id) {
        return $http.get(server_uri + '/books/' + id);
    }

}

angular.module('App').service('APISrv', APISrv);