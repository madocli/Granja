package com.Granja.model;

import java.util.ArrayList;
import java.util.Iterator;

public class Granja {

	protected int capital;
	protected int num_conejos ;
	protected int num_vacas ;
	protected int num_gallinas ;
	protected int num_hurones ;

	// ATRIBUTOS
	ArrayList<Trabajador> listaTrabajadores = new ArrayList<Trabajador>();
	ArrayList<AnimalDeGranja> listaAnimales = new ArrayList<AnimalDeGranja>();

	// GETTERS Y SETTERS
	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	public int getNum_conejos() {
		return num_conejos;
	}

	public int getNum_vacas() {
		return num_vacas;
	}

	public int getNum_gallinas() {
		return num_gallinas;
	}

	public int getNum_hurones() {
		return num_hurones;
	}

	public void setNum_conejos(int num_conejos) {
		this.num_conejos = num_conejos;
	}

	public void setNum_vacas(int num_vacas) {
		this.num_vacas = num_vacas;
	}

	public void setNum_gallinas(int num_gallinas) {
		this.num_gallinas = num_gallinas;
	}

	public void setNum_hurones(int num_hurones) {
		this.num_hurones = num_hurones;
	}

	// GETTERS Y SETTERS DE LAS LISTAS!

	public ArrayList<Trabajador> getListaTrabajadores() {
		return listaTrabajadores;
	}

	public ArrayList<AnimalDeGranja> getListaAnimales() {
		return listaAnimales;
	}

	public void setListaTrabajadores(ArrayList<Trabajador> listaTrabajadores) {
		this.listaTrabajadores = listaTrabajadores;
	}

	public void setListaAnimales(ArrayList<AnimalDeGranja> listaAnimales) {
		this.listaAnimales = listaAnimales;
	}

	// Métodos
	public void addCapital(int i) {
		this.capital += i;
	}

	public void showCapital() {
		System.out.println("El capital de la granja es: " + capital + " Millones de €uros");
	}

	public void aTrabajar() {
		int continuar = -1;
		for (int i = 0; i < listaAnimales.size(); i++) {
			continuar++;
			AnimalDeGranja animal = listaAnimales.get(i);
			String name = animal.getClass().getName().substring(17);
			
			Trabajador trabajador = listaTrabajadores.get(continuar);
			System.out.println("Animal de tipo "+name+" asignado al trabajador "+trabajador);
			if (continuar <= listaTrabajadores.size()+1) {
				continuar = 0;
			}
			trabajador.trabajar(animal);
		}
	}

	public void addTrabajador(Trabajador trabajador) {
		listaTrabajadores.add(trabajador);
	}

	public void addAnimal(AnimalDeGranja animal) {
		listaAnimales.add(animal);
		
		animal.setMiGranja(this);

	}
	
	

	@Override
	public String toString() {
		return "Granja [capital=" + capital + ", num_conejos=" + num_conejos + ", num_vacas=" + num_vacas
				+ ", num_gallinas=" + num_gallinas + ", num_hurones=" + num_hurones + "]";
	}

	public void mostrarGranja() {
		num_conejos=0 ;
		num_vacas=0 ;
		num_gallinas=0 ;
		num_hurones=0 ;
		
		for (Iterator<AnimalDeGranja> iterator = listaAnimales.iterator(); iterator.hasNext();) {
			AnimalDeGranja animal = (AnimalDeGranja) iterator.next();
			String name = animal.getClass().getName().substring(17);
			switch (name) {
			case "Gallina":
				num_gallinas += 1;
				break;
			case "Vaca":
				num_vacas += 1;
				break;
			case "Conejo":
				num_conejos += 1;
				break;
			case "Huron":
				num_hurones += 1;
				break;
			default:
				System.out.println("El nombre de la clase no se coje bien!!!");
			}
		}
		
		System.out.println("El estado de la granja es "+this);
		
		for (Iterator<AnimalDeGranja> iterator = listaAnimales.iterator(); iterator.hasNext();) {
			AnimalDeGranja animal = (AnimalDeGranja) iterator.next();
			System.out.println(animal);
		}
		System.out.println("Y mis queridíssimos trabajadores son: ");
		for (Iterator<Trabajador> iterator = listaTrabajadores.iterator(); iterator.hasNext();) {
			Trabajador trabajador = (Trabajador) iterator.next();
			System.out.println(trabajador);
		}
	}
}
