package org.onebank.repository;

import org.onebank.entity.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerDetails, Integer> {
	
	
	
	/*
	 * @Query(value = "Select * from cust_details ") public List<CustomerDetails>
	 * getAllDetails();
	 */
}
