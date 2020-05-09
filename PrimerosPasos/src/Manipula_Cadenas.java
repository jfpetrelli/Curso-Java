
public class Manipula_Cadenas {

	public static void main(String[] args) {
		
		
		String nombre = "Juan Franco";
		
		System.out.println("Mi nombre es "+ nombre);
		
		System.out.println("Mi nombre tiene "+ nombre.length()+" letras");
		
		System.out.println(" La primer letra es: "+ nombre.charAt(0));
		
		int ultima_letra = nombre.length();
		
		System.out.println("La ultima letra es : " + nombre.charAt(ultima_letra-1));
		
	}

}
