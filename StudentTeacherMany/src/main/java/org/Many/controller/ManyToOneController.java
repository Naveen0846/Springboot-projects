package org.Many.controller;

import java.util.List;

import org.Many.entity.TeacherDetails;
import org.Many.service.Teacherservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/student")
public class ManyToOneController {
	
	@Autowired
	private Teacherservice  tchService;

	
	
	@PostMapping(value = "/many")
	public ResponseEntity<List<TeacherDetails>> saveTeacherDetails(@RequestBody  List<TeacherDetails> teacherDetails){
		List<TeacherDetails> saveteacher = tchService.saveTeacherDetails(teacherDetails);
		return new ResponseEntity<List<TeacherDetails>>(saveteacher, HttpStatus.CREATED);
	}
}
