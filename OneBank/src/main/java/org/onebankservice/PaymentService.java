package org.onebankservice;

import java.util.List;

import org.onebank.entity.PaymentDetails;

public interface PaymentService {

	
	public PaymentDetails createPaymentDetails(PaymentDetails payDetails);

	public List<PaymentDetails>  getPaymentDetails();

	public PaymentDetails getPaymentDetailsById(Integer payId);

	public PaymentDetails updatePaymentDetails(PaymentDetails payDetails);

	public void deleteById(Integer payId);

}


