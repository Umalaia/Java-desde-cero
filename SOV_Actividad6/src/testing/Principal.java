package testing;

import modelo.javabeans.Administrativo;
import modelo.javabeans.Alumno;
import modelo.javabeans.Profesor;

public class Principal {

	public static void main(String[] args) {
		// Crear un objeto Profesor, Administrativo y Alumno
		 
		Profesor p1 = new Profesor();
		Profesor p2 = new Profesor("1234567k", "Pepe", "C/Pez, 2", "644525625", "Programacion");
		
		Alumno al1 = new Alumno();
		Alumno al2 = new Alumno("2315645l", "Lara", "C/Sol, 5", "654789632", "1º DAW");
		
		Administrativo ad1 = new Administrativo();
		Administrativo ad2 = new Administrativo("5412356p", "Elena", "C/Luna, 8" , "689521412", "Personal");
		
		// Ejecutar el método toString() sobre cada uno de ellos.
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(al1.toString());
		System.out.println(al2.toString());
		System.out.println(ad1.toString());
		System.out.println(ad2.toString());
		
		// Ejecutar el método trabajar() sobre cada uno de ellos.
		System.out.println(p2.trabajar());
		System.out.println(al2.trabajar());
		System.out.println(ad2.trabajar());
		
		// Ejecutar el metodo llamar Alumno
		System.out.println(al2.llamar(p2));
		
		// Ejecutar el metodo poner Notas
		System.out.println(p2.ponerNotas());
		
		// Ejecutar el metodo hacer examen
		System.out.println(al2.hacerExamen());
		
		// Ejecutar el metodo gestionar matricula
		System.out.println(ad2.gestionarMatricula());
		
		

	}

}
