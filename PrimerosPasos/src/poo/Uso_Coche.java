package poo;
import javax.swing.*;

public class Uso_Coche {

	public static void main(String[] args) {
		
	Coche miCoche = new Coche();

	miCoche.establece_color(JOptionPane.showInputDialog("Ingrese color"));
	miCoche.configura_asientos(JOptionPane.showInputDialog("Asientos de cuero?"));
	miCoche.configura_climatizador(JOptionPane.showInputDialog("Climatizador?"));
	
	
	
	 System.out.println(miCoche.dime_datos_generales() +" "+ miCoche.dime_color() +" "+ miCoche.dime_asientos()+" "+
			 miCoche.dime_climatizador()+" "+ miCoche.dime_peso_coche()+" "+ miCoche.dime_peso_coche());
	
		
	}

}
