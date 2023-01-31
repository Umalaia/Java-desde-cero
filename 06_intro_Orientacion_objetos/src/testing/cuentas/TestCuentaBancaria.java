package testing.cuentas;
import javabeans.CuentaBancaria;

public class TestCuentaBancaria {

	public static void main(String[] args) {
		CuentaBancaria cuenta1 = new CuentaBancaria();
		cuenta1.setNombre("Tomas");
		cuenta1.setIdCuenta(1000);
		cuenta1.setApellidos("Escu Delgado");
		cuenta1.setTipoCuenta("Ahorro");
		cuenta1.setGenero('H');
		cuenta1.setSaldo(20_000);
		
		CuentaBancaria cuenta2 = new CuentaBancaria(2000, "corriente", "Sara", "Varas", 'm', 34_000);
		
		System.out.println(cuenta1.getSaldo());
		System.out.println("nombre de cuenta 1 es : " + cuenta1.getNombre());
		System.out.println(cuenta1);

		System.out.println("nombre de cuenta 2 es : " + cuenta2.getNombre());
		cuenta2.ingresar(30_000);
		cuenta2.extraer(100_000);
		System.out.println("saldo de cuenta 2 es : " + cuenta2.getSaldo());
		System.out.println(cuenta2.literalGenero());
		System.out.println(cuenta2.nombreCompleto());
		System.out.println(cuenta2);
		
		
		}
	
}

