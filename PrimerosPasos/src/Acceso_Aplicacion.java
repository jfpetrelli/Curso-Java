import javax.swing.*;
public class Acceso_Aplicacion {

	public static void main(String[] args) {
		
		
		String clave = "totti";
		
		String pass ="";
		
		while(clave.equals(pass)==false) {
			
			pass = JOptionPane.showInputDialog("Introduce la clave");
			
			if(clave.equals(pass)==false) {
				
				System.out.println("Clave incorrecta");
			}

		}
		
		System.out.println("Clave correcta. Acceso permitido");

	}
}