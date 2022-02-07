package org.onebank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loan_details")
public class LoanDetails {
	
	@Id
	@Column(name = "loan_id")
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer loanId;
	
	@Column(name = "loan_type")
	private String loanType;
	
	@Column(name = "loan_period")
	private String loanPeriod;
	
	
	public Integer getLoanId() {
		return loanId;
	}
	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getLoanPeriod() {
		return loanPeriod;
	}
	public void setLoanPeriod(String loanPeriod) {
		this.loanPeriod = loanPeriod;
	}

}
