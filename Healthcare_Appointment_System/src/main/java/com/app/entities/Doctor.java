package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name="doctors")
public class Doctor extends BaseEntity {
	@Column(length=20,name="first_name")
	private String firstName;
	@Column(length=20,name="last_name")
	private String lastName;
	@Column(length=20,name="email",unique=true)
	private String email;
	@Column(length=10,name="phone_no",unique=true)
	private String phoneNo;
	@Enumerated(EnumType.STRING)
	@Column(name="category")
	private DoctorCategory category;
	
	public Doctor(long id, LocalDate creationDate, LocalDate updationDate) {
		super(id, creationDate, updationDate);
	}

	public Doctor(long id, LocalDate creationDate, LocalDate updationDate, String firstName, String lastName,
			String email, String phoneNo, DoctorCategory category) {
		super(id, creationDate, updationDate);
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.category = category;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public DoctorCategory getCategory() {
		return category;
	}

	public void setCategory(DoctorCategory category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Doctor [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNo=" + phoneNo
				+ ", category=" + category + "]";
	}
	
	
	

}
