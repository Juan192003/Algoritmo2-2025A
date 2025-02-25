package prueba;

import java.util.Scanner;

public class buzz {

	public static void main(String[] args) {
	
		int numero;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Digite numero :");
	    numero = lector.nextInt();
	
	    if(numero % 3 ==0 && numero % 5 ==0) {
	    	System.out.println("FizzBuzz");
	    }
	    	else if (numero % 3 ==0) {
	    		System.out.println("buzz");
	    	}
	    	else if(numero % 5 ==0) {
	    		System.out.println("Fizz");
	    	}
	    	else
	    		System.out.println("Reincia codigo");
	    	
	    	
	    
	
	}
}
