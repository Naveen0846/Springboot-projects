package org.Many.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.Many.entity.TeacherDetails;
import org.Many.repository.TeacherRepository;
import org.Many.service.Teacherservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements Teacherservice{

	@Autowired
	private TeacherRepository teachRepo;
	
	
	@Override
	public List<TeacherDetails> saveTeacherDetails(List<TeacherDetails> teacherDetails) {
		ArrayList<TeacherDetails> teachDetails = new ArrayList<>();
		List<TeacherDetails> saveAll = teachRepo.saveAll(teacherDetails);
		return saveAll;
	}
}
