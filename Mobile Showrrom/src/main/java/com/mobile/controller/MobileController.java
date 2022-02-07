package com.mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.entity.MobileEntity;
import com.mobile.service.MobileService;


@RestController
@RequestMapping(value = "/mobi")
public class MobileController {

	@Autowired
	private MobileService mobService;

	//save data post 
	@PostMapping(value = "/mobil")
		public ResponseEntity<?> saveMob(@RequestBody MobileEntity mobileEntity)  {
		MobileEntity mobEntity = mobService.saveMob(mobileEntity);
		return new ResponseEntity<MobileEntity>(mobEntity, HttpStatus.CREATED);
	}
	
	//get all saved data  
	@GetMapping(value = "/mobile")
	public List<MobileEntity> getAllMob(){
		return mobService.getAllMob();
	}

	//get the existing  data by id
	@GetMapping(value = "/mobile/{mobId}")
	public ResponseEntity<?> getMobById(@PathVariable (value = "mobId") Long mobId) {
		return new ResponseEntity<MobileEntity>(mobService.getMobById(mobId),HttpStatus.OK);
	}
	
	//update existing data by sending request body
	@PutMapping("/mobile")
	public ResponseEntity<MobileEntity> updateMobById(@RequestBody MobileEntity  mobileEntity){
		return new ResponseEntity<MobileEntity>(mobService.updateMobById(mobileEntity), HttpStatus.CREATED);
	}
	
	//delete data by id
	@DeleteMapping("/mobile/{mobId}")
	public ResponseEntity<String> deleteMobById(@PathVariable (value ="mobId") Long mobId){
		mobService.deleteMobById(mobId);
		return new ResponseEntity<String>("Deleted successfully", HttpStatus.OK);
	}
}
