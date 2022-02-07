package org.Many.repository;

import org.Many.entity.TeacherDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherDetails, Long>{

}
