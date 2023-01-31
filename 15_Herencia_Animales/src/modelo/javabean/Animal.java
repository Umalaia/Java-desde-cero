package modelo.javabean;

public class Animal {
	//SI QUIERES QUE TUS HIJOS VEAN TUS DATOS, PONER PROTECTED EN VEZ DE PRIVATE
	protected int numeroPatas;
	protected boolean tienesVertebradas;
	protected String nombre;
	
	//CONSTRUCTORES
	public Animal(int numeroPatas, boolean tienesVertebradas, String nombre) {
		super();
		this.numeroPatas = numeroPatas;
		this.tienesVertebradas = tienesVertebradas;
		this.nombre = nombre;
	}

	public Animal() {
		super();
	}

	//GETTER AND SETTER
	public int getNumeroPatas() {
		return numeroPatas;
	}


	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}


	public boolean isTienesVertebradas() {
		return tienesVertebradas;
	}


	public void setTienesVertebradas(boolean tienesVertebradas) {
		this.tienesVertebradas = tienesVertebradas;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//TO STRING
	
	
	//METODOS PROPIOS
	public void saludar(){
		System.out.println("Soy un animal y me llamo : " + nombre);
	}
	
	
	@Override
	public String toString() {
		return "Animal [numeroPatas=" + numeroPatas + ", tienesVertebradas=" + tienesVertebradas + ", nombre=" + nombre
				+ "]";
	}

	public void sonido(){
		System.out.println("y soy generico");
	}
	
	
	public void medioLocomocion() {
		System.out.println("tengo muchos elige uno; terrestre, acuaticos, vuelan");
	}
	
	
}
