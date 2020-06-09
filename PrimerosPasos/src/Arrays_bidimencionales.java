
public class Arrays_bidimencionales {

	public static void main(String[] args) {

		int [][] m = new int[5][6];
		
		m[0][0]=1;
		m[0][1]=2;
		m[0][2]=3;
		m[0][3]=4;
		m[0][4]=5;
		m[0][5]=6;
		
		m[1][0]=7;
		m[1][1]=8;
		m[1][2]=9;
		m[1][3]=10;
		m[1][4]=11;
		m[1][5]=12;
		
		m[2][0]=13;
		m[2][1]=14;
		m[2][2]=15;
		m[2][3]=16;
		m[2][4]=17;
		m[2][5]=18;
	
		
		m[3][0]=19;
		m[3][1]=20;
		m[3][2]=21;
		m[3][3]=22;
		m[3][4]=23;
		m[3][5]=24;
		
		m[4][0]=25;
		m[4][1]=26;
		m[4][2]=27;
		m[4][3]=28;
		m[4][4]=29;
		m[4][5]=30;
		
		
		for(int i = 0; i<5;i++) {
			
			System.out.println();
			
			for(int j=0;j<6;j++) {
				
				System.out.print(m[i][j]+" ");
				
			}
		
		}
		
		int [][] m2 = {
				{1, 2, 3, 4,5,6},
				{7,8,9,10,11,12},
				{13,14,15,16,17,18},
				{19,20,21,22,23,24},
				{25,26,27,28,29,30},
				{31,32,33,34,35,36}
		};
		
		for(int i=0; i<6;i++) {
			
			System.out.println();
			
			for(int j=0;j<6;j++) {
				
				System.out.print(m2[i][j]+" ");
				
			}
			
		}
		
		
		System.out.println("\n\n\n ////////////////////////////////////////////");
		
		for(int[]fila:m2) {
			
			System.out.println();
			
			for(int z : fila) {
				
				System.out.print(z+" ");
				
			}
			
		}
		
		
	}
}
