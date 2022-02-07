package com.mobile.service;

import java.util.List;

import com.mobile.entity.MobileEntity;
import com.mobile.exception.ErrorException;

public interface MobileService {

	public MobileEntity saveMob(MobileEntity mobileEntity) throws ErrorException;

	public List<MobileEntity> getAllMob();

	public MobileEntity getMobById(Long mobId);

	public MobileEntity updateMobById(MobileEntity mobileEntity);
	
	public void deleteMobById(Long mobId);

	


}
