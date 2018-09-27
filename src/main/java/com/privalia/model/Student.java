package com.privalia.model;

import com.privalia.collections.Address;

import java.util.List;

import com.privalia.collections.*;

public class Student {
	private Integer idStudent;
	private String name;
	private String surname;
	private Integer age;
	private Address address;
	private List<Teacher> teacher;
	
	
	/**
	 * @return the teacher
	 */
	public List<Teacher> getTeacher() {
		return teacher;
	}

	/**
	 * @param teacher the teacher to set
	 */
	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the idStudent
	 */
	public Integer getIdStudent() {
		return idStudent;
	}
	
	/**
	 * @param idStudent the idStudent to set
	 */
	public void setIdStudent(Integer idStudent) {
		this.idStudent = idStudent;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Student(Integer idStudent, String name, String surname, Integer age, Address address){
		this.idStudent = idStudent;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.address = address;
	}
	

	
	public Student(Address address) {
		this.setAddress(address);
	}
	
	public Student(Student student, Address address) {
		this.age = student.age;
		this.address = student.address;
	}
	
	public Student (int id, String name, String surname, int age, Address address) {
		
	}
	
	
	public Student() {
		
	}
	
	public static Student getStudent() {
		return new Student();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [idStudent=");
		builder.append(idStudent);
		builder.append(", name=");
		builder.append(name);
		builder.append(", surname=");
		builder.append(surname);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((idStudent == null) ? 0 : idStudent.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (idStudent == null) {
			if (other.idStudent != null)
				return false;
		} else if (!idStudent.equals(other.idStudent))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
}

