package javabeans;

public class Persona {

	//crear una constante
	public static final String EMAIL_COMPANY = "info@edix.com";
	private static int numeroPersona;
	
	
	//constructores
	private int numero;
	private double altura;
	private double peso;
	public Persona(double altura, double peso) {
		super();
		this.numero = ++numeroPersona; //++ para que la variable se inicialice con 1 en vez de con 0
		this.altura = altura;
		this.peso = peso;
	}
	public Persona() {
		super();
		numero = ++numeroPersona;
	}
	
	//getter and setter
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public static int getNumeroPersona() {
		return numeroPersona;
	}
	
	
	
	//toString

	@Override
	public String toString() {
		return "Persona [numero=" + numero + ", altura=" + altura + ", peso=" + peso + "]";
	}
	
	
	//metodos propios
	
	
	public String calcularImc() {
		
		return "Este es el imc de las presonas de mi clase " + altura;
	}
	
	public static String calcularImc(double tuAltura, double tuPeso) {
		
		return "Este es el imc de las presonas de fuera la clase " + tuPeso;
		
	}
	
	
	
	
}
