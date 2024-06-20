package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="appointments",
uniqueConstraints=
@UniqueConstraint(columnNames= {"patient_id","doctor_id","date_slot"}))
public class Appointment extends BaseEntity{
	@ManyToOne
	@JoinColumn(name="patient_id",nullable=false)
	private User patient;
	@OneToOne
	@JoinColumn(name="doctor_id",nullable=false)
	private Doctor doctor;
	@Column(name="date_slot")
	private LocalDate dateSlot;
	public Appointment(long id, LocalDate creationDate, LocalDate updationDate) {
		super(id, creationDate, updationDate);
	}
	public Appointment(long id, LocalDate creationDate, LocalDate updationDate, User patient, Doctor doctor,
			LocalDate dateSlot) {
		super(id, creationDate, updationDate);
		this.patient = patient;
		this.doctor = doctor;
		this.dateSlot = dateSlot;
	}
	public User getPatient() {
		return patient;
	}
	public void setPatient(User patient) {
		this.patient = patient;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public LocalDate getDateSlot() {
		return dateSlot;
	}
	public void setDateSlot(LocalDate dateSlot) {
		this.dateSlot = dateSlot;
	}
	@Override
	public String toString() {
		return "Appointment [dateSlot=" + dateSlot + "]";
	}
	
	

}
