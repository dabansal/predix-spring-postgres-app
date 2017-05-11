/*
 * Copyright (c) 2017 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */

package springbootapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

/**
 * 
 * @author predix -
 */

@Service
public class StudentService {

	List<Student> studentList = Arrays.asList(new Student(1, "dheeraj", "bansal", 11, "bangalore", "India"),
			new Student(21, "neeraj", "bansal", 11, "pune", "India"));
	
	
	public List<Student> getAllStudents(){
		return studentList;
	}


	/**
	 * @param studentId
	 * @return -
	 */
	public Student getStudent(int studentId) {
		
		return studentList.get(0);
	}


	/**
	 * @param student -
	 */
	public void createStudent(Student student) {
		studentList.add(student);
	}

}
