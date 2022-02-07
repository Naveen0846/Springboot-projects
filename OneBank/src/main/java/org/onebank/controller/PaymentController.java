package org.onebank.controller;

import java.util.List;

import org.onebank.entity.PaymentDetails;
import org.onebank.utility.ApiRoutes;
import org.onebankservice.PaymentService;
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
@RequestMapping(value= ApiRoutes.PAYMENTS)
public class PaymentController {
	
	@Autowired
	private  PaymentService payService;
	

	@PostMapping(value = ApiRoutes.CREATE_PAYMENT_DETAILS)
	public ResponseEntity<String>  createPaymentDetails(@RequestBody  PaymentDetails payDetails){
	PaymentDetails createPaymentDetails = payService.createPaymentDetails(payDetails);
		return new ResponseEntity<String>("Customer Saved Sucessfully :" ,HttpStatus.CREATED);
	}


	@GetMapping(value = ApiRoutes.GET_ALL_PAYMENT_DETAILS)
	public ResponseEntity<?> getPaymentDetails() {
		List<PaymentDetails> paymentDetails = payService.getPaymentDetails();
		return new ResponseEntity<>(paymentDetails, HttpStatus.OK);
	}


	@GetMapping(value = ApiRoutes.GET_ALL_PAYMENTS_BY_ID)
	public ResponseEntity<String> getPaymentDetailsById(@PathVariable (value = "payId") Integer payId){
	PaymentDetails paymentDetailsById = payService.getPaymentDetailsById(payId);
		return new ResponseEntity<String>("Details for id :" +payId, HttpStatus.OK);
	}


	@PutMapping(value = ApiRoutes.UPDATE_lOAN_DETAILS)
	public ResponseEntity<?> updatePaymentDetails(@RequestBody PaymentDetails payDetails) {
		PaymentDetails updatePaymentDetails = payService.updatePaymentDetails(payDetails);
		return new ResponseEntity<>(updatePaymentDetails,HttpStatus.OK);
	}


	@DeleteMapping(value =ApiRoutes.DELETE_lOAN_BY_ID)
	public ResponseEntity<String>  deleteById(@PathVariable (value = "payId") Integer payId){
		payService.deleteById(payId);
 		return new  ResponseEntity<String>("Customer Details deleted Sucessfully for :" +payId, HttpStatus.OK);
	}

}
