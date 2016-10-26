package com.Granja.model;

public class TrabajadorRecolector implements Trabajador {

	
	
	
	
	
	@Override
	public void trabajar(AnimalDeGranja animal) {

		animal.extraeRecursos();

	}

	@Override
	public String toString() {
		return "Trabajador Recolector";
	}

}
