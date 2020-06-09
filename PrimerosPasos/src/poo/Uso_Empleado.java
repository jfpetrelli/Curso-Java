package poo;
import java.util.*;


public class Uso_Empleado {

	public static void main(String[] args) {

		Empleado[] emp = new Empleado[3];
		
		emp[0]= new Empleado("Juan", 30000, 2002, 1, 29);
		emp[1]= new Empleado("Franco", 40000, 2003, 2, 28);
		emp[2]= new Empleado("Totti", 30000, 2002, 5, 31);
		
		

		for(Empleado e: emp) {
			
			System.out.println(e.getNombre() +" "+ e.getSueldo()+" "+e.getFecha()+"\n");
			e.aumentarSueldo(5);	
			System.out.println(e.getNombre() +" "+ e.getSueldo()+" "+e.getFecha()+"\n");
			
		}
		
		Jefe jefe = new Jefe("TOTTI", 70000,2010,1,1);
		
		jefe.setIncentivo(20000);
		
		System.out.print(jefe.getSueldo());
			
	}
	
}



	
	class Empleado{
		
		private String nombre;
		private double sueldo;
		private Date altaContrato;
		
		
		public Empleado(String name, double salary, int year, int month, int day ) {
			
			nombre= name;
			sueldo= salary;
			GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
			altaContrato=calendar.getTime();

			
			
			
		}
		
		public Empleado(String nombre) {
			
			this.nombre=nombre;
			
		}
		
		public String getNombre(){
		
			return nombre;
		}
		
		public double getSueldo() {
			return sueldo;
		}
		
		public Date getFecha() {
			return altaContrato;
		}

		public double aumentarSueldo(double a) {
			
			sueldo+=sueldo*a/100;
			
			return sueldo;
		}
		
	}
	
	class Jefe extends Empleado{

		private double incentivo;
		
		public Jefe(String nombre, double sueldo, int agno, int mes, int dia){
			
			super(nombre, sueldo, agno, mes, dia);
		
			
		
	}
		
		public void setIncentivo(double incentivo){
			
			this.incentivo = incentivo;
			
		}
	
		
		public double getIncentivo() {
				
			return incentivo;
		}
	
		public double getSueldo() {
			
			return (super.getSueldo()+incentivo);
		}
	}
