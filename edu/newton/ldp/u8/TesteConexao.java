package edu.newton.ldp.u8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class TesteConexao {
	public static final String DRIVER = "org.h2.Driver";
	public static final String URL = "jdbc:h2:file:C:\\Users\\Gadrit\\Documents\\sql\\data";
	public static final String USER = "sa";
	public static final String PASSWORD = "";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;
		try {
			
			Class.forName(DRIVER);
			
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			
			
			System.out.println("Status: " + !con.isClosed());
		} catch(ClassNotFoundException ex) {
			System.out.println("Driver não encontrado");
		} catch(SQLException ex) {
			System.out.println("Não foi possivel se conectar com o banco " + ex.getMessage());
		} finally {
			if(con != null && !con.isClosed()) {
				con.close();
			}
		}

	}
	
	public static Connection obterConexao() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName(DRIVER);
		con = DriverManager.getConnection(URL, USER, PASSWORD);	
		System.out.println("Conexão iniciada com sucesso!");
		
		return con;
	}

}
