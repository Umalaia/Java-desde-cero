package javabeans;

public class Empleado {

	private int idEmpleado;
	private String nombre, apellidos, email;
	private double salario, complemento;
	private char sexo;
	private int idDepartamento;
	
	//constructores
	public Empleado() {
		
	}

	
	public Empleado(int idEmpleado, String nombre, String apellidos, String email, double salario, double complemento,
			char sexo, int idDepartamento) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.salario = salario;
		this.complemento = complemento;
		this.sexo = sexo;
		this.idDepartamento = idDepartamento;
	}


	//getter & setter
	
	public int getIdEmpleado() {
		return idEmpleado;
	}


	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public double getComplemento() {
		return complemento;
	}


	public void setComplemento(double complemento) {
		this.complemento = complemento;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	public int getIdDepartamento() {
		return idDepartamento;
	}


	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}


	//toString
	
	@Override
	public String toString() {
		return "Empleado [idEmpleado = " + idEmpleado + ", nombre = " + nombre + ", apellidos = " + apellidos + ", email = "
				+ email + ", salario = " + salario + ", complemento = " + complemento + ", sexo = " + sexo
				+ ", idDepartamento = " + idDepartamento + "]";
	}
	
	
	//metodos propios de la clase
	
	public double salarioBruto() {
		//Para sacar el salario bruto anual sumo la variable salario y la variable complemento
		double salarioBruto = 0.00;
		salarioBruto = (salario + complemento);
		return salarioBruto;
		
	}
	
	
	public double salarioMensual(int meses) {
		double salarioMensual = 0.00;
		double salarioBruto = (salario + complemento);
		salarioMensual = (salarioBruto/meses);
		return salarioMensual;
	}
	
	
	public String literalSexo() {
		//uso el valueOf para cambiar el atributo tipo char a String, y luego hago el return de la misma manera, para que me devuelva un String.
		String.valueOf(sexo);
		switch (sexo) {
		case 'H':
			return ("Hombre");
			
		case'M':
			return ("Mujer");	
		} 
		return String.valueOf(sexo);
		
	}
	
	
	public String obtenerEmail() {
		//me creo una variable tipo String llamada "primera letra", y le asigno el valor de la primera letra de la palabra nombre.
		String primeraLetra = String.valueOf(nombre.charAt(0));
		//creo la variable "primerApellido",un contador "x", "y" pasandole un espacio en blanco, e imprimir y la inicializo. 
		String primerApellido = "";
		int x = 0;
		char y = ' ';
		char imprimir = ' ';
		/* mientras que la longitud de los apellidos sea diferente a x, y si la letra es igual a un espacio en blanco, imprimir cada letra del apellido
		 * hasta que llega a ese caracter, lo que da lugar al primer apellido. Cambio el valor del contador para salir del bucle.
		 */
		while (apellidos.length() != x) {
			imprimir = apellidos.charAt(x);
		if (imprimir != y) {
			primerApellido += imprimir;
			x++;
		} else
			x = apellidos.length();
		}	
					
		
		for (int i = 0; i < nombre.length(); i++) {		
		}//uso el .toLowerCase para que se muestre en minusculas
		return primeraLetra.toLowerCase() + primerApellido.toLowerCase() + "@gmail.com"; 	     
		}
		

	
	public String nombreCompleto(){
		//concatenar el atributo nombre y el de apellidos
		return nombre + " " + apellidos;
		
	}




	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
