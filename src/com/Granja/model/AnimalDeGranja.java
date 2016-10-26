package com.Granja.model;

public abstract class AnimalDeGranja {
	
	
	//ATRIBUTOS
	Granja miGranja;
	
	protected boolean carneAprovechable;
	protected boolean pielAprovechable;
	protected boolean daLeche;
	protected boolean daHuevos;
	protected boolean estoyVivo;
	
	protected int edad;
	protected int edadMaxima;
	protected int fertilidad;
	
	//CONSTRUCTORES
	public AnimalDeGranja() {
		
	}

	public AnimalDeGranja(boolean carneAprovechable, boolean pielAprovechable, boolean daLeche, boolean daHuevos,
			boolean estoyVivo, int edad, int edadMaxima, int fertilidad) {
		super();
		this.carneAprovechable = carneAprovechable;
		this.pielAprovechable = pielAprovechable;
		this.daLeche = daLeche;
		this.daHuevos = daHuevos;
		this.estoyVivo = estoyVivo;
		this.edad = edad;
		this.edadMaxima = edadMaxima;
		this.fertilidad = fertilidad;
	}
	
	//GETTERS

	public Granja getMiGranja() {
		return miGranja;
	}

	public boolean isCarneAprovechable() {
		return carneAprovechable;
	}

	public boolean isPielAprovechable() {
		return pielAprovechable;
	}

	public boolean isDaLeche() {
		return daLeche;
	}

	public boolean isDaHuevos() {
		return daHuevos;
	}

	public boolean isEstoyVivo() {
		return estoyVivo;
	}

	public int getEdad() {
		return edad;
	}

	public int getEdadMaxima() {
		return edadMaxima;
	}

	public int getFertilidad() {
		return fertilidad;
	}

	//SETTERS
	public void setMiGranja(Granja miGranja) {
		this.miGranja = miGranja;
	}

	public void setCarneAprovechable(boolean carneAprovechable) {
		this.carneAprovechable = carneAprovechable;
	}

	public void setPielAprovechable(boolean pielAprovechable) {
		this.pielAprovechable = pielAprovechable;
	}

	public void setDaLeche(boolean daLeche) {
		this.daLeche = daLeche;
	}

	public void setDaHuevos(boolean daHuevos) {
		this.daHuevos = daHuevos;
	}

	public void setEstoyVivo(boolean estoyVivo) {
		this.estoyVivo = estoyVivo;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setEdadMaxima(int edadMaxima) {
		this.edadMaxima = edadMaxima;
	}

	public void setFertilidad(int fertilidad) {
		this.fertilidad = fertilidad;
	}
	
	//MÉTODOS
	public void generaRecursos(){
		this.setEstoyVivo(false);
		
		int capital=0;
		if (this.carneAprovechable==true){
			capital+=40;
		}
		if (this.pielAprovechable==true){
			capital += 60;
		}
		
		miGranja.setCapital(miGranja.getCapital()+capital);
		this.muestraMensajeTrabajar();
		
		
	}
	
	public void extraeRecursos(){
		if (this.estoyVivo!=false){
			this.muestraMensajeReproducirse();
			int capital=0;
			if(this.daLeche==true){
				capital+=5;
			}
			if(this.daHuevos==true){
				capital+=8;
			}
			this.setEdad(this.getEdad()+1);
			if(this.edad>=this.edadMaxima){
				this.generaRecursos();
			}

			miGranja.setCapital(miGranja.getCapital()+capital);
			
		}
		
	}
	
	public abstract void muestraMensajeTrabajar();
	
	public abstract void muestraMensajeReproducirse();
	
	
	

	//TO STRING
	@Override
	public String toString() {
		String name = getClass().getName().substring(17);
		return name+" [carneAprovechable=" + carneAprovechable
				+ ", pielAprovechable=" + pielAprovechable + ", daLeche=" + daLeche + ", daHuevos=" + daHuevos
				+ ", estoyVivo=" + estoyVivo + ", edad=" + edad + ", edadMaxima=" + edadMaxima + ", fertilidad="
				+ fertilidad + "]";
	}
	
	
	
	
	
	
	
	
}
