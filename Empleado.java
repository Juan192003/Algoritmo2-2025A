
//import java.util.Date;

public class Empleado {

	
	//atributos:
	private String nombre, direccion, telefono, tipo, eps, fondo_pensiones;
	private float salario_base;
	//private Date fechaNac;
	
	private static float SALARIO_MIN =1423000.0F;
	
	//metodos:
	//metodo constructor de empleado, crea un objeto Empleado sin atributos inicializados
	//prox calse relaciones
	
	public Empleado()
	{
		
	}
	
	

	public Empleado(String nombre, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}



	public Empleado(String nombre, String direccion, String telefono, String tipo, String eps, String fondo_pensiones,
			float salario_base) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.tipo = tipo;
		this.eps = eps;
		this.fondo_pensiones = fondo_pensiones;
		this.salario_base = salario_base;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		
		if( ! nombre.isEmpty())  //nombre no es vacio
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		
		if( ! direccion.isEmpty())
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		
		if( !telefono.isEmpty())
		this.telefono = telefono;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEps() {
		return eps;
	}

	public void setEps(String eps) {
		this.eps = eps;
	}

	public String getFondo_pensiones() {
		return fondo_pensiones;
	}

	public void setFondo_pensiones(String fondo_pensiones) {
		this.fondo_pensiones = fondo_pensiones;
	}
	//este metodo permite consultar el valor del atributo salario_base

	public float getSalario_base() {
		return salario_base;
	}
	//set metodo de modificacion,permite cambiar el valor del atributo salario_base
	//permite controlar la logica de la modificacion del atributo

	public void setSalario_base(float salario_base) {
		if(salario_base >= SALARIO_MIN) 
		{
			this.salario_base = salario_base;
		}
	}
	
	
	
	
	
	
}
