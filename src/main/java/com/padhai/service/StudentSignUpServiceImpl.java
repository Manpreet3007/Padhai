package com.padhai.service;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.padhai.dto.StudentModel;
import com.padhai.repository.StudentSignUpRepo;

@Service(value="studentSignUpService")
@Transactional
public class StudentSignUpServiceImpl implements StudentSignupService {

	@Autowired
	private StudentSignUpRepo repository;
	
	public long signup(StudentModel studentDetails) {
		return repository.signUp(studentDetails);		
	}
}
