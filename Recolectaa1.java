package ciclos;

import java.util.Scanner;

public class Recolectaa {

	public static void main(String[] args) {
		float aporte,i;
		int num_p;
		Scanner lector = new Scanner(System.in);
		
		System.out.println("!!!Recolecta!!!");
		System.out.println("APORTE FIJO 8.000");
		System.out.println("¿Cuantas personas van a participar en la recolecta?");
		 num_p=lector.nextInt();
		for(i=1;i<=num_p;i++) {
			//i=i--;
			System.out.println("Ingrese aporte");
			aporte = lector.nextFloat();
		}
		System.out.println(" SE LOGRO LA RECOLECTA ");
	}
}
