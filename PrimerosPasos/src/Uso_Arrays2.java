import javax.swing.JOptionPane;

public class Uso_Arrays2 {

	public static void main(String[] args) {
	
		String[] paises = new String[8];
		
		for(int i=0;i<8;i++) {
			paises[i]=JOptionPane.showInputDialog("Introduce pais "+ (i+1));
		}
		/*
		paises[0] = "España";
		paises[1] = "Mexico";
		paises[2] = "Colombia";
		paises[3] = "Peru";
		paises[4] = "Chile";
		paises[5] = "Argentina";
		paises[6] = "Ecuador";
		paises[7] = "Venezuela";
		
		
		
		
		for(int i = 0; i < paises.length; i++) {
			
			System.out.println("Pais " +(i+1)+ " " + paises[i]);
		}
		
		//////////////////////////////////////////////////
		
		
		String[] paises = {"España", "Mexico", "Colombia", "Peru", "Chile", "Argentina", "Ecuador", "Venezuela"};
		*/
		
		
		for(String elemento: paises) {
			
			System.out.println("Pais "+ elemento);
			
		}
		
		
		
		int[] matriz_aleatoria = new int[150];
		
		for(int i=0; i<matriz_aleatoria.length;i++) {
			
			matriz_aleatoria[i]=(int)Math.round(Math.random()*100);
			
		}
		
		for(int elemento:matriz_aleatoria) {
			
			System.out.print(elemento + " ");
		}
		
	}
	
}
