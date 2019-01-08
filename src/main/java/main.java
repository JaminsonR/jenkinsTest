

import java.util.Scanner;

public class main {

	private static int a;

	public static void main(String[] args) {
		
		calculador c = new calculador();
		
		Scanner sc = new Scanner(System.in);
		
		String opcion = "1";
		
		while (opcion != "0") {
		
		
		System.out.println(" * * * Calculador * * *");
		System.out.println("\t 1) Sumar");
		System.out.println("\t 2) Restar");
		System.out.println("\t 3) Multiplicar");
		System.out.println("\t 4) Dividir");

		
		opcion = sc.nextLine();
		
		switch (opcion) {
        case "1":
        	
        	
        	System.out.println("Ingrese un numero: ");
        	
        	int as = sc.nextInt();
        	 
        	System.out.println("Ingrese un numero: ");
        	int bs = sc.nextInt();
        	
        	System.out.println("El resultado de la suma es " + c.sumar(as, bs));
        	break;
        case "2": 
        	System.out.println("Ingrese un numero: ");
        	int ar = sc.nextInt();
        	 
        	System.out.println("Ingrese un numero: ");
        	int br = sc.nextInt();
        	
        	System.out.println("El resultado de la resta es " + c.restar(ar, br));
        	break; 
        case "3":  
        	System.out.println("Ingrese un numero: ");
        	int am = sc.nextInt();
        	 
        	System.out.println("Ingrese un numero: ");
        	int bm = sc.nextInt();
        	
        	System.out.println("El resultado de la multiplicacion es " + c.multiplicar(am, bm));
        	break;
        case "4":  
        	System.out.println("Ingrese un numero: ");
        	int ad = sc.nextInt();
        	 
        	System.out.println("Ingrese un numero: ");
        	int bd = sc.nextInt();
        	
        	System.out.println("El resultado de la division es " + c.dividir(ad, bd));
        	break;

        default:
        	System.out.println("Opcion no disponible");
        	break;
		}
		}

	}

}
