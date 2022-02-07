package com.mobile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobile.entity.MobileEntity;

@Repository
public interface MobileRepository extends JpaRepository<MobileEntity, Long>{


}
