package com.privalia.util;


import java.io.File;
import java.io.IOException;

import lombok.extern.log4j.Log4j;

import java.io.*;

@Log4j
public class FileUtil {

private static File file = null;

private FileUtil() {
	
}

public static synchronized boolean createFile (String fileName) throws IOException{
	boolean isFileCreated = false;
	
	file = new File(fileName);
	
	if (file.exists()) {
		log.warn("El fichero ya existe");
	} else {
		try {
			isFileCreated = file.createNewFile();
		} catch(IOException e) {
			log.error(e.getMessage());
			throw e;
		}
	}
	
	return isFileCreated;
	
}

public static File getFile() {
	return file;
}

}

