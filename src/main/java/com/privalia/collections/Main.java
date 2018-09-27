package com.privalia.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.privalia.model.Student;

public class Main {

	@SuppressWarnings({"unchecked, unused"})
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address = new Address();
		List<Teacher> teacherList = new ArrayList<Teacher>();
		
		
		Teacher teacher1 = new Teacher();
		teacher1.setIdTeacher(1);
		teacher1.setName("Pepe");
		teacherList.add(teacher1);
		
		

		Teacher teacher2 = new Teacher();
		teacher2.setIdTeacher(2);
		teacher2.setName("Alberto");
		teacherList.add(teacher2);
		
		Student student = new Student(address);
		student.setName("Pepe");
		student.setSurname("Soto");
		student.setIdStudent(1);
		student.setAge(24);
		student.setTeacher(teacherList);
		
		@SuppressWarnings("rawtypes")
		List studentList = new ArrayList();
		int counter = 4;
		
		
		//Ejemplo de boxing
		studentList.add(student);
		//Ejemplo de autoboxing 
		studentList.add(counter);
		
		
		//Ejemplo de unboxing
		Student newStudent = (Student) studentList.get(0);
		String name = ((Student) studentList.get(0)).getName();

		
		//Lista genérica
		List<Student> genericStudentList = new ArrayList<Student>();
		genericStudentList.add(student);
		
		
		Student newStudent2 = genericStudentList.get(0);
		
		Optional<Student> optionalStudent = genericStudentList.stream().filter(p -> p.getName().equals("Pepe")).findFirst();
		
		
		Student searchedStudent = optionalStudent.get();
		
		Product product = new Product();
		product.setIdProduct(1);
		product.setName("tejanos");
		
		Map<Long, Product> productList = new HashMap<Long, Product>();
		productList.put(1L, product);
		
		Category category = new Category();
		category.setIdCategory(1);
		category.setName("Ropa");
		category.setProductList(productList);
	}
}
