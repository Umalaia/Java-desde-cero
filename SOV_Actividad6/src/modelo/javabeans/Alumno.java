package modelo.javabeans;

public class Alumno extends Persona{
	
	// 3º Creo el javabean de la clase Alumno y hago extends de Persona, ya que heredaré datos en el constructor con todo,
	private String curso;
		
	// Constructores
	public Alumno(String nif, String nombre, String direccion, String telefono, String curso) {
		super(nif, nombre, direccion, telefono);
		this.curso = curso;
	}

	public Alumno() {
		super();
	}

	
	//Getter and setter
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	
	// Redefinicion de objetos
	// Cojo el toString junto con los de la clase padre, para heredar los gets, ya que los atributos son privados
	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", getNif()=" + getNif() + ", getNombre()=" + getNombre()
				+ ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono() + "]";
	}

	//	Metodo propio de la clase Alumno
	public String hacerExamen() {
		return "El alumno " + this.getNombre() + " va a hacer su examen.";
	}
	

	// Metodo heredado de la clase Persona
	@Override
	public String trabajar() {
		return "El alumno " + this.getNombre() + " va a estudiar para el curso " + this.getCurso();
	}
	
	

}
