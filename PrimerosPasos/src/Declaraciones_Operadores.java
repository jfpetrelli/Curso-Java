
public class Declaraciones_Operadores {

	public static void main(String[] args) {

		int i=20;
		int j=30;
		
		double a=2;
		double b;		
		b=3;
		double c=b+a;
		System.out.println(c);
		c++;
		System.out.println(c);
		c+=6;
		System.out.println(c);
		c-=6;
		System.out.println(c);
		c=a/b;
		System.out.println(c);
		 c=a/b;
		System.out.println(c);
		
		double d=i+j;
		System.out.println(d);
		d=i/j;
		System.out.println(d);
		
		/////////////////////////////

		final double pulgadas=2.54;
		
		// c1= 2; This is declared as constant
		
		double cm=6;
		
		double resultado=cm/pulgadas;
		
		System.out.println("En "+ cm +" cm hay " + resultado 
							+ " pulgadas");
		
		
		/////////////////////////////
		
		int op1, op2, res;
		
		op1=1;
		op2=2;
		res=op1+op2;
		
		System.out.println("Res: "+res);
		
		
		
		
		
		}

}
