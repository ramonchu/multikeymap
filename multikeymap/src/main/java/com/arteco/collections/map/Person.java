package com.arteco.collections.map;

public class Person {
	String nombre;
	String apellido1;

	public Person(String nombre, String apellido1) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	@Override
	public String toString() {
		return "Person [nombre=" + nombre + ", apellido1=" + apellido1 + "]";
	}

}
