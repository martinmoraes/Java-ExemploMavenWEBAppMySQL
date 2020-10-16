package com.moraes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CNXJDBC {

	private String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private String usuario = "desenvolvedor";
	private String senha = "!qAz@wSx";
//	private String PathBase = "C:\\Users\\Usuário\\Documents\\Desenvolvimento\\Java\\CalculadoraWEBAPP\\base\\calculos";
	private String URL = "jdbc:mysql://localhost:3306/avalog?serverTimezone=GMT-3";
	// String params = "?useTimezone=true&serverTimezone=UTC";

	public Connection conectar() {
		try {
			Class.forName(DRIVER_CLASS);
			return DriverManager.getConnection(URL, usuario, senha);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
