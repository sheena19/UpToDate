/**
 * Created by shahs on 2/26/2017.
 */


var option = "";
$.ajax({
    type: "GET",
    url: "http://localhost:8080/doctor" + "/getDoctorList",
    success: function (data, textStatus, jqXHR) {
        $.each(data, function (i, obj) {
            appendToSelect(data);
        });
        $("#display-doctor").append(option);
    },
    error: function (jqXHR, textStatus, errorThrown) {
        alert("Error in loading page!");
    }
});

function appendToSelect(data) {
    option += "<option>" + "Dr. " + data.firstName + " " + data.lastName + "</option>";
}


