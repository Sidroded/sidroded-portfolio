document.addEventListener("DOMContentLoaded", function() {
    var alertDiv = document.querySelector(".alert-about-1");
    var audio = document.getElementById("alert-audio");

    setTimeout(function() {
        alertDiv.classList.remove("hidden");
        audio.play();
    }, 2000);
});

document.addEventListener("DOMContentLoaded", function() {
    var alertDiv = document.querySelector(".alert-about-2");
    var audio = document.getElementById("alert-audio");

    setTimeout(function() {
        alertDiv.classList.remove("hidden");
        audio.play();
    }, 5000);
});

document.addEventListener("DOMContentLoaded", function() {
    var alertDiv = document.querySelector(".alert-about-3");
    var audio = document.getElementById("alert-audio");

    setTimeout(function() {
        alertDiv.classList.remove("hidden");
        audio.play();
    }, 8000);
});

