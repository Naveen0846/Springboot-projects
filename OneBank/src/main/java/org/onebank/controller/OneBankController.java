package org.onebank.controller;

import java.util.List;

import org.onebank.entity.CustomerDetails;
import org.onebank.utility.ApiRoutes;
import org.onebankservice.CustomerServices;
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
@RequestMapping(value = ApiRoutes.CUSTOMER)
public class OneBankController {

	@Autowired
	private CustomerServices custService;


	@PostMapping(value = ApiRoutes.CREATE_CUSTOMER)
	public ResponseEntity<String> createCustomer(@RequestBody  CustomerDetails custDetails){
		CustomerDetails createCustomer = custService.createCustomer(custDetails);
		return new ResponseEntity<String>("Customer Saved Sucessfully :" ,HttpStatus.CREATED);
	}


	@GetMapping(value = ApiRoutes.GET_ALL_CUSTOMERS)
	public ResponseEntity<?> getCustomerDetails(){
		List<CustomerDetails> getcustomerDetails = custService.getCustomerDetails();
		return new ResponseEntity<>(getcustomerDetails, HttpStatus.OK);
	}


	@GetMapping(value = ApiRoutes.GET_ALL_CUSTOMERS_BY_ID)
	public ResponseEntity<?> getCustomerById(@PathVariable (value = "custId")    Integer custId){
		CustomerDetails customerById = custService.getCustomerById(custId);
		return new ResponseEntity<>(customerById, HttpStatus.OK);
	}


	@PutMapping(value = ApiRoutes.UPDATE_CUSTOMERS)
	public ResponseEntity<?> updateCustomerDetails(@RequestBody  CustomerDetails custDetails) {
		CustomerDetails updateCustomerDetails = custService.updateCustomerDetails(custDetails);
		return new ResponseEntity<>(updateCustomerDetails,HttpStatus.OK);
	}


	@DeleteMapping(value =ApiRoutes.DELETE_CUSTOMERS_BY_ID)
	public ResponseEntity<String> deleteById(@PathVariable (value = "custId")   Integer custId){
		custService.deleteById(custId);
		return new  ResponseEntity<String>("Customer Details deleted Sucessfully for :" +custId, HttpStatus.OK);
	}

























}
