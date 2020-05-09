import javax.swing.*;
public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		
		
		String nombre_usuario = JOptionPane.showInputDialog("Introduce nombre por favor");
		
		String edad = JOptionPane.showInputDialog("Edad");
		
		System.out.println("Hola "+ nombre_usuario + " este  año tenes "+ edad + " años");

		System.out.println("Hola "+ nombre_usuario + " el año que viene vas a tener  "+ (Integer.parseInt(edad)+1) + " años");

		
	}

}
