package connection;

import java.sql.Connection;
import java.sql.DriverManager;

import mysql.DatabaseMySQL;

public class SingleConnection implements DatabaseMySQL {

	static Connection connection = null;

	public static Connection getConnection() {
		return connection;
	}

	static {
		abrirConexao();
	}

	public SingleConnection() {
		abrirConexao();
	}

	public static void abrirConexao() {
		try {
			if (connection == null) {
				Class.forName(DRIVER);
				connection = DriverManager.getConnection(URL, USER, PASSWORD);
				connection.setAutoCommit(false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
