import java.util.*;
public class Evalua_edad {

	public static void main(String[] args) {
		
		Scanner elemento = new Scanner (System.in);
		
		System.out.println("Ingrese edad");
		
		int edad = elemento.nextInt();
		
		if(edad<18) {
			
			System.out.println("Es menor de edad");
		}
		else if(edad<40) {
			
			System.out.println("Es mayor de edad  pero menor a 40");
			
		}
		else {
			
			System.out.println("Es mayor de 65");
		}

	}

}
