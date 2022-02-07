package org.Many.repository;

import org.Many.entity.ExamDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<ExamDetails, Long> {

}
