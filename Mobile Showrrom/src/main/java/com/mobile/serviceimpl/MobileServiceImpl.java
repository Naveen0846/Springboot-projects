package com.mobile.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.entity.MobileEntity;
import com.mobile.exception.ErrorException;
import com.mobile.repository.MobileRepository;
import com.mobile.service.MobileService;

@Service
public class MobileServiceImpl implements MobileService{

	@Autowired
	private MobileRepository mobRepo;

	@Override
	public MobileEntity saveMob(MobileEntity mobileEntity) {
		//exception if mobname is sent empty in request
		if(mobileEntity.getMobName().isEmpty()  && mobileEntity.getMobName().length() == 0  &&
				mobileEntity.getStatus().isEmpty() && mobileEntity.getMobPrice()==0.0) {
			throw new ErrorException("600", "please check the field set sent!");
		}
		MobileEntity mobEntity = mobRepo.save(mobileEntity);
		return mobEntity;

	}


	@Override
	public List<MobileEntity> getAllMob() {
		List<MobileEntity> mobList =  mobRepo.findAll();
		//exception  if list is empty is sent empty in request
		if(mobList.isEmpty()) {
			throw new ErrorException("600", "please check the field set sent!");
		}
		return mobList;
	}


	@Override
	public MobileEntity getMobById(Long mobId) {
		return mobRepo.findById(mobId).get();
	}


	//update by request body
	@Override
	public MobileEntity updateMobById(MobileEntity mobileEntity) {
		//if field is empty
		if(mobileEntity.getMobName().isEmpty()  && mobileEntity.getMobName().length() != 0 && mobileEntity.getMobPrice() != 0 
				&&  mobileEntity.getStatus().isEmpty() && mobileEntity.getMobId() == null ) {
			throw new ErrorException("600", "please check the field set sent!");
		}
		MobileEntity mobiEntity = mobRepo.save(mobileEntity);
		return mobileEntity;
	}

	@Override
	public  void deleteMobById(Long mobId) {
		if(mobId == null) {
			throw new RuntimeException("Id not found in db");
		}
		mobRepo.deleteById(mobId);
	}





}




