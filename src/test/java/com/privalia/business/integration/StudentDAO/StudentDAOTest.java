package com.privalia.business.integration.StudentDAO;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.privalia.business.Calculator;
import com.privalia.business.ICalculator;

import com.privalia.dao.*;
import com.privalia.model.Student;
import com.privalia.model.StudentWithLombok;
import com.privalia.util.FileUtil;

import lombok.extern.log4j.Log4j;

@Log4j
public class StudentDAOTest {

static Properties prop = null;
static FileInputStream input = null;
	
	@BeforeClass
	public static void setup() {
		log.info("StudentDaoIntegrationTest Started");
		prop = new Properties();
		try {
			input = new FileInputStream("src/main/resources/config.properties");
			prop.load(input);
		} catch(IOException e) {
			log.error(e.getMessage());
			throw new ExceptionInInitializerError(e);
		
		}
	}
	
	
	@AfterClass
	public static void tearDown() throws IOException {
		File f = FileUtil.getFile();
		
		if(f.exists()) {
			f.delete();
		}
		log.info("StudentDaoTest Finished");
	}
	
	
	
	@Test
	public void testAdd() throws IOException{
		StudentWithLombok studentSend = new StudentWithLombok(1,"UC", "PESCE",43);
		StudentDao studentDao = new StudentDao();
		StudentWithLombok studentFind = studentDao.add(studentSend);
		log.info(studentSend.toString());
		log.info(studentFind.toString());
		assertEquals(studentSend, studentFind);
		log.info("StudentDaoTest testAdd Finished");
	}
	
	


}


