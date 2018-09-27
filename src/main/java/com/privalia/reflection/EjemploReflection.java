package com.privalia.reflection;

import java.util.ArrayList;

public class EjemploReflection {

	public static void main(String[] args) {
		if (createObject("java.util.ArrayList") instanceof ArrayList) {
			@SuppressWarnings("unchecked")
			ArrayList r = (ArrayList) createObject("java.util.ArrayList");
			r.add("Pepe");
			System.out.println(r.toString());
		}

	}

	static Object createObject(String className) {
		Object object = null;
		try {
			Class<?> classDefinition = Class.forName(className);
			object = classDefinition.newInstance();
		} catch (InstantiationException e) {
			System.out.println(e);
		} catch (IllegalAccessException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
		return object;
	}
}