
public class Mainclass {

	public static void main (String[]args)
	{
		// crear un nuevo empleado sin valores en sus atributos
		Empleado diego = new Empleado();
		//Empresa empresa1 = new Empresa();
		diego.setNombre("Diego Fernando Loaiza Buitrago");
		diego.setTelefono("3211234567");
		diego.setDireccion("calle 123 carrera 456");
		
		System.out.println("\nSe acabo de crear el empleado" + diego.getNombre() +" que vive en " + diego.getDireccion() + "y que tiene telefono" + diego.getTelefono());
		
		//se pueden modificar los atributos cuando son publicos
		/*
		diego.direccion = "calle 123 carrera 456";
		diego.nombre = "Diego Fernando Loaiza";
		diego.eps ="Sura";
		diego.telefono ="3211234567";
		diego.tipo = "Docente timepo completo";
		diego.salario_base = -15000.0f;
		*/
		
		
	}
	
}
