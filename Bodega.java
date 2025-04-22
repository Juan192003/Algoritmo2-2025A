
public class Bodega {

	int id;
	String direccion,tipo;
	double capa_maxtone,actual_tone;
	int capa_maxtren,actual_tren;
	
	//metodo constructor
	public Bodega() {
		
	}
	
	
	public Bodega(int id, String direccion, String tipo, double capa_maxtone, double actual_tone, int capa_maxtren,
			int actual_tren) {
		//super();
		this.id = id;
		this.direccion = direccion;
		this.tipo = tipo;
		this.capa_maxtone = capa_maxtone;
		this.actual_tone = actual_tone;
		this.capa_maxtren = capa_maxtren;
		this.actual_tren = actual_tren;
	}

	


	//get and set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getCapa_maxtone() {
		return capa_maxtone;
	}

	public void setCapa_maxtone(double capa_maxtone) {
		this.capa_maxtone = capa_maxtone;
	}

	public double getActual_tone() {
		return actual_tone;
	}

	public void setActual_tone(double actual_tone) {
		this.actual_tone = actual_tone;
	}

	public int getCapa_maxtren() {
		return capa_maxtren;
	}

	public void setCapa_maxtren(int capa_maxtren) {
		this.capa_maxtren = capa_maxtren;
	}

	public int getActual_tren() {
		return actual_tren;
	}

	public void setActual_tren(int actual_tren) {
		this.actual_tren = actual_tren;
	}
	
	
	

	//recibir tren
	
}
