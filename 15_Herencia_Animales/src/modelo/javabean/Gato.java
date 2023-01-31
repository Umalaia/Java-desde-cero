package modelo.javabean;

public class Gato extends Animal{
	private int vidas;

	//CONSTRUCTORES DE UNA CLASE QUE HEREDA
	public Gato() {
		super();
	}

	public Gato(int numeroPatas, boolean tienesVertebradas, String nombre,int vidas) {
		super(numeroPatas, tienesVertebradas, nombre);
		this.vidas = vidas;
	}

	//GETTER AND SETTER
	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	//TO STRING CON DATOS HEREDADOS
	@Override
	public String toString() {
		return "Gato [numeroPatas=" + numeroPatas + ", tienesVertebradas=" + tienesVertebradas + ", vidas=" + vidas
				+ "]";
	}

	
	//REDEFINIMOS LOS METODOS HEREDADOS DEL PADRE
	@Override
	public void saludar() {
		System.out.println("Soy un gato y me llamo : " + nombre);
	}

	@Override
	public void sonido() {
		System.out.println("y hago MIAUUU");
	}

	@Override
	public void medioLocomocion() {
		System.out.println("Soy terrestre");
	}
	
	
	
	

}
