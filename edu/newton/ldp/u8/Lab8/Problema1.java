package edu.newton.ldp.u8.Lab8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Problema1 {
	
	public static final String DRIVER = "org.h2.Driver";
	public static final String URL = "jdbc:h2:file:C:\\Users\\Gadrit\\Documents\\sql\\data";
	public static final String USER = "sa";
	public static final String PASSWORD = "";
	
	public static void cadastrar(Connection con, String titulo, String autor, int ano, String editora, String categoria) throws SQLException {
		//ferramentas do banco de dados
		var statement = con.createStatement();
		var sql = "insert into livros (titulo, autor, ano_publicacao, editora, categorias) values ('" + titulo + "', '" + autor +
				"', '" + ano + "', '" + editora + "', '" + categoria + "')";
		var num = statement.executeUpdate(sql);
		System.out.println("linhas afetadas: " + num);
		
		statement.close();
	}
	
	public static void listar(Connection con) throws SQLException {
		var statement = con.createStatement();
		var sql = "select * from livros";
		var resultado = statement.executeQuery(sql);
		
		while(resultado.next()) {
			var id = resultado.getInt("id");
			var titulo = resultado.getString("titulo");
			var autor = resultado.getString("autor");
			var ano = resultado.getInt("ano_publicacao");
			var editora = resultado.getString("editora");
			var categoria = resultado.getString("categorias");
			
			System.out.println("\nID: " + id + "\nTitulo: " + titulo + "\nAutor: " + autor + "\nAno de publicação: " + ano + "\nEditora: " + 
			editora + "\nCategoria: " + categoria);
		}
		
		resultado.close();
		statement.close();
	}
	
	public static void pesquisarTitulo(Connection con, String tituloDesejado) throws SQLException {
		var statement = con.createStatement();
		var sql = "select * from livros where titulo = '" + tituloDesejado + "'";
		var resultado = statement.executeQuery(sql);
		
		if(resultado.next()) {
			var id = resultado.getInt("id");
			var titulo = resultado.getString("titulo");
			var autor = resultado.getString("autor");
			var ano = resultado.getInt("ano_publicacao");
			var editora = resultado.getString("editora");
			var categoria = resultado.getString("categorias");
			
			System.out.println("\nID: " + id + "\nTitulo: " + titulo + "\nAutor: " + autor + "\nAno de publicação: " + ano + "\nEditora: " + 
			editora + "\nCategoria: " + categoria);
		}
		
		resultado.close();
		statement.close();
	}
	
	public static void pesquisarCategoria(Connection con, String categoriaDesejada) throws SQLException {
		var statement = con.createStatement();
		var sql = "select * from livros where categorias = '" + categoriaDesejada + "'";
		var resultado = statement.executeQuery(sql);
		
		if(resultado.next()) {
			var id = resultado.getInt("id");
			var titulo = resultado.getString("titulo");
			var autor = resultado.getString("autor");
			var ano = resultado.getInt("ano_publicacao");
			var editora = resultado.getString("editora");
			var categoria = resultado.getString("categorias");
			
			System.out.println("\nID: " + id + "\nTitulo: " + titulo + "\nAutor: " + autor + "\nAno de publicação: " + ano + "\nEditora: " + 
			editora + "\nCategoria: " + categoria);
		}
		
		resultado.close();
		statement.close();
	}
	
	public static void excluir(Connection con, int idDesejado) throws SQLException {
		var statement = con.createStatement();
		var sql = "delete from livros where id = " + idDesejado;
		statement.executeUpdate(sql);
		
		statement.close();
	}
	
	public static void menu() {
		System.out.println("\nMENU");
		System.out.println("1. Cadastrar");
		System.out.println("2. Listar todos os livros");
		System.out.println("3. Pesquisar por título");
		System.out.println("4. Pesquisar por categoria");
		System.out.println("5. Excluir livro por ID");
		System.out.println("6. Sair");
		System.out.println("Escolha uma das opções acima");
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		int op = 0;
		Scanner sc = new Scanner(System.in);
		//Conexão
		Connection con = null;
		Class.forName(DRIVER);
		con = DriverManager.getConnection(URL, USER, PASSWORD);	
		System.out.println("Conexão iniciada com sucesso!");
		
		try {
			while(op != 6) {
				menu();
				op = sc.nextInt();
				
				switch(op) {
				case 1: //cadastrar
					//informações
					sc.nextLine();
					System.out.println("Digite o título do livro:");
					var titulo = sc.nextLine();
					System.out.println("Digite o nome do autor do livro:");
					var autor = sc.nextLine();
					System.out.println("Digite o ano de publicação do livro:");
					var ano = sc.nextInt();
					sc.nextLine();
					System.out.println("Digite a editora do livro:");
					var editora = sc.nextLine();
					System.out.println("Digite a categoria do livro:");
					var categoria = sc.nextLine();
					cadastrar(con, titulo, autor, ano, editora, categoria);
					break;
				case 2: //listar
					listar(con);
					break;
				case 3: //pesquisar (titulo)
					sc.nextLine();
					System.out.println("Digite o titulo desejado:");
					var tituloDesejado = sc.nextLine();
					pesquisarTitulo(con, tituloDesejado);
					break;
				case 4: //pesquisar (categoria)
					sc.nextLine();
					System.out.println("Digite a categoria desejada:");
					var categoriaDesejada = sc.nextLine();
					pesquisarCategoria(con, categoriaDesejada);
					break;
				case 5:
					System.out.println("Digite o ID do livro que deseja excluir: ");
					var idDesejado = sc.nextInt();
					excluir(con, idDesejado);
					break;
				}
			}
			
		}catch(Exception ex) {
			
		}finally {
			if(con != null && !con.isClosed()) {
				con.close();
			}
			sc.close();
		}

	}

}
