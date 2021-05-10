package com.padhai.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.padhai.dto.StudentModel;
import com.padhai.entity.StudentEntity;


@Repository(value="studentSignUpRepository")
public class StudentSignUpRepoImpl implements StudentSignUpRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	public long signUp(StudentModel studentDetails) {
		
		StudentEntity student = new StudentEntity();
		student.setEmail(studentDetails.getEmail());
		student.setName(studentDetails.getName());
		student.setPassword(studentDetails.getPassword());
		entityManager.persist(student);
		return student.getStudentId();
	}

}
