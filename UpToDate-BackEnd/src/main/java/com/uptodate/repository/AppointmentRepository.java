package com.uptodate.repository;

import com.uptodate.entity.Appointment;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by shahs on 3/2/2017.
 */

@Transactional
public interface AppointmentRepository extends CrudRepository<Appointment, String>{
    Appointment findByDocIdAndAppointmentDateAndAppointmentTime(String docId, String appointmentDate, String appointmentTime);
    List<Appointment> findByPatientId(String patientId);
    List<Appointment> findByDocId(String docId);
}
