import javax.swing.*;
public class Peso_Ideal {

	public static void main(String[] args) {
		
		String genero = "";
		
		do{
			
			genero = JOptionPane.showInputDialog("Introduce genero (H/M)");
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false );
		
		String altura = JOptionPane.showInputDialog("Introduce altura (cm)");
		
		int a = Integer.parseInt(altura);
		
		if(genero.equalsIgnoreCase("H")) {
			
		System.out.println("Su peso ideal es: "+(a-110));
		
		}
		else if(genero.equalsIgnoreCase("M")) {
			
			System.out.println("Su peso ideal es: "+(a-120));
			
		}
		
	}
			
}
