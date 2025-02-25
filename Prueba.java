package prueba;

import java.util.Scanner;

public class Prueba {
	
	public static void main(String[] args) {
		int numero;
		
		Scanner lector = new Scanner(System.in);
				
        System.out.println("Digita numero");
		numero = lector.nextInt();
		
        for(int i=1;i<=numero;i++) {
        	//System.out.println(i);
        	if(i % 2 !=0) {
        		System.out.println(i);
        	}
        	else
        		System.out.println("-"+i);
        }
    }

}
