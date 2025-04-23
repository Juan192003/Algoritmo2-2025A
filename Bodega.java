import javax.swing.JOptionPane;

public class Bodega {

	//VARIABLES GLOBALES
	int id;
	String direccion,tipo;
	double capa_maxtone,actual_tone;
	int capa_maxtren,actual_tren;
	
	//METODO CONSTRUCTOR
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
	
	
	//INSTANCIA TREN
		Tren Objetotren = new Tren ();
	
	//METODOS GET
	public int getId() {
		return id;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public double getCapa_maxtone() {
		return capa_maxtone;
	}
	
	public double getActual_tone() {
		return actual_tone;
	}
	
	public int getCapa_maxtren() {
		return capa_maxtren;
	}
	
	public int getActual_tren() {
		return actual_tren;
	}
	
	//METODOS SET
	public void setId(int id) {
		this.id = id;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setCapa_maxtone(double capa_maxtone) {
		this.capa_maxtone = capa_maxtone;
	}

	public void setActual_tone(double actual_tone) {
		this.actual_tone = actual_tone;
	}

	public void setCapa_maxtren(int capa_maxtren) {
		this.capa_maxtren = capa_maxtren;
	}

	public void setActual_tren(int actual_tren) {
		this.actual_tren = actual_tren;
	}

}
