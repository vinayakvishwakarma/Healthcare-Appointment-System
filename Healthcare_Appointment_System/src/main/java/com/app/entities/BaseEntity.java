package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@MappedSuperclass
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@CreationTimestamp
	@Column(name="creation_date")
	private LocalDate creationDate;
	@UpdateTimestamp
	@Column(name="updation_date")
	private LocalDate updationDate;
	public BaseEntity(long id, LocalDate creationDate, LocalDate updationDate) {
		super();
		this.id = id;
		this.creationDate = creationDate;
		this.updationDate = updationDate;
	}
	public BaseEntity() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDate getUpdationDate() {
		return updationDate;
	}
	public void setUpdationDate(LocalDate updationDate) {
		this.updationDate = updationDate;
	}
	@Override
	public String toString() {
		return "BaseEntity [id=" + id + ", creationDate=" + creationDate + ", updationDate=" + updationDate + "]";
	}
	
	
	
	


}
