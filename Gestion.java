import javax.swing.JOptionPane;

public class Gestion {

	public static void main(String[]args) {
		
		int opcion = 0, id_TrenGuardar =0;
		String tipoTrenGuardar = "Quimicos";
		
		//INSTANCIA BODEGA
		//Bodega Objetobodega = new Bodega();
		
		//INSTANCIA TREN
		//Tren Objetotren = new Tren ();
		
	
		//CREACION DE BODEGAS
	Bodega [] misBodegas = new Bodega[5];
	
	
	misBodegas[0] = new Bodega(1111,"Carrera 1 #71-10","Alimentos",100,0,5,0);
	misBodegas[1] = new Bodega(2222,"Carrera 2 #71-21","Quimicos",100,0,5,0);
	misBodegas[2] = new Bodega(3333,"Carrera 3 #71-32","Alimentos",100,0,5,0);
	misBodegas[3] = new Bodega(4444,"Carrera 4 #71-43","Quimicos",100,0,5,0);
	misBodegas[4] = new Bodega(5555,"Carrera 5 #71-43","Quimicos",100,0,5,0);
	
	
	//CREACION DE TRENES
	Tren[] misTrenes = new Tren[5];
	
	misTrenes[0] = new Tren("Alimentos", 11,20,0);
	misTrenes[1] = new Tren("Alimentos", 22,30,0);
	
	
	/*Bodega bo1 = new Bodega (1111,"Carrera 1 #71-10","Alimentos",100,0,5,0);
	Bodega bo2 = new Bodega (2222,"Carrera 2 #71-21","Quimicos",100,0,5,0);
	Bodega bo3 = new Bodega (3333,"Carrera 3 #71-32","Alimentos",100,0,5,0);
	Bodega bo4 = new Bodega (4444,"Carrera 4 #71-43","Quimicos",100,0,5,0);
	Bodega bo5 = new Bodega (4444,"Carrera 4 #71-43","Quimicos",100,0,5,0);*/
	
	
	//-----MENU DE OPCIONES-----
	while(opcion != 4) {
		
		opcion = Integer.parseInt(JOptionPane.showInputDialog("1. VER BODEGAS"+"\n"+
				 "2. VER TRENES"+"\n"+
				 "3. GUARDAR TRENES"+"\n"+
				 "4. SALIR"));
		
		
				switch(opcion)
				{
				case 1:

					//MOSTRAR POR CICLO
					for(int i=0; i<5;i++)
					{
						JOptionPane.showMessageDialog(null,"BODEGA #"+misBodegas[i].getId()+"\n\n"+
														   "Direccion: "+misBodegas[i].getDireccion()+"\n"+
														   "Tipo Almacenamiento: "+misBodegas[i].getTipo()+"\n"+
														   "Capacidad Maxima: "+misBodegas[i].getCapa_maxtone()+"\n"+
														   "Capacidad Actual: "+misBodegas[i].getActual_tone()+"\n"+
														   "Capacidad Maxima Trenes: "+misBodegas[i].getCapa_maxtren()+"\n"+
														   "Capacidad Actual Trenes: "+misBodegas[i].getActual_tren());
					}
					break;
					
				case 2:
					
					for(int i=0; i<2;i++)
					{
						JOptionPane.showMessageDialog(null,"TREN #"+misTrenes[i].getId()+"\n\n"+
														   "Tipo Carga: "+misTrenes[i].getTipo()+"\n"+
														   "Capacidad Maxima: "+misTrenes[i].getCarga_maxtone()+"\n"+
														   "Capacidad Actual: "+misTrenes[i].getCarga_actual()+"\n");
					}
					break;
					
				case 3:
					
					id_TrenGuardar = Integer.parseInt(JOptionPane.showInputDialog("Digite la ID del tren a guardar: "));
					tipoTrenGuardar = JOptionPane.showInputDialog("Digite la el tipo del tren a guardar: ");
					verificarIdTren(id_TrenGuardar);
					verificarTipoTren(tipoTrenGuardar);
	
				}
	}
	
		
		


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	//JOptionPane.showMessageDialog(null, "el id de bodega 1 es: " + bo1.getId() + " dirrecion: "+ bo1.getDireccion() + " su tipo es: "+ bo1.getTipo() + " su capacidad maxima es: " + bo1.getCapa_maxtone()+"toneladas" + " su capacidad actual es:" + bo1.getActual_tone() + " su capacidad maxima de trenes es: " + bo1.getCapa_maxtren() + " su capacidad actual de trenes es: " + bo1.getActual_tren());
	/*System.out.println("el id de bodega 2 es: " + bo2.getId() + " dirrecion: "+ bo2.getDireccion() + " su tipo es: "+ bo2.getTipo() + " su capacidad maxima es: " + bo2.getCapa_maxtone()+"toneladas" + " su capacidad actual es:" + bo2.getActual_tone() + " su capacidad maxima de trenes es: " + bo2.getCapa_maxtren() + " su capacidad actual de trenes es: " + bo2.getActual_tren());
	System.out.println("el id de bodega 3 es: " + bo3.getId() + " dirrecion: "+ bo3.getDireccion() + " su tipo es: "+ bo3.getTipo() + " su capacidad maxima es: " + bo3.getCapa_maxtone()+"toneladas" + " su capacidad actual es:" + bo3.getActual_tone() + " su capacidad maxima de trenes es: " + bo3.getCapa_maxtren() + " su capacidad actual de trenes es: " + bo3.getActual_tren());
	System.out.println("el id de bodega 4 es: " + bo4.getId() + " dirrecion: "+ bo4.getDireccion() + " su tipo es: "+ bo4.getTipo() + " su capacidad maxima es: " + bo4.getCapa_maxtone()+"toneladas" + " su capacidad actual es:" + bo4.getActual_tone() + " su capacidad maxima de trenes es: " + bo4.getCapa_maxtren() + " su capacidad actual de trenes es: " + bo4.getActual_tren());
	System.out.println("el id de bodega 5 es: " + bo5.getId() + " dirrecion: "+ bo5.getDireccion() + " su tipo es: "+ bo5.getTipo() + " su capacidad maxima es: " + bo5.getCapa_maxtone()+"toneladas" + " su capacidad actual es:" + bo5.getActual_tone() + " su capacidad maxima de trenes es: " + bo5.getCapa_maxtren() + " su capacidad actual de trenes es: " + bo5.getActual_tren());
	System.out.println("\n");*/
	//crear tren
	//Tren tren1 = new Tren ("Alimentos",123,20,0);
	
	//System.out.println("El tipo de carga del tren es: "+ tren1.getTipo() + " su identificador es: " + tren1.getId() + " tiene una capacidad maxima de: " + tren1.getCarga_maxtone()+"toneladas" + " su capacidad actual es: " + tren1.getCarga_actual());
	
	}
	
	//OTROS METODOS
		public static void verificarIdTren(int IdTren)
		{
			
			Tren[] misTrenes = new Tren[5];
			
			misTrenes[0] = new Tren("Alimentos", 11,20,0);
			//misTrenes[1] = new Tren("Alimentos", 22,30,0);
			
		
			for(int i=0; i<1;i++)
			{
				if(IdTren != misTrenes[i].getId())
				{
					JOptionPane.showMessageDialog(null,"El ID "+IdTren+" DEL TREN NO EXISTE");
					break;
				}
				else
				{
					JOptionPane.showMessageDialog(null,"El ID "+IdTren+" DEL TREN EXISTE");
					break;
				}
			}
		}
		
		public static void verificarTipoTren(String tipoTren)
		{
			
		    Bodega [] misBodegas = new Bodega[5];
			
			
			misBodegas[0] = new Bodega(1111,"Carrera 1 #71-10","Alimentos",100,0,5,0);
			misBodegas[1] = new Bodega(2222,"Carrera 2 #71-21","Quimicos",100,0,5,0);
			misBodegas[2] = new Bodega(3333,"Carrera 3 #71-32","Alimentos",100,0,5,0);
			misBodegas[3] = new Bodega(4444,"Carrera 4 #71-43","Quimicos",100,0,5,0);
			misBodegas[4] = new Bodega(5555,"Carrera 5 #71-43","Quimicos",100,0,5,0);
			
			
			Tren[] misTrenes = new Tren[5];
			
			misTrenes[0] = new Tren("Alimentos", 11,20,0);
			//misTrenes[1] = new Tren("Alimentos", 22,30,0);
			
			for(int i=0; i<5;i++)
			{
				
				JOptionPane.showMessageDialog(null,"EL TIPO DEL TREN ES: "+tipoTren+
						   "EL TIPO DE LA BODEGA #"+misBodegas[i].getId()+
						   " ES: "+misBodegas[i].getTipo()+
						   "Capacidad Actual Trenes: "+misBodegas[i].getActual_tren());

			}
			
			for(int i=0; i<5;i++)
			{
				if(tipoTren != misBodegas[i].getTipo())
				{
					JOptionPane.showMessageDialog(null,"LOS TIPOS NO COINCIDEN");
					break;
				}
				
				else
				{
					JOptionPane.showMessageDialog(null,"EL TREN #"+misTrenes[0]+"FUE GUARDADO EN LA BODEGA #"+misBodegas[i]);
				}
				
			}
			
			
		}
}


