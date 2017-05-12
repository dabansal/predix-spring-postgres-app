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

import java.util.List;

/**
 * 
 * @author predix -
 */
public interface StudentServiceInterface {

	/**
	 * @return -
	 */
	List<Student> getAllStudents();

	/**
	 * @param studentId
	 * @return -
	 */
	Student getStudent(int studentId);

	/**
	 * @param student -
	 */
	void createStudent(Student student);

	/**
	 * @param student -
	 */
	void updateStudent(Student student);

	/**
	 * @param studentId
	 * @return -
	 */
	Student deleteStudent(int studentId);


}
