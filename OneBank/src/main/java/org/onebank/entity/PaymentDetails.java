package org.onebank.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "pay_details")
public class PaymentDetails {
	
	@Id
	@Column(name = "pay_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer payId;
	
	@Column(name = "pay_type")
	private String payType;
	
	@Column(name = "pay_status")
	private String payStatus;
	
	
	//@JsonManagedReference
	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_loan_id")
	private List<LoanDetails> loanDetails;
	
	
	public Integer getPayId() {
		return payId;
	}
	public void setPayId(Integer payId) {
		this.payId = payId;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

}
