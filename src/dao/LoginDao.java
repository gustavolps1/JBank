package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.LoginBean;
import connection.SingleConnection;

public class LoginDao {

	private Connection connection;

	public LoginDao() {
		connection = SingleConnection.getConnection();
	}

	public boolean select(LoginBean loginBean) {
		try {
			String query = "SELECT CPF, Senha from Clientes WHERE CPF = '" + loginBean.getCpf() + "' AND Senha = '"
					+ loginBean.getSenha() + "'";
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet resultSet = statement.executeQuery();
			if (resultSet.next()) {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
