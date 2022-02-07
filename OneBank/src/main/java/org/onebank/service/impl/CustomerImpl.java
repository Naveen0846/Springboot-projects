package org.onebank.service.impl;

import java.util.List;

import org.onebank.entity.CustomerDetails;
import org.onebank.exception.CustIdNotFoundException;
import org.onebank.repository.CustomerRepository;
import org.onebankservice.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerImpl implements CustomerServices {


	@Autowired
	private CustomerRepository custRepo;
	
	
	@Override
	public CustomerDetails createCustomer(CustomerDetails custDetails) {
		CustomerDetails save = custRepo.save(custDetails);
		return save;
	}

	@Override
	public List<CustomerDetails> getCustomerDetails() {
	List<CustomerDetails> findAll = custRepo.findAll();
		return findAll;
	}

	@Override
	public CustomerDetails getCustomerById(Integer custId) {
		if(custRepo.findById(custId).isEmpty()) {
			throw new CustIdNotFoundException("Customer Id not found, Please Check");
		}
		CustomerDetails customerDetails = custRepo.findById(custId).get();
		return customerDetails;
	}

	@Override
	public CustomerDetails updateCustomerDetails(CustomerDetails custDetails) {
		CustomerDetails update = custRepo.save(custDetails);
		return update;
	}

	@Override
	public void deleteById(Integer custId) {
		if(custId == null) {
			throw new RuntimeException("Customer Id Does not Exists in Db :" +custId);
		}
		custRepo.deleteById(custId);
	}

}
