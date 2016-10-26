package com.Granja.model;

public class Huron extends AnimalDeGranja {

	public Huron() {
		
		this.daLeche=false;
		this.estoyVivo=true;
		this.pielAprovechable=true;
		this.carneAprovechable=false;
		this.daHuevos=false;
		this.edadMaxima=3;
		this.edad=0;
		this.fertilidad=85;
	}

	@Override
	public void muestraMensajeTrabajar() {
		System.out.println("ikikikik!!");
		
	}

	@Override
	public void muestraMensajeReproducirse() {
		System.out.println("Hurón encuentra el amor <3 <3 <3 <3");
		
	}
}
