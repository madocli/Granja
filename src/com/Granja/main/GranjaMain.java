package com.Granja.main;

import java.util.Random;

import com.Granja.model.*;

public class GranjaMain {

	public static void main(String[] args) {

		Granja miGranja = new Granja();

		for (int i = 0; i < 8; i++) {
			int tipo = new Random().nextInt(15);
			if (tipo < 1 || tipo > 10) {
				Trabajador trabajador = new TrabajadorCriador();
				miGranja.addTrabajador(trabajador);
				System.out.println("Trabajador creado de tipo Criador");
			} else {
				Trabajador trabajador = new TrabajadorRecolector();
				miGranja.addTrabajador(trabajador);
				System.out.println("Trabajador creado de tipo Recolector");
			}

		}

		for (int i = 0; i < 5; i++) {
			AnimalDeGranja gallina = new Gallina();
			miGranja.addAnimal(gallina);
		}

		for (int i = 0; i < 5; i++) {
			AnimalDeGranja vaca = new Vaca();
			miGranja.addAnimal(vaca);
		}

		for (int i = 0; i < 5; i++) {
			AnimalDeGranja conejo = new Conejo();
			miGranja.addAnimal(conejo);
		}

		for (int i = 0; i < 5; i++) {
			AnimalDeGranja huron = new Huron();
			miGranja.addAnimal(huron);
		}

		while (1 == 1) {

			System.out.println("------------------ Mi Granja -----------");

			miGranja.aTrabajar();
			
			miGranja.mostrarGranja();

			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
