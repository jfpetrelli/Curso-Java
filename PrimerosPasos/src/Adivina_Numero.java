import java.util.*;
public class Adivina_Numero {

	public static void main(String[] args) {
		
		int aleatorio = (int)(Math.random()*100);
		
		Scanner entrada = new Scanner(System.in);
		
		int intentos = 0;
		
		int numero = 0;
		
		do{
			
			System.out.println("Introduce un numero por favor");
			
			numero = entrada.nextInt();
			
			if(aleatorio < numero) {
				
				System.out.println("Mas bajo");
				
			}
			else if(aleatorio > numero) {
				
				System.out.println("Mas alto");
			}
			
			intentos++;
			
		}while(numero != aleatorio); 
		
		System.out.println("Correcto, numero de intentos: "+ intentos);

	}

}
