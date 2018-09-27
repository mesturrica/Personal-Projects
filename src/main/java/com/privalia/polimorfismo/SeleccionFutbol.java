package com.privalia.polimorfismo;

public abstract class SeleccionFutbol {
	
	protected int id;
	protected String nombre;
	protected String apellidos;
	protected int edad;
	
	public SeleccionFutbol() {
		
	}
	
	public SeleccionFutbol(int id, String nombre, String apellidos,int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void viajar() {
		System.out.println("Viajar(Clase Padre");
	}
	
	public void concentrarse() {
		System.out.println("Concentrarse(Clase Padre)");
	}
	
	//IMPORTANTE -> METODO ABSTRACTO => no se implementa
	//En la clase abstracta pero si en las clases hijas
	
	public abstract void entrenamiento();
	
	public void partidoFutbol() {
		System.out.println("Asiste al Parido de Futbol(Clase Padre)");
	}
	
}
