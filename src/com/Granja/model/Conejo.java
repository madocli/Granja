package com.Granja.model;

public class Conejo extends AnimalDeGranja {

	public Conejo() {
		this.daLeche=false;
		this.estoyVivo=true;
		this.pielAprovechable=true;
		this.carneAprovechable=true;
		this.daHuevos=false;
		this.edadMaxima=5;
		this.edad=0;
		this.fertilidad=55;
	}

	@Override
	public void muestraMensajeTrabajar() {
		System.out.println("Knock knock neo!!");
		
	}

	@Override
	public void muestraMensajeReproducirse() {
		System.out.println("Conejo encuentra el amor <3 <3 <3 <3 <3");
		
	}
}
