package org.Many.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "tch_details")
public class TeacherDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "tch_id")
	private long tchId;
	
	@Column(name = "tch_name")
	private String tchName;
	
	@Column(name = "tch_subject")
	private String subject;
	
	@JsonBackReference
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "fk_std_id")
	private StudentDetails studentDetails;
	
	
	public long getTchId() {
		return tchId;
	}
	public void setTchId(long tchId) {
		this.tchId = tchId;
	}
	public String getTchName() {
		return tchName;
	}
	public void setTchName(String tchName) {
		this.tchName = tchName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}	
}
