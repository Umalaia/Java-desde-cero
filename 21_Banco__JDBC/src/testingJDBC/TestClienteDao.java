package testingJDBC;

import modelo.dao.ClienteDao;
import modelo.dao.ClienteDaoImplMy8;
import modelo.dao.OficinaDao;
import modelo.dao.OficinaDaoImplMy8;
import modelo.javabean.Cliente;


public class TestClienteDao {

	public static void main(String[] args) {
		ClienteDao cdao = new ClienteDaoImplMy8();
		OficinaDao odao = new OficinaDaoImplMy8();
		Cliente cliente = new Cliente("14444444A", "Sara", "Lopez", "Cordoba", "s@a.com", odao.buscarUna(9001));
		System.out.println(cdao.altaCliente(cliente));

	}

}
