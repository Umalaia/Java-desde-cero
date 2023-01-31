package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Cliente;
import modelo.javabean.Oficina;

public class ClienteDaoImplList implements ClienteDao{

	private ArrayList<Cliente> lista;
	
	public ClienteDaoImplList() {
		lista = new ArrayList<>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		BancoDaoImplList bdao = new BancoDaoImplList(null);
		
		lista.add(new Cliente("1234A", "Eva", "Garcia", "Calle de la luz 36", "egarcia@ii.es", bdao.buscarUna(9001)));
		lista.add(new Cliente("2222A", "Sara", "Varas", "Calle de la oscuridad 42", "svaras@ii.es", bdao.buscarUna(9001)));
		lista.add(new Cliente("3333A", "Carlos", "Largos", "Calle pez 36", "clargos@ii.es", bdao.buscarUna(9003)));
	}

	
	
	
	@Override
	public boolean alta(Cliente cliente) {
		if (lista.contains(cliente))
			return false;
		else return lista.add(cliente);
	
	}

	
	@Override
	public Cliente buscarUno(String idCliente) {
		Cliente cliente = new Cliente();
		cliente.setIdCliente(idCliente);
		int posicion = lista.indexOf(cliente);
		
		if (posicion == -1)
			return null;
		
		return lista.get(posicion);
	}

	
	@Override
	public ArrayList<Cliente> buscarTodos() {
		return lista;
	}

	
	@Override
	public ArrayList<Cliente> buscarClientesOficina(int idOficina) {
		ArrayList<Cliente> aux = new ArrayList<>();
		for (Cliente ele: lista) {
				if (ele.getOficina().getIdOficina() == idOficina)
				aux.add(ele);
		}
			return aux;
	}
		

	

}
