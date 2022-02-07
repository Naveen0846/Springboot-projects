package org.Many.serviceimpl;

import java.util.List;

import org.Many.entity.StudentDetails;
import org.Many.repository.StudentRepository;
import org.Many.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository stdRepo;

	@Override
	public List<StudentDetails> saveStudent(List<StudentDetails> studentDetails) {
		List<StudentDetails> saveAll = stdRepo.saveAll(studentDetails);
		return saveAll;
	}

}
