import javax.swing.*;
public class Entrada_Numeros {

	public static void main(String[] args) {
		
		
		double num = 100000.123;
		
		
		
		System.out.printf("%1.2f", num/3);
		
		
		String num1 = JOptionPane.showInputDialog("Ingrese numero");
		
		double num2= Double.parseDouble(num1);
		
		System.out.print("\n La raiz de "+num2+" es " );
		
		System.out.printf("%.2f", Math.sqrt(num2));
		
		System.out.print("\n La raiz de "+num2+" es " );
		
		System.out.printf("%.5f", Math.sqrt(num2));
		
		

	}

}
