$(document).ready(function () {
    $('#logout').click(function (e) {
    if (typeof(Storage) !== "undefined") {
        sessionStorage.clear();
        window.location.href = "../index.html";
    }
    else {
        window.location.href = "../production/page_404.html";
    }
    })
});