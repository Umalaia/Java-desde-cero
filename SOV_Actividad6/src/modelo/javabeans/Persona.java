package modelo.javabeans;

import java.util.Objects;

// 1º Me creo el javabean con la clase persona, con sus constraructores, getter and setter, toString(), y hashCode y equals
// pasandole el nif. Tambien creo la clase abstracta trabajar, de la que heredaran las clases Alumno, Administrativo y Profesor, 
// que las implementaran en cada clase dependiendo de lo que haga en cada una de ellas.
// 2º Creo el javabean Administrativo
public abstract class Persona {
	
	private String nif, nombre, direccion,telefono;

	public Persona(String nif, String nombre, String direccion, String telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public Persona() {
		super();
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]";
	}
	
	// Metodos propios
	public String llamar(Persona p) {
		return this.getNombre() + " llamando a "+ p.getNombre();
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(nif, other.nif);
	}

	// El metodo trabajar es un ejemplo de polimorfismo, porque dependiendo de la clase que lo use 
	//funciona de una forma u otra
	abstract public String trabajar();
	

}
