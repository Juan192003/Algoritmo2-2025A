
public class Empresa {

	//atributos:
	//atributos privados
	private String NIT, Nombre, Direccion, Telefono, email;
	private float capital_inicial, capital_actual, valor_accion_mercado;
	private float MIN_CAPITAL = 500000;
	
	
	//metodos:
	
	//constructor de la clase empresa: crea un objeto de esta clase sin atributos inicializados
	//encapsulamiento
	//capacidad que tiene cada clase de modificar y controlar el acceso a sus atributos y metodos
	//modificadores de acceso public y private
	
	
	public Empresa()
	{
		
	}

	public String getNIT() {
		return NIT;
	}

	public void setNIT(String nIT) {
		NIT = nIT;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		
		Telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getCapital_inicial() {
		return capital_inicial;
	}

	public void setCapital_inicial(float capital_inicial) {
		if(capital_inicial > MIN_CAPITAL)
		this.capital_inicial = capital_inicial;
	}

	public float getCapital_actual() {
		return capital_actual;
	}

	public void setCapital_actual(float capital_actual) {
		this.capital_actual = capital_actual;
	}

	public float getValor_accion_mercado() {
		return valor_accion_mercado;
	}

	public void setValor_accion_mercado(float valor_accion_mercado) {
		this.valor_accion_mercado = valor_accion_mercado;
	}
	
	
	
}
