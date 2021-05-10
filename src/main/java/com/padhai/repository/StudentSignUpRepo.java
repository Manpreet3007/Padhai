package com.padhai.repository;

import com.padhai.dto.StudentModel;

public interface StudentSignUpRepo {

	public long signUp(StudentModel studentDetails);
}
