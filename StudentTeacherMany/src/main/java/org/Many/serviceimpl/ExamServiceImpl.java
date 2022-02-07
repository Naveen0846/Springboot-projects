package org.Many.serviceimpl;

import java.util.List;

import org.Many.entity.ExamDetails;
import org.Many.repository.ExamRepository;
import org.Many.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamServiceImpl implements ExamService {
	
	@Autowired
	private ExamRepository exmrepo;
	

	@Override
	public List<ExamDetails> saveExamDetails(List<ExamDetails> examDetails) {
	List<ExamDetails> saveAll = exmrepo.saveAll(examDetails);
		return saveAll;
	}

}
