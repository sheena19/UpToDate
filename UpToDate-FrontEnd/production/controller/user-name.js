/**
 * Created by shahs on 2/26/2017.
 */

//Populating Patient Name
var name = "";
$.ajax({
    type: "GET",
    url: "http://localhost:8080/patient" + "/getPatientName/" + sessionStorage.userId,
    success: function (data, textStatus, jqXHR) {
        $.each(data, function (i, obj) {
            appendPatientName(obj);
        });
        $(".patient-name").text(name);
    },
    error: function (jqXHR, textStatus, errorThrown) {
        alert("Error in loading page!");
    }
});

function appendPatientName(obj) {
    name += obj.firstName;
}

//Populating Doctor Name
$.ajax({
    type: "GET",
    url: "http://localhost:8080/doctor" + "/getDoctorName/" + sessionStorage.userId,
    success: function (data, textStatus, jqXHR) {
        $.each(data, function (i, obj) {
            appendDoctorName(obj);
        });
        $(".doctor-name").text(name);
    },
    error: function (jqXHR, textStatus, errorThrown) {
        alert("Error in loading page!");
    }
});

function appendDoctorName(obj) {
    name += obj.firstName;
}