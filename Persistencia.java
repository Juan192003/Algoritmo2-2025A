package persistencia;

import java.io.FileReader;
import java.util.ArrayList;
//import java.io.BufferedReader;

public class Persistencia {

	public static void main(String[]args)
	{
		
		ArrayList<Persona> personas = new ArrayList<>();
		
		try
		{
			BufferedReader lectorArchivo = new BufferedReader ( new FileReader("*Untitled 1"));
			
			String linea;
			String datos[];
			//llemos hasta quye llegue al final del archivo o encuentre un null
			while ( (linea = lectorArchivo.readLine()  ) !=null) 
			{
				//separamos los datos de cada renglon
				datos = linea.split(";"); //split es separar
				
				//con cada dato, creamos un nuevo objeto persona y lo agregamos
				personas.add(  new  Persona( datos[0], datos[1], datos[2], Integer.parseInt(datos[3])   )   );
				// archivo es archivo de texto
			}
		}
		catch(Exception ex)
		{
			System.out.println("ha sucedido un error leyendo el archivo:" + ex.getMessage() );
		}
		finally
		{
		
		}
		
		//es un error que se debe controlar desde codigo con el fin de no ejecutar el programa,aquel codigo que genera errores y yo debo controlar
		//catch se maneja el error
		
		
		
		/*BufferedReader lectorArchivo = new BufferedReader ( new FileReader("*Untitled 1"));
		
		String linea;
		
		//llemos hasta quye llegue al final del archivo o encuentre un null
		while ( (linea = lectorArchivo.readLine()  ) !=null) 
		{
			
		}*/
		
	}
	
}
