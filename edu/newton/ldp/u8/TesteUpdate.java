package edu.newton.ldp.u8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class TesteUpdate {
	public static final String DRIVER = "org.h2.Driver";
	public static final String URL = "jdbc:h2:file:C:\\Users\\Gadrit\\Documents\\sql\\data";
	public static final String USER = "sa";
	public static final String PASSWORD = "";
	
	static void select(Connection con) throws SQLException {
		var statement = con.createStatement();
		var sql = "select * from users";
		var resultado = statement.executeQuery(sql);
		
		if(resultado.next() == false) {
			System.out.println("Nenhum resultado encontrado");
		} else {
			do { //iterador
				var entityId = resultado.getInt("id");
				var name = resultado.getString("name");
				var password = resultado.getString("password");
				
				System.out.println(entityId + " - " + name + " - " + password);
			} while(resultado.next());
		}
		
		resultado.close();
		statement.close();
	}
	
	static void selectPorId(int id, Connection con) throws SQLException {
		var statement = con.createStatement();
		var sql = "select * from users where id = " + id;
		var resultado = statement.executeQuery(sql);
		
		if(resultado.next() == false) {
			System.out.println("Nenhum resultado encontrado");
		} else {
			do { //iterador
				var entityId = resultado.getInt("id");
				var name = resultado.getString("name");
				var password = resultado.getString("password");
				
				System.out.println(entityId + " - " + name + " - " + password);
			} while(resultado.next());
		}
		
		resultado.close();
		statement.close();
	}
	
	public static void exibirMenu() {
		System.out.println("MENU");
		System.out.println("1. listar");
		System.out.println("2. obter por ID");
		System.out.println("3. criar");
		System.out.println("4. atualizar");
		System.out.println("5. excluir");
		System.out.println("6. sair\n");
		
		System.out.println("Selecione uma das opçoes acima");
	}
	
	public static void deletePorId(Connection con, int id) throws SQLException {
		var statement = con.createStatement();
		var sql = "delete from users where id = " + id;
		var res = statement.executeUpdate(sql);
		System.out.println("\nlinhas atualizadas: " + res);
		
		statement.close();
	}
	
	public static void adicionar(String nome, String senha, Connection con) throws SQLException {
		var statement = con.createStatement();
		var sql = "insert into users (name, password) values ('" + nome + "', '" + senha + "')";
		var res = statement.executeUpdate(sql);
		
		statement.close();
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String nome = "", senha = "";
		int op = 0;
		var id = 0;
		Connection con = null;
		var sc = new Scanner(System.in);
		
		try {
			// Obter conexão
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Conexão realizada com sucesso!");
			
			//Menu
			while(op != 6) {
				exibirMenu();
				op = Integer.parseInt(sc.nextLine());
				
				switch(op) {
				case 1: //listar
					select(con);
					break;
				case 2: //obter por ID
					System.out.println("Informe o ID desejado:");
					id = sc.nextInt();
					selectPorId(id, con);
					sc.nextLine();
					break;
				case 3: //criar
					System.out.println("Novo nome:");
					nome = sc.nextLine();
					System.out.println("Nova senha:");
					senha = sc.nextLine();
					
					adicionar(nome, senha, con);
					
					break;
				case 4: //atualizar
					System.out.println("Informe o ID desejado:");
					id = sc.nextInt();
					sc.nextLine();
					System.out.println("Novo nome:");
					nome = sc.nextLine();
					System.out.println("Nova senha:");
					senha = sc.nextLine();
					
					var statement = con.createStatement();
					var sql = "update users set name = '" + nome + "', password = '" + senha + "' where id = " + id;
					var res = statement.executeUpdate(sql);
					
					System.out.println("Número de linhas atualizadas: " + res);
					statement.close();
					break;
				case 5: //excluir
					System.out.println("Informe o ID desejado:");
					id = sc.nextInt();
					sc.nextLine();
					selectPorId(id, con);
					
					System.out.println("Confirma a exclusão? [S/N]");
					var soun = sc.nextLine().toLowerCase();
					
					if(soun.equals("s")) {
						deletePorId(con, id);
					}else {
						System.out.println("Exclusão cancelada");
					}
					break;
					
				}
			}
		} catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			if(con != null && !con.isClosed()) {
				con.close();
			}
		}

	}

}
