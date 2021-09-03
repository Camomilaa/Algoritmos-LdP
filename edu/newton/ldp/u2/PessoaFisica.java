package edu.newton.ldp.u2;

public class PessoaFisica {
	public String nomeCompleto;
	public String cpf;
	public String email;
	public String celular;
	public String dataNasc;
	public String genero;
	
	public int getIdade(String dataNasc){
		int idade = 2021 - Integer.parseInt(dataNasc);
		return idade;
	}
	
	public void getSobrenome() {
		String[] sobre = nomeCompleto.split(" ");
		for (int i = 1; i < sobre.length; i++) {
			System.out.println(sobre[i]);
		}
	}
}
