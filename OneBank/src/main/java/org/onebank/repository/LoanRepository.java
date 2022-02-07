package org.onebank.repository;

import java.util.List;

import org.onebank.entity.LoanDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LoanRepository extends JpaRepository<LoanDetails, Integer>{
	
	
	@Query(value = "select * from loan_details ", nativeQuery = true )
 //@Query(value = "select *  from loan_details where loan_type = 'shortterm' and loan_period = 'Five' ", nativeQuery = true)
	public List<LoanDetails> getLoanDetails();
	

}
