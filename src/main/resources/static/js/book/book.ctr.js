function BookCtr($stateParams, APISrv, book) {
    var vm = this;
    vm.book = book;
    vm.mode = 'view';


}

angular.module('App').controller('BookCtr', BookCtr);