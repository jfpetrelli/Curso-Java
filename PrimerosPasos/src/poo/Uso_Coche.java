package poo;
import javax.swing.*;

public class Uso_Coche {

	public static void main(String[] args) {
		
		Coche Renault = new Coche();
		
	 System.out.println(Renault.dime_datos_generales());
	 
	Renault.establece_color(JOptionPane.showInputDialog("Ingrese color"));
	 
	 System.out.println(Renault.dime_color());
	
		
	}

}
