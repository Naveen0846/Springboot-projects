package org.onebank.service.impl;

import java.util.List;

import org.onebank.entity.LoanDetails;
import org.onebank.exception.LoanIdNotFoundException;
import org.onebank.repository.LoanRepository;
import org.onebankservice.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanImpl implements  LoanService{

	@Autowired
	private LoanRepository loanRepo;

	@Override
	public LoanDetails createLoanDetails(LoanDetails loanDetails) {
		LoanDetails save = loanRepo.save(loanDetails);
		return save;
	}

	@Override
	public List<LoanDetails> getLoanDetails() {
	//	List<LoanDetails> findAll = loanRepo.findAll();
		List<LoanDetails> loanDetails = loanRepo.getLoanDetails();
		return loanDetails;
	}

	@Override
	public LoanDetails getLoanDetailsById(Integer loanId) {
		if(loanRepo.findById(loanId).isEmpty()) {
			throw new LoanIdNotFoundException("Loan Id not found , Please Check :" +loanId);
		}
		LoanDetails loanById = loanRepo.findById(loanId).get();
		return loanById;
	}

	@Override
	public LoanDetails updateLoanDetails(LoanDetails loanDetails) {
		LoanDetails updateLoan = loanRepo.save(loanDetails);
		return updateLoan;
	}

	@Override
	public void deleteById(Integer loanId) {
		if(loanId == null) {
			throw new RuntimeException("Loan Id Doent not exists in Db :" +loanId);
		}
		loanRepo.deleteById(loanId);
	}

}
