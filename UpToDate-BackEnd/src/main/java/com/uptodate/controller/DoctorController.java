package com.uptodate.controller;

import com.uptodate.entity.Doctor;
import com.uptodate.entity.Response;
import com.uptodate.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/doctor")
public class DoctorController {

    @Autowired
    DoctorRepository doctorRepository;

    Doctor doctor;
    List<Doctor> doctorList;

    @CrossOrigin(origins = "http://localhost:63342")
    @RequestMapping(value = "/getDoctorList", method = RequestMethod.GET)
    public List<Doctor> doctorList(){
        doctorList = (List<Doctor>) doctorRepository.findAll();
        return doctorList;
    }

    @CrossOrigin(origins = "http://localhost:63342")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Response doctorLogin(@RequestParam(value = "doc_email_id") String email, @RequestParam(value = "doc_password") String password) {
        if (doctorRepository.findByEmail(email) != null) {
            doctor = doctorRepository.findByEmail(email);
            if (doctor.getPassword().equals(password)) {
                return new Response("yes", doctor.getId());
            } else {
                return new Response("no!");
            }
        } else {
            return new Response("Something went wrong!");
        }
    }

    @CrossOrigin(origins = "http://localhost:63342")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Response doctorCreate(@RequestParam(value = "doc_first_name") String firstName,
                                 @RequestParam(value = "doc_last_name") String lastName,
                                 @RequestParam(value = "doc_email_id") String email,
                                 @RequestParam(value = "doc_password") String password) {
        if (doctorRepository.findByEmail(email) != null) {
            return new Response("User Already Exists!");
        } else {
            doctorRepository.save(new Doctor(firstName, lastName, email, password));
            return new Response("Successfully Register!");
        }
    }

    @CrossOrigin(origins = "http://localhost:63342")
    @RequestMapping(value = "/getDoctorName/{uniqueId}", method = RequestMethod.GET)
    public List<Doctor> getDoctorName(@PathVariable(value = "uniqueId") String uniqueId){
        return doctorRepository.findById(uniqueId);
    }
}

