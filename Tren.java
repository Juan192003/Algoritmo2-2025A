
public class Tren {

	String tipo;
	int id;
	double carga_maxtone,carga_actual;
	
	//metodo constructor
	public Tren() {
		
	}

	public Tren(String tipo, int id, double carga_maxtone, double carga_actual) {
		super();
		this.tipo = tipo;
		this.id = id;
		this.carga_maxtone = carga_maxtone;
		this.carga_actual = carga_actual;
	}

	//get and set
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCarga_maxtone() {
		return carga_maxtone;
	}

	public void setCarga_maxtone(double carga_maxtone) {
		this.carga_maxtone = carga_maxtone;
	}

	public double getCarga_actual() {
		return carga_actual;
	}

	public void setCarga_actual(double carga_actual) {
		this.carga_actual = carga_actual;
	}
	
	
	
	}
