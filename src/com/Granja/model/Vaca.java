package com.Granja.model;

public class Vaca extends AnimalDeGranja {

	public Vaca() {
		super();
		this.daLeche=true;
		this.estoyVivo=true;
		this.pielAprovechable=true;
		this.carneAprovechable=true;
		this.daHuevos=false;
		this.edadMaxima=20;
		this.edad=0;
		this.fertilidad=20;
	}

	

	@Override
	public void muestraMensajeTrabajar() {
		System.out.println("Muuuu!!");
		
	}

	@Override
	public void muestraMensajeReproducirse() {
		System.out.println("Vaca encuentra el amor <3  <3");
		
	}

}
