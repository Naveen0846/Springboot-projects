package org.onebank.service.impl;

import java.util.List;

import org.onebank.entity.PaymentDetails;
import org.onebank.exception.PayIdNotFoundException;
import org.onebank.repository.PaymentRepository;
import org.onebankservice.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentImpl implements PaymentService {

	@Autowired
	private PaymentRepository payRepo;

	@Override
	public PaymentDetails createPaymentDetails(PaymentDetails payDetails) {
		PaymentDetails saveLoans = payRepo.save(payDetails);
		return saveLoans;
	}

	@Override
	public List<PaymentDetails> getPaymentDetails() {
		List<PaymentDetails> findAllLoans = payRepo.findAll();
		return findAllLoans;
	}

	@Override
	public PaymentDetails getPaymentDetailsById(Integer payId) {
	if(payRepo.findById(payId).isEmpty()) {
		throw new PayIdNotFoundException("Payments ID Not Found , Please Check :" +payId);
	}
		PaymentDetails payDetailsById = payRepo.findById(payId).get();
		return payDetailsById;
	}

	@Override
	public PaymentDetails updatePaymentDetails(PaymentDetails payDetails) {
		PaymentDetails updateLoans = payRepo.save(payDetails);
		return updateLoans;
	}

	@Override
	public void deleteById(Integer payId) {
		if(payId == null) {
			throw new RuntimeException("Id Doesn not Exists in Db :" +payId);
		}
		payRepo.deleteById(payId);		
	}

}
