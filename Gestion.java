
public class Gestion {

	public static void main(String[]args) {
	
		//crear bodegas
	Bodega bo1 = new Bodega (1111,"Carrera 1 #71-10","Alimentos",100,0,5,0);
	Bodega bo2 = new Bodega (2222,"Carrera 2 #71-21","Quimicos",100,0,5,0);
	Bodega bo3 = new Bodega (3333,"Carrera 3 #71-32","Alimentos",100,0,5,0);
	Bodega bo4 = new Bodega (4444,"Carrera 4 #71-43","Quimicos",100,0,5,0);
	Bodega bo5 = new Bodega (4444,"Carrera 5 #71-54","Alimentos",100,0,5,0);
	

	System.out.println("el id de bodega 1 es: " + bo1.getId() + " dirrecion: "+ bo1.getDireccion() + " su tipo es: "+ bo1.getTipo() + " su capacidad maxima es: " + bo1.getCapa_maxtone()+"toneladas" + " su capacidad actual es:" + bo1.getActual_tone() + " su capacidad maxima de trenes es: " + bo1.getCapa_maxtren() + " su capacidad actual de trenes es: " + bo1.getActual_tren());
	System.out.println("el id de bodega 2 es: " + bo2.getId() + " dirrecion: "+ bo2.getDireccion() + " su tipo es: "+ bo2.getTipo() + " su capacidad maxima es: " + bo2.getCapa_maxtone()+"toneladas" + " su capacidad actual es:" + bo2.getActual_tone() + " su capacidad maxima de trenes es: " + bo2.getCapa_maxtren() + " su capacidad actual de trenes es: " + bo2.getActual_tren());
	System.out.println("el id de bodega 3 es: " + bo3.getId() + " dirrecion: "+ bo3.getDireccion() + " su tipo es: "+ bo3.getTipo() + " su capacidad maxima es: " + bo3.getCapa_maxtone()+"toneladas" + " su capacidad actual es:" + bo3.getActual_tone() + " su capacidad maxima de trenes es: " + bo3.getCapa_maxtren() + " su capacidad actual de trenes es: " + bo3.getActual_tren());
	System.out.println("el id de bodega 4 es: " + bo4.getId() + " dirrecion: "+ bo4.getDireccion() + " su tipo es: "+ bo4.getTipo() + " su capacidad maxima es: " + bo4.getCapa_maxtone()+"toneladas" + " su capacidad actual es:" + bo4.getActual_tone() + " su capacidad maxima de trenes es: " + bo4.getCapa_maxtren() + " su capacidad actual de trenes es: " + bo4.getActual_tren());
	System.out.println("el id de bodega 5 es: " + bo5.getId() + " dirrecion: "+ bo5.getDireccion() + " su tipo es: "+ bo5.getTipo() + " su capacidad maxima es: " + bo5.getCapa_maxtone()+"toneladas" + " su capacidad actual es:" + bo5.getActual_tone() + " su capacidad maxima de trenes es: " + bo5.getCapa_maxtren() + " su capacidad actual de trenes es: " + bo5.getActual_tren());
	System.out.println("\n");
	//crear tren
	Tren tren1 = new Tren ("Alimentos",123,20,0);
	
	System.out.println("El tipo de carga del tren es: "+ tren1.getTipo() + " su identificador es: " + tren1.getId() + " tiene una capacidad maxima de: " + tren1.getCarga_maxtone()+"toneladas" + " su capacidad actual es: " + tren1.getCarga_actual());
	
	}
	
	
}
