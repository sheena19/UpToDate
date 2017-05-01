package com.uptodate.controller;

import com.uptodate.entity.Appointment;
import com.uptodate.entity.Doctor;
import com.uptodate.entity.Patient;
import com.uptodate.entity.Response;
import com.uptodate.repository.AppointmentRepository;
import com.uptodate.repository.DoctorRepository;
import com.uptodate.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/appointment")
public class AppointmentController {

    @Autowired
    AppointmentRepository appointmentRepository;
    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    PatientRepository patientRepository;

    Appointment appointment;
    Doctor doctor;
    Patient patient;

    public String[] getSelectedDoctorName(String doctorFullName) {
        String[] doctorName = doctorFullName.split("\\s+");
        return doctorName;
    }

    @CrossOrigin(origins = "http://localhost:63342")
    @RequestMapping(value = "/make", method = RequestMethod.POST)
    public Response createAppointment(@RequestParam(value = "appointment_time") String appointmentTime,
                                      @RequestParam(value = "appointment_date") String appointmentDate,
                                      @RequestParam(value = "uniqueId") String patientUniqueId,
                                      @RequestParam(value = "doctorFullName") String doctorFullName) {
        String[] doctorName = getSelectedDoctorName(doctorFullName);
        doctor = doctorRepository.findByFirstNameAndLastName(doctorName[1], doctorName[2]);
        String doctorId = doctor.getId();

        patient = (Patient) patientRepository.findOne(patientUniqueId);
        String patientFirstName = patient.getFirstName();
        String patientLastName = patient.getLastName();
        String patientFullName = patientFirstName + " " + patientLastName;

        if (appointmentRepository.findByDocIdAndAppointmentDateAndAppointmentTime(doctorId, appointmentDate, appointmentTime) != null) {
            return new Response("Appointment not available! Try for another!");
        } else {
            appointmentRepository.save(new Appointment(doctorId, patientUniqueId, appointmentTime, appointmentDate, doctorFullName, patientFullName));
            return new Response("Appointment done!");
        }
    }

    @CrossOrigin(origins = "http://localhost:63342")
    @RequestMapping(value = "/getByPatientId/{userId}", method = RequestMethod.GET)
    public List<Appointment> displayAppointmentByPatientId(@PathVariable(value = "userId") String userId) {
        return appointmentRepository.findByPatientId(userId);
    }

    @CrossOrigin(origins = "http://localhost:63342")
    @RequestMapping(value = "/getByDocId/{uniqueId}", method = RequestMethod.GET)
    public List<Appointment> displayAppointmentByDocId(@PathVariable(value = "uniqueId") String uniqueId) {
        return appointmentRepository.findByDocId(uniqueId);
    }

    @CrossOrigin(origins = "http://localhost:63342")
    @RequestMapping(value = "/deleteAppointment/{id}", method = RequestMethod.GET)
    public void deleteAppointment(@PathVariable(value = "id") String id) {
        appointment = appointmentRepository.findOne(id);
        appointmentRepository.delete(appointment);
    }
}
