package com.app.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User extends BaseEntity{
	@Column(length=20,name="first_name")
	private String firstName;
	@Column(length=20,name="last_name")
	private String last_name;
	@Column(length=20,name="email",unique=true)
	private String email;
	@Column(length=20,name="password",nullable=false)
	private String password;
	@Column(name="dob")
	private LocalDate dob;
	@Column(length=10,name="phone")
	private String phone;
	@Enumerated(EnumType.STRING)
	@Column(length=20,name="role")
	private UserRole role;
	
	@OneToOne(mappedBy="patient" , cascade= CascadeType.ALL)
	private List<Appointment> appointments=new ArrayList<>();

	public User(long id, LocalDate creationDate, LocalDate updationDate) {
		super(id, creationDate, updationDate);
	}

	public User(long id, LocalDate creationDate, LocalDate updationDate, String firstName, String last_name,
			String email, String password, LocalDate dob, String phone, UserRole role, List<Appointment> appointments) {
		super(id, creationDate, updationDate);
		this.firstName = firstName;
		this.last_name = last_name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.phone = phone;
		this.role = role;
		this.appointments = appointments;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", last_name=" + last_name + ", email=" + email + ", password="
				+ password + ", dob=" + dob + ", phone=" + phone + ", role=" + role + ", appointments=" + appointments
				+ "]";
	}
	
	public void addAppointment(Appointment app) {
		appointments.add(app);
		app.setPatient(this);
	}
	public void removeAppointment(Appointment app) {
		appointments.remove(app);
		app.setPatient(this);
	}	
	
	
	
	

}
