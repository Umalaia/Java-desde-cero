package modelo.dao;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dao.AbstractDaoMy8;
import modelo.dao.ClienteDao;
import modelo.javabean.Cliente;

public class ClienteDaoImplMy8 extends AbstractDaoMy8 implements ClienteDao {

	@Override
	public boolean alta(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int altaCliente(Cliente cliente) {
		sql = "insert into clientes values (?,?,?,?,?,?)";
		filas = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cliente.getIdCliente());
			ps.setString(2, cliente.getNombre());
			ps.setString(3, cliente.getAplellidos());
			ps.setString(4, cliente.getDireccion());
			ps.setString(5, cliente.getEmail());
			ps.setInt(6, cliente.getOficina().getIdOficina());
			filas = ps.executeUpdate();
			filas = 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filas;
	}

	@Override
	public Cliente buscarUno(String idCliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Cliente> buscarClientesOficina(int idOficina) {
		// TODO Auto-generated method stub
		return null;
	}

}
