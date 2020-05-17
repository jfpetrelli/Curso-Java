package poo;

public class Coche {
	
	private int largo;
	private int ruedas;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;

	
	
	public Coche(){
		
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor= 1600;
		peso_plataforma=500;
		
	}
	
	public String dime_datos_generales() { //Get
		
		return "La plataforma del vehículo tiene " + ruedas + " ruedas " + ". Mide " + largo/1000 + " metros con un ancho de " + ancho +
				" cm y un peso de plataforma de " +  peso_plataforma + " kg";
		
	}
	
	public void establece_color(String color_coche) { //Set
		
		color=color_coche;
	}
	
	public String dime_color() { //Get
		
		return "El color del coche es " + color;
		
	}
	
	public void configura_asientos(String asientos_cuero) { //Set
		
		if(asientos_cuero=="si") {
			
			this.asientos_cuero=true;
			}else {
				this.asientos_cuero=false;
			}
			
	}
	
	public String dime_asientos() { //Get
		
		if(asientos_cuero) {
			return "Tiene asientos de cuero";
		}else {
			return "No tiene asientos de cuero";
		}
		
	}
	
	public void configura_climatizador(String climatizador) { //Set
		
		if(climatizador=="si") {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
		
	}
	
	public String dime_climatizador() {
		
		if(climatizador) {
			return "Tiene climatizador";
		}else {
			return "No tiene climatizador";
		}
		
	}
	
	
}


