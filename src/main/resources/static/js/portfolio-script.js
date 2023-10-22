$(document).ready(function() {
    var header = $(".header");
    var content = $(".post-container");

    var headerHeight = header.outerHeight();

    // Устанавливаем отступ для контента, чтобы избежать перекрытия заголовком
    content.css("margin-top", headerHeight + "px");

    // Добавляем слушатель события прокрутки страницы
    $(window).on("scroll", function() {
        if ($(window).scrollTop() >= headerHeight) {
            header.addClass("fixed");
        } else {
            header.removeClass("fixed");
        }
    });
});