package org.onebankservice;

import java.util.List;

import org.onebank.entity.LoanDetails;

public interface LoanService {
	
	public LoanDetails createLoanDetails(LoanDetails loanDetails);

	public List<LoanDetails>  getLoanDetails();

	public LoanDetails getLoanDetailsById(Integer loanId);

	public LoanDetails updateLoanDetails(LoanDetails loanDetails);

	public void deleteById(Integer loanId);

}
