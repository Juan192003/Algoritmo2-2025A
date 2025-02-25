package ciclos;

import java.util.Scanner;

public class recolecta2 {
public static void main(String[]args) {
	float i,aporte;
	
	Scanner lector = new Scanner(System.in);
	System.out.println("!!!Recolecta!!!");
	System.out.println("META 80.000");

	for(i=0;i<=80000;i++) {
		i=i--;
		System.out.println("Digite aporte");
		aporte=lector.nextFloat();
		i=i+aporte;
	}
	System.out.println("SE LOGRO LA META");
}
}
