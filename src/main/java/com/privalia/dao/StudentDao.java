package com.privalia.dao;

import org.apache.log4j.Logger;
import java.io.*;
import java.util.Properties;

import javax.annotation.Resources;
import javax.security.auth.login.Configuration;

import com.privalia.model.Student;
import com.privalia.model.StudentWithLombok;
import com.privalia.util.FileUtil;

public class StudentDao implements IDao<StudentWithLombok> {

	static Properties prop = null;
	static FileInputStream input = null;
	static final Logger logger = Logger.getLogger(StudentDao.class);

	public StudentDao() {

	}

	@Override
	public StudentWithLombok add(StudentWithLombok student) throws IOException {

		String filename = prop.getProperty("filename");

		FileUtil.createFile(filename);

		try (FileWriter fileWriter = new FileWriter(filename, true);
				BufferedWriter bufferWriter = new BufferedWriter(fileWriter)) {
			bufferWriter.write(student.toString());
			bufferWriter.write(System.lineSeparator());
		} catch (IOException e) {
			throw e;
		}
		return getLastStudentByID(student.getIdStudent());
	}

	private StudentWithLombok getLastStudentByID(int id) throws IOException {
		BufferedReader bufferedReader = null;
		StudentWithLombok student = new StudentWithLombok();

		try {
			bufferedReader = new BufferedReader(new FileReader(prop.getProperty("filename")));
			String linea;

			while ((linea = bufferedReader.readLine()) != null) {

				String[] datos = linea.split(",", 4);
				if (datos[0].equals(String.valueOf(id))) {
					student = new StudentWithLombok();
					student.setIdStudent(id);
					student.setName(datos[1]);
					student.setSurname(datos[2]);
					student.setAge(Integer.parseInt(datos[3]));
					break;
				}

			}

		} catch (IOException e) {
			logger.error(e.getMessage());
			throw e;
		} finally {
			if (bufferedReader != null) {
				bufferedReader.close();
			}
		}
		return student;

	}

	static {
		prop = new Properties();
		try {
			input = new FileInputStream("src/main/resources/config.properties");
			prop.load(input);
		} catch (IOException e) {
			throw new ExceptionInInitializerError(e);
		}
	}

}
