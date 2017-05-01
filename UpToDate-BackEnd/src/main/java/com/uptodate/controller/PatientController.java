package com.uptodate.controller;

import com.uptodate.entity.Response;
import com.uptodate.repository.PatientRepository;
import com.uptodate.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/patient")
public class PatientController {

    @Autowired
    PatientRepository patientRepository;
    Patient patient;

    @CrossOrigin(origins = "http://localhost:63342")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Response patientLogin(@RequestParam(value = "pat_email_id") String email, @RequestParam(value = "pat_password") String password) {
        if (patientRepository.findByEmail(email) != null) {
            patient = patientRepository.findByEmail(email);
            if (patient.getPassword().equals(password)) {
                return new Response("yes",patient.getUniqueId());
            } else {
                return new Response("Invalid Input");
            }
        } else
            return new Response("Error!");
    }

    public String generateUniqueId(){
            return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Response patientCreate(@RequestParam(value = "pat_first_name") String firstName,
                                  @RequestParam(value = "pat_last_name") String lastName,
                                  @RequestParam(value = "pat_mobile_number") String telephone,
                                  @RequestParam(value = "pat_email_id") String email,
                                  @RequestParam(value = "pat_password") String password) {
        if (patientRepository.findByEmail(email) != null){
            return new Response("User Already Exists!");
        }
        else{
            String id = generateUniqueId();
            patientRepository.save(new Patient(id, email, password, lastName, firstName, telephone));
            return new Response("Successfully Register!", id);
        }
    }

    @CrossOrigin(origins = "http://localhost:63342")
    @RequestMapping(value = "/getPatientName/{userId}", method = RequestMethod.GET)
    public List<Patient> getPatientName(@PathVariable(value = "userId") String userId){
        return patientRepository.findByUniqueId(userId);
    }
}
