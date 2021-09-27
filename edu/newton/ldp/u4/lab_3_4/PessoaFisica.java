package edu.newton.ldp.u4.lab_3_4;

public class PessoaFisica {
	public String nome;
	public String cpf;
	public String email;
	public String telefone;
	public String data;
	public int cod;
	
	public PessoaFisica(String nome, String cpf, String email, String telefone, String data, int cod) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.data = data;
		this.cod = cod;
		
	}

	@Override
	public String toString() {
		return "PessoaFisicaTeste [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", telefone=" + telefone
				+ ", data=" + data + ", cod=" + cod + "]";
	}

}
