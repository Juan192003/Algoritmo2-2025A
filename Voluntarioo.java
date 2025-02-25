package ciclos;

import java.util.Scanner;

public class Voluntarioo {
	public static void main(String[]args) {
		
		int aporte=0,aportee=0;
		Scanner lector = new Scanner(System.in);
		System.out.println("!!!Recolecta!!!");
		System.out.println("META 80.000");

		while(aporte<79999) {
			System.out.println("Ingrese aporte");
			aportee=lector.nextInt();
			aporte=aporte+aportee;
		}
		System.out.println("SE LOGRO LA META");
		}
}
