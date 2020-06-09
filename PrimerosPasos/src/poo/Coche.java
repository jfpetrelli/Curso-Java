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
		
		System.out.println(asientos_cuero);
		System.out.println(((Object)asientos_cuero).getClass().getSimpleName());
		
		
		if(asientos_cuero.equalsIgnoreCase("si")){
			this.asientos_cuero=true;
			System.out.println("Entro");
			}else {
				this.asientos_cuero=false;
			}
			
	}
	
	public String dime_asientos() { //Get		
		if(asientos_cuero==true) {
			return "\nTiene asientos de cuero";
		}else {
			return "\nNo tiene asientos de cuero";
		}
		
	}
	
	public void configura_climatizador(String climatizador) { //Set
		
		if(climatizador.equalsIgnoreCase("si")){
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
		
	}
	
	public String dime_climatizador() { //Get
		
		if(climatizador==true) {
			return "\nTiene climatizador";
		}else {
			return "\nNo tiene climatizador";
		}
		
	}
	
	public String dime_peso_coche() { //Set and Get
		
		int peso_carroceria=500;
		
		peso_total = peso_plataforma + peso_carroceria;
		
		if(asientos_cuero) {
			
			peso_total = peso_total + 50;
			
		}if(climatizador) {
			
			peso_total = peso_total + 20;
		}
		
		return "\nEl peso del coche es " + peso_total;
	}
	
	public int precio_coche() { //Get
		
		int precio_final = 10000;
		if(asientos_cuero) {
			
			precio_final+=2000;
		}
		if(climatizador) {
			
			precio_final+=1500;
		}
		
		return precio_final;
		
	}
	
}


