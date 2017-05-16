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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author predix -
 */

@Service
public class StudentService implements StudentServiceInterface {

	@Autowired
	private StudentDAO studentDAO;

	@Override
	public List<Student> getAllStudents() {
		List studentsList = new ArrayList<Student>();
		studentDAO.findAll();
		Iterator studentIterator = (Iterator) studentDAO.findAll();
		while (studentIterator.hasNext()) {
			studentsList.add((Student) studentIterator.next());
		}
		return studentsList;
	}

	/**
	 * @param studentId
	 * @return -
	 */
	@Override
	public Student getStudent(int studentId) {
		return studentDAO.findOne(studentId);
	}

	/**
	 * @param student
	 *            -
	 */
	@Override
	public void createStudent(Student student) {
		studentDAO.save(student);
	}

	/**
	 * @param student
	 *            -
	 */
	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentDAO.save(student);
	}

	/**
	 * @param studentId
	 * @return -
	 */
	@Override
	public void deleteStudent(int studentId) {
		studentDAO.delete(studentId);
	}

}
