import java.util.Scanner;

public class Ejercicio6 {
	//Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente 
	//(HORAS DE O A 23, MINUTOS DE 0 A 59 Y SEGUNDOS DE 0 A 59)
	public static void main(String[] args) {
		//datos de prueba
		int hora = 23,  min = 58, seg = 60;
		
		// algoritmo
		if (hora >=0 && hora <24)
			System.out.print(++hora + " : ");
		else if (hora==24)
			System.out.print("01 : ");
		else System.out.println("Hora erronea");
			
		if (min >=0 && min <60)
			System.out.print(++min + " : ");
		else if (min==60)
			System.out.print("01 : ");
		else System.out.println("Minutos erroneos");
		
		if (seg >=0 && seg <60)
			System.out.print(++seg);
		else if (seg==60)
			System.out.print("01");
		else System.out.println("Segundos erroneos");
		
	}
}
