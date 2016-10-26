package com.Granja.model;

import java.util.Random;

public class TrabajadorCriador implements Trabajador {

	
	
	
	@Override
	public String toString() {
		return "TrabajadorCriador";
	}

	@Override
	public void trabajar(AnimalDeGranja animal) {
		boolean hueco =false;
		AnimalDeGranja aBorrar =null;
		for (AnimalDeGranja animalito : animal.getMiGranja().getListaAnimales()){
			if (animalito.isEstoyVivo() == false){
				hueco = true;
				aBorrar=animalito;
				break;
			}
		}
		
		if(hueco){
			animal.getMiGranja().getListaAnimales().remove(aBorrar);
			int num = new Random().nextInt(101);
			if(num<animal.getFertilidad()){
				String name = animal.getClass().getName().substring(17);
				switch(name){
				case "Gallina":
					animal.getMiGranja().addAnimal(new Gallina());
					break;
				case "Vaca":
					animal.getMiGranja().addAnimal(new Vaca());
					break;
				case "Conejo":
					animal.getMiGranja().addAnimal(new Conejo());
					break;
				case "Huron":
					animal.getMiGranja().addAnimal(new Huron());
					break;
				default:
					System.out.println("El nombre de la clase no se coje bien!!!");
				}
			}
		}

	}

}
