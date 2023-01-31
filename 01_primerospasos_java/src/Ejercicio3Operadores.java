import javax.sql.rowset.JoinRowSet;

public class Ejercicio3Operadores {

	public static void main(String[] args) {
		/*
		 * Operadores matematicos : +, -, *, /, %
		 * Operadores de aisgnacion: =
		 * Operadores : acumuladores: +=,-=,*=,/=,%=
		 * contadores : de uno en 1, operadores unarios ++ y --
		 */

		
		int num1 = 0;
		int num2 = 16;
		int num3 = 4, num4 = 5, num5 =9;
		
		num1 = (num2 + num3) * num5;
		
		/*
		 * acumuladores
		 */
		num1 = num1 + num5;
		num1 += num5;
		
		/*
		 * contadores
		 */
		num1 = num1 + 1;
			num1 += 1;
		/*
		 * incrementar valor
		 */
		num1++;
		++num1;
		
		
		
		int entero1 = 7, resultado = 0;
		resultado = entero1++;
		
		/*
		 * Operadores relacion: <,<=,>, >=, ==,!=, negar una condicion !
		 * comaparan el CONTENIDO de dos variables en memoria
		 * dos tipos por el contenido: 
		 * los basicos que contienen el valor 
		 * los de tipo clase que contienen la direccion donde esta el contenido de la JVM
		 */
		
		
		/*
		 * Operadores logico, para enlazar condiciones:
		 * && -> Y
		 * || -> OR
		 */
		
		
		
		
		
	}

}
