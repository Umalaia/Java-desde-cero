package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Cliente;
import modelo.javabean.Cuenta;

public class CuentaDaoImplList implements CuentaDao{

	private ArrayList<Cuenta> lista;
	
	public CuentaDaoImplList() {
		lista = new ArrayList<>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		ClienteDaoImplList clidao = new ClienteDaoImplList();
		
		lista.add(new Cuenta(1000, "ahorro", 2000, clidao.buscarUno("1234A")));
		lista.add(new Cuenta(2000, "corriente", 7000, clidao.buscarUno("1234A")));
		lista.add(new Cuenta(3000, "juvenil", 1000, clidao.buscarUno("3333A")));

	}

	
	@Override
	public boolean alta(Cuenta cuenta) {
		if (lista.contains(cuenta))
			return false;
		else return lista.add(cuenta);
	}

	
	@Override
	public Cuenta buscarUno(int idCuenta) {
		Cuenta cuenta = new Cuenta();
		cuenta.setIdCuenta(idCuenta);
		int posicion = lista.indexOf(cuenta);
		
		if (posicion == -1)
			return null;
		
		return lista.get(posicion);
	}

	
	@Override
	public ArrayList<Cuenta> buscarTodos() {
		return lista;
	}

	
	@Override
	public ArrayList<Cuenta> buscarPorClientes(String idCliente) {
		ArrayList<Cuenta> aux = new ArrayList<>();
		for (Cuenta ele: lista) {
				if (ele.getCliente().getIdCliente().equals(idCliente))
				aux.add(ele);
		}
			return aux;
	}

}
