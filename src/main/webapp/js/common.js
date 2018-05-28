$(document).ready(function(){
    var offsetToTop = 100;
    var $toTop = $('.my-to-top');

    $(window).on('scroll', function () {
        $toTop.toggleClass('my-to-top-on', window.pageYOffset > offsetToTop);
    });

    $toTop.on('click', function () {
        $('body').velocity('scroll');
    });
});