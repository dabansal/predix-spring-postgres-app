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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author predix -
 */

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/hello")
	public String sayhii() {
		return "Hi";
	}

	@RequestMapping("/students")
	public List<Student> listStudents() {
		return studentService.getAllStudents();

	}

	@RequestMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		return studentService.getStudent(studentId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/student")
	public void createStudent(@RequestBody Student student) {
		studentService.createStudent(student);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/student/{sudentId}")
	public void updateStudent(@RequestBody Student student, @PathVariable int studentId) {
		studentService.updateStudent(student);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/students/{studentId}")
	public void deleteStudent(@PathVariable int studentId) {
		studentService.deleteStudent(studentId);
	}

}
