package testing;

import javabeans.Empleado;

public class testEmpleado {

	public static void main(String[] args) {
		//Crear la clase empleado y asignar un valor a sus atributos para mostrarlos por consola
		Empleado emp1 = new Empleado(000001, "Sheila", "Orejuela Valenzuela", "sheila.orejuela@gmail.com", 12000, 60, 'M', 280891);
		Empleado emp2 = new Empleado();
		
		System.out.println(emp1);
		
				
		//llamar a los metodos de la clase y mostrarlos por consola
		
		System.out.println("SALARIO BRUTO ANUAL: " + emp1.salarioBruto());
		//Inserto 12 dentro del parentesis ya que se calcula en base a 12 meses (pagas).
		System.out.println("SALARIO MENSUAL : " + emp1.salarioMensual(12));
		System.out.println("SEXO : " + emp1.literalSexo());
		System.out.println("OBTENER EMAIL : " + emp1.obtenerEmail());
		System.out.println("NOMBRE COMPLETO : " + emp1.nombreCompleto());
		System.out.println(" ");
		
		
		
		//rellenar los datos del emp2 usando los metodos set y mostrarlos
		
		emp2.setIdEmpleado(000002);
		emp2.setNombre("Miguel");
		emp2.setApellidos("Castillo Martín");
		emp2.setEmail("miguel.castillo@gmail.com");
		emp2.setSalario(20000);
		emp2.setComplemento(300);
		emp2.setSexo('H');
		emp2.setIdDepartamento(170191);
		
		System.out.println(emp2);
		
		//llamar a los metodos de la clase y mostrarlos por consola
		
		System.out.println("SALARIO BRUTO ANUAL: " + emp2.salarioBruto());
		//Inserto 12 dentro del parentesis ya que se calcula en base a 14 meses (pagas).
		System.out.println("SALARIO MENSUAL : " + emp2.salarioMensual(14));
		System.out.println("SEXO : " + emp2.literalSexo());
		System.out.println("OBTENER EMAIL : " + emp2.obtenerEmail());
		System.out.println("NOMBRE COMPLETO : " + emp2.nombreCompleto());
		System.out.println(" ");
		
		
		System.out.println(emp2.getSexo());
		
		
		if(!(emp1.equals(emp2)))
			System.out.println("son distintos");
		else 
			System.out.println("son iguales");
	
	}

	

}
