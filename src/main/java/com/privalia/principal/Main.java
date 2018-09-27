package com.privalia.principal;

import java.io.InputStreamReader;
import java.io.*;

import com.privalia.business.Calculator;
import com.privalia.business.ICalculator;
import com.privalia.dao.StudentDao;
import com.privalia.model.Student;
import com.privalia.model.StudentWithLombok;

public class Main {

	public static void main(String[] args) {
			/*ICalculator iCalculator = new Calculator();
			StringBuilder stringBuilder = new StringBuilder("El resultado de la suma es ");
			System.out.println(stringBuilder.append(iCalculator.sum(2, 2)));
			*/
			
			StudentWithLombok student = new StudentWithLombok();
			StudentDao studentdao = new StudentDao();
			
			
			try {
				/*System.out.println("Insert Student Name");

				BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));

				student.setName(bufferRead.readLine());

				//System.out.println("Insert Student Surname");
				//BufferedReader surnameRead = new BufferedReader(new InputStreamReader(System.in));
				//student.setSurname(surnameRead.readLine());

				/*System.out.println("Insert Student Age");
				BufferedReader ageRead = new BufferedReader(new InputStreamReader(System.in));
				String agestring = ageRead.readLine();
				student.setAge(student.getAge().parseInt(agestring));

				student.setIdStudent(student.hashCode());

				System.out.println(studentdao.add(student));
				bufferRead.close();
				surnameRead.close();
				ageRead.close();
*/
				
				StudentWithLombok test = new StudentWithLombok();
			
				test.setAge(15);
				test.setIdStudent(test.hashCode());
				test.setName("Mariano");
				test.setSurname("Esturrica");
				
				System.out.println(studentdao.add(test));
				
				} catch (Exception e) {
				System.out.println(e);
				}

	}

}
