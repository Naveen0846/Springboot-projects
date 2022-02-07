package org.Many.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "exam_details")
public class ExamDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "sub_id")
	private long subId;
	
	@Column(name = "sub_date")
	private String subDate;
	
	
	public long getSubId() {
		return subId;
	}
	public void setSubId(long subId) {
		this.subId = subId;
	}
	public String getSubDate() {
		return subDate;
	}
	public void setSubDate(String subDate) {
		this.subDate = subDate;
	}
}
