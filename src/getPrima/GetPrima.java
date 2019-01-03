package getPrima;

import java.util.Scanner;

import getPrima.Conductor.estados;
import getPrima.Conductor.sexos;

public class GetPrima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		System.out.println("Ingrese edad");
		int edad = 0;
		
		
			edad = sc.nextInt();
			sc.nextLine(); 
		
		
		
		System.out.println("Ingrese Estado civil ");
		String estado = sc.nextLine();
				    
		    
		    System.out.println("Ingrese sexo ");
			String sexo = sc.nextLine();
			
			
		

		Conductor c = new Conductor(estado, edad, sexo);
		System.out.println("La prima es:" + c.getPrima());		
	}

}
