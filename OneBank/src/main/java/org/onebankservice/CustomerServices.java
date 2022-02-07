package org.onebankservice;

import java.util.List;

import org.onebank.entity.CustomerDetails;

public interface CustomerServices {

public CustomerDetails createCustomer(CustomerDetails custDetails);

public List<CustomerDetails>  getCustomerDetails();

public CustomerDetails getCustomerById(Integer custId);

public CustomerDetails updateCustomerDetails(CustomerDetails custDetails);

public void deleteById(Integer custId);


}
