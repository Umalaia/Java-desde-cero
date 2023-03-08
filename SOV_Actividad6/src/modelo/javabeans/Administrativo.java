package modelo.javabeans;

// 2º Creo el javabean administrativo y hago extends de Persona, ya que heredaré datos en el constructor con todo, el toString
// en el metodo gestionarMatricula (getNombre) y en el metodo trabajar (getNombre) -> * MIRAR METODOS *
// 3º Creo el javabean de la clase Alumno

public class Administrativo extends Persona{
	
	private String tareas;
	
	
	//Constructores
	public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif, nombre, direccion, telefono);
		this.tareas = tareas;
	}

	public Administrativo() {
		super();
	}


	//Getter and setter
	public String getTareas() {
		return tareas;
	}


	public void setTareas(String tareas) {
		this.tareas = tareas;
	}
	
	// Redefinicion de objetos
	// Cojo el toString junto con los de la clase padre, para heredar los gets, ya que los atributos son privados
	@Override
	public String toString() {
		return "Administrativo [tareas=" + tareas + ", getNif()=" + getNif() + ", getNombre()=" + getNombre()
				+ ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono() + "]";
	}
	

	// Metodo propio de la clase Administrativo
	/**
	 * Metodo que indica que Persona (administrativo) va a gestionar una matricula.
	 * @return El administrativo, pasandole el nombre con el this.getNombre(), y diciendo lo que va a hacer.
	 */
	public String gestionarMatricula() {
		return "El administrativo " + this.getNombre() + " va a gestionar una matricula";
	}
	

	// Metodo heredado de la clase Persona
	/**
	 * Metodo que indica que Persona (administrativo) va a realizar las tareas pasandole las tareas con un get.
	 * @return El administrativo, pasandole el nombre con el this.getNombre(), y diciendo lo que va a realizar mas las tareas con el this.getTareas().
	 */
	@Override
	public String trabajar() {
		return "El administrativo " + this.getNombre() + " va a realizar estas tareas : " + this.getTareas();
	}

}
