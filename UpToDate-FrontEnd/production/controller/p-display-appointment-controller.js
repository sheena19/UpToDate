/**
 * Created by shahs on 3/2/2017.
 */
var rows = "";
$(document).ready(function () {
    $.ajax({
        type: "GET",
        url: "http://localhost:8080/appointment" + "/getByPatientId/" + sessionStorage.userId,
        success: function (data, textStatus, jqXHR) {
            $.each(data, function (i, obj) {
                appendToDisplay(obj);
            });
            $("#display-patient-appointment").append(rows);
        },
        error: function (jqXHR, textStatus, errorThrown) {
            alert("Error in loading page!");
        }
    });
    function appendToDisplay(obj) {
        rows += "<tr><td>" + obj.appointmentId + "</td><td>" + obj.doctorFullName + "</td><td>" + obj.appointmentTime + "</td><td>" + obj.appointmentDate +
            "</td><td> <input type='button' value='Delete' class='delete-patient-appointment btn btn-danger'></td></tr>";
    }

    $(document).on('click', '.delete-patient-appointment', function () {
        var appointmentId = $(this).closest('tr').find('td:first').text();

        //REST call for removing an appointment
        $.ajax({
            type: "GET",
            url: "http://localhost:8080/appointment" + "/deleteAppointment/" + appointmentId,
            success: function (data, textStatus, jqXHR) {
                window.location.reload();
            },
            error: function (jqXHR, textStatus, errorThrown) {
                alert("Error in loading page!");
            }
        });
    });
});