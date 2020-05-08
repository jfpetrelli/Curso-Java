
public class Calculos_conMath {

	public static void main(String[] args) {
		
		
		double raiz=Math.sqrt(9);
		
		System.out.println(raiz);

		double num1=5.475676575;
		long resultado = Math.round(num1);
		
		System.out.println(resultado);
		
		double num2=5.475676575;
		int res = (int)Math.round(num2);
		
		System.out.println(res);
		
		//////////////////////
		
		double base = 5;
		
		double exponente = 3;
		
		int r=(int)Math.pow(base,exponente);
		System.out.println("Base: "+(int) base + " Exponente: " +(int)exponente + " Resultado: "+ r);
		
		
		double b= 7.56348923902;
		int a= (int)b;
		System.out.println(b);
		System.out.println(a);
	}
	

}
