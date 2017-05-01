package com.uptodate.entity;

import javax.persistence.*;

/**
 * Created by shahs on 3/1/2017.
 */

@Entity
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue
    @Column(name = "appointment_id")
    private String appointmentId;

    @Column(name = "doc_id")
    private String docId;

    @Column(name = "pat_id")
    private String patientId;

    @Column(name = "appointment_time")
    private String appointmentTime;

    @Column(name = "appointment_date")
    private String appointmentDate;

    @Column(name = "doc_full_name")
    private String doctorFullName;

    @Column(name = "patient_name")
    private String patientName;

    public Appointment() {
    }

    public Appointment(String docId, String patientId, String appointmentTime, String appointmentDate, String doctorFullName, String patientName) {
        this.docId = docId;
        this.patientId = patientId;
        this.appointmentTime = appointmentTime;
        this.appointmentDate = appointmentDate;
        this.doctorFullName = doctorFullName;
        this.patientName = patientName;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getDoctorFullName() {
        return doctorFullName;
    }

    public void setDoctorFullName(String doctorFullName) {
        this.doctorFullName = doctorFullName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}
