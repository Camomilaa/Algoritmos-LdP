package edu.newton.ldp.u8;

import java.sql.SQLException;

public class TesteSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// executar conexão
		var con = TesteConexao.obterConexao();
		
		//executar sql
		var statement = con.createStatement();
		var sql = "select * from users";
		var r = statement.executeQuery(sql);
		
		//processar o resultado do sql
		while(r.next()) { //iterador
			var id = r.getInt("id");
			var name = r.getString("name");
			var password = r.getString("password");
			
			System.out.println(id + " - " + name + " - " + password);
		}
		
		r.close();
		statement.close();
		
		//encerrar conexao
		if(con != null && !con.isClosed()) {
			con.close();
			System.out.println("Conexão finalizada com sucesso!");
		}
	}

}
