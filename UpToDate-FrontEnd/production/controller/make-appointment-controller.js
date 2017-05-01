/**
 * Created by shahs on 3/2/2017.
 */
var option = "";
$(document).ready(function () {
    $("#uniqueId").val(sessionStorage.userId);
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/doctor" + "/getDoctorList",
        success: function (data, textStatus, jqXHR) {
            $.each(data, function (i, obj) {
                appendToSelect(obj);
            });
            $("#display-doctor").append(option);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert("Error in loading page!");
        }
    });

    function appendToSelect(obj) {
        var valueName = "Dr. " + obj.firstName + " " + obj.lastName;
        option += "<option value='" + valueName + "'>" + valueName + "</option>";
    }

    $("#demo-form2").submit(function (e) {
        e.preventDefault();
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/appointment" + "/make",
            data: $(this).serialize(),
            success: function (data, textStatus, jqXHR) {
                alert(data.message);
            },
            error: function (jqXHR, textStatus, errorThrown) {
                alert("Error in loading page!");
            }
        })
        ;
    });
});