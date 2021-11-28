package edu.newton.ldp.u8;

import java.sql.SQLException;
import java.util.Scanner;

public class TesteInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//obter conexão
		var con = TesteConexao.obterConexao();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do usuario:");
		var nome = sc.nextLine();
		
		System.out.println("Digite a senha do usuario:");
		var senha = sc.nextLine();
		
		//preparar sql
		var sql = "insert into users (name, password) values ('" + nome + "', '" + senha + "')";
		var statement = con.createStatement();
		
		//executar
		var num = statement.executeUpdate(sql);
		
		//exibir resultado
		System.out.println("Tuplas afetadas: " + num);
		
		//buscar modificações
		System.out.println("Buscando dados...");
		var sql2 = "select * from users";
		var rs = statement.executeQuery(sql2);
		
		while(rs.next()) {
			var id = rs.getInt("id");
			var name = rs.getString("name");
			var password = rs.getString("password");
			
			System.out.println(id + " - " + name + " - " + password);
		}
		
		//encerrar conexão
		rs.close();
		statement.close();
		sc.close();
		if(con != null && !con.isClosed()) {
			con.close();
		}
		
	}

}
