package com.Granja.model;

public class Gallina extends AnimalDeGranja {

	
	public Gallina() {
		super();
		this.daLeche=false;
		this.estoyVivo=true;
		this.pielAprovechable=false;
		this.carneAprovechable=true;
		this.daHuevos=true;
		this.edadMaxima=10;
		this.edad=0;
		this.fertilidad=35;
		
	}

	

	

	@Override
	public void muestraMensajeTrabajar() {
		System.out.println("kikiriki");
		
	}

	@Override
	public void muestraMensajeReproducirse() {
		System.out.println("Gallina encuentra el amor <3");
		
	}

}
