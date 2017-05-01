$(document).ready(function () {
    <!-- Patient -->
    $("#login-form").submit(function (e) {
        e.preventDefault();
        //REST call for patient login
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/patient" + "/login",
            data: $(this).serialize(),
            success: function (data, textStatus, jqXHR) {
                redirectToHome(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                window.location.href = "../production/page_404.html";
            }
        });
    });

    function redirectToHome(data) {
        if (data.message == "yes") {
            if (typeof(Storage) !== "undefined") {
                sessionStorage.userId = data.uniqueId;
                window.location.href = "../production/home_patient.html";
            } else {
                alert("No Storage support in your browser. Use a latest browser.");
            }
        } else {
            alert(data.message);
        }
    }

    <!-- Doctor -->
    $("#doctor-login").submit(function (e) {
        e.preventDefault();
        //REST call for doctor login
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/doctor" + "/login",
            data: $(this).serialize(),
            success: function (data, textStatus, jqXHR) {
                redirectToDoctorHome(data);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                window.location.href = "../production/page_404.html";
            }
        });
    });

    function redirectToDoctorHome(data) {
        if (data.message == "yes") {
            if (typeof(Storage) !== "undefined") {
                sessionStorage.userId = data.uniqueId;
                window.location.href = "../production/home_doctor.html";
            } else {
                alert("No Storage support in your browser. Use a latest browser.");
            }
        } else {
            alert(data.message);
        }
    }
});



