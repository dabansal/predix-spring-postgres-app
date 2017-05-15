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

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author predix -
 */
@Entity
@Table(name = "student")
public class Student {

	@Id
	int studentid;
	String firstname;
	String lastname;
	int age;
	String address;
	String nationality;

	/**
	 * @param studentid
	 * @param firstname
	 * @param lastname
	 * @param age
	 * @param address
	 * @param nationality
	 *            -
	 */
	public Student(int studentid, String firstname, String lastname, int age, String address, String nationality) {
		super();
		this.studentid = studentid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.address = address;
		this.nationality = nationality;
	}

	/**
	 * No Arg Constructor
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the studentid
	 */
	public int getStudentid() {
		return this.studentid;
	}

	/**
	 * @param studentid
	 *            the studentid to set
	 */
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return this.firstname;
	}

	/**
	 * @param firstname
	 *            the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return this.lastname;
	}

	/**
	 * @param lastname
	 *            the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return this.age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return this.nationality;
	}

	/**
	 * @param nationality
	 *            the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

}
