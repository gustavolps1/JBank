package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import beans.ClienteBean;
import connection.SingleConnection;

public class ClienteDao {

	private Connection connection;

	public ClienteDao() {
		connection = SingleConnection.getConnection();
	}

	public boolean insert(ClienteBean clienteBean) {
		try {
			String query = "INSERT INTO Clientes(Email, CPF, Nome, Senha) VALUES (?, ?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, clienteBean.getEmail());
			statement.setString(2, clienteBean.getCpf());
			statement.setString(3, clienteBean.getNome());
			statement.setString(4, clienteBean.getSenha());
			statement.execute();
			connection.commit();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();

			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}
		return false;
	}
}
