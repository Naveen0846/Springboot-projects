package org.onebank.controller;

import java.util.List;

import org.onebank.entity.LoanDetails;
import org.onebank.utility.ApiRoutes;
import org.onebankservice.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value  = ApiRoutes.LOAN)
public class loanController {

	@Autowired
	private LoanService loanService;
	

	@PostMapping(value = ApiRoutes.CREATE_lOAN_DETAILS)
	public ResponseEntity<String>  createLoanDetails(@RequestBody LoanDetails loanDetails){
	 LoanDetails LoanDetails = loanService.createLoanDetails(loanDetails);
		return new ResponseEntity<String>("Customer Saved Sucessfully :" ,HttpStatus.CREATED);
	}


	@GetMapping(value = ApiRoutes.GET_ALL_lOAN_DETAILS)
	public ResponseEntity<?> getLoanDetails(){
		List<LoanDetails> loanDetails = loanService.getLoanDetails();
		return new ResponseEntity<>(loanDetails, HttpStatus.OK);
	}


	@GetMapping(value = ApiRoutes.GET_ALL_lOAN_BY_ID)
	public ResponseEntity<String> getLoanDetailsById(@PathVariable (value = "loanId") Integer loanId){
	List<LoanDetails> loanDetails = loanService.getLoanDetails();
		return new ResponseEntity<String>("Details for id :" +loanId, HttpStatus.OK);
	}


	@PutMapping(value = ApiRoutes.UPDATE_lOAN_DETAILS)
	public ResponseEntity<?> updateLoanDetails(@RequestBody LoanDetails loanDetails) {
		LoanDetails updateLoanDetails = loanService.updateLoanDetails(loanDetails);
		return new ResponseEntity<>(updateLoanDetails,HttpStatus.OK);
	}


	@DeleteMapping(value =ApiRoutes.DELETE_lOAN_BY_ID)
	public ResponseEntity<String>  deleteById(@PathVariable (value = "loanId") Integer loanId){
		loanService.deleteById(loanId);
 		return new  ResponseEntity<String>("Customer Details deleted Sucessfully for :" +loanId, HttpStatus.OK);
	}

}
