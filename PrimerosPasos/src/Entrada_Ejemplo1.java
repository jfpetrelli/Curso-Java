import java.util.*;
public class Entrada_Ejemplo1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		
		String nombre_usuario;
		
		nombre_usuario = entrada.nextLine();
		
		System.out.println("Introduce la edad");
		
		int edad;
		
		edad = entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + " el año que viene tendrás " + (edad+1) + " años" );
		
		
		
	}

}
