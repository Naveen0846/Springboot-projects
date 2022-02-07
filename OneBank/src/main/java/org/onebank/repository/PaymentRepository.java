package org.onebank.repository;

import org.onebank.entity.PaymentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentDetails, Integer>{

}
