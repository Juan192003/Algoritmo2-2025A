package persistencia;

public class Persona {

	private String doc, nombre, cuidad;
	private int anio_nac;
	
	public Persona(String doc, String nombre, String cuidad, int anio_nac) {
		super();
		this.doc = doc;
		this.nombre = nombre;
		this.cuidad = cuidad;
		this.anio_nac = anio_nac;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuidad() {
		return cuidad;
	}

	public void setCuidad(String cuidad) {
		this.cuidad = cuidad;
	}

	public int getAnio_nac() {
		return anio_nac;
	}

	public void setAnio_nac(int anio_nac) {
		this.anio_nac = anio_nac;
	}
	
	//consulta y modificacion encapsulamiento cada clase controle el acceso a sus atributos
	
}
