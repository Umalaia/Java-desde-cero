package testing;

import modelo.javabean.Cliente;
import modelo.javabean.Cuenta;
import modelo.javabean.Oficina;

public class TestAsociacion {

	public static void main(String[] args) {
		Oficina ofi1 = new Oficina(9282, "Madrid2", "Calle del pez 3", "Madrid", "914167899");
		Cliente cli1 = new Cliente("725456665B", "Angel", "Uria Benitez", "Madrid", "ab@ii.es", ofi1);
		
		Cuenta cta1 = new Cuenta(1000, "Ahorro", 2000, cli1);
		Cuenta cta2 = new Cuenta(2000, "Corriente", 4000, new Cliente("88776655A", "Sara", "Perez Alvarez", "Sevilla", "sara@ee.es",ofi1));
		
		
		
		/*
		 * desde cuenta 2 vamos a sacar: el codigo de la cuenta, el saldo de la cuenta, 
		 * los apellidos del titular de la cuenta y telefono oficina
		 */
		
		System.out.println("codigo cuenta2 y saldo : " + cta2.getIdCuenta() + " - " + cta2.getSaldo());
		System.out.println("apellidos del titular de la cuenta  2 : " + cta2.getCliente().getApellidos());
		System.out.println(" telefono oficina cliente de la cuenta 2 : " + cta2.getCliente().getOficina().getTelefono());
		
	}

}
