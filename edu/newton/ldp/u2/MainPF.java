package edu.newton.ldp.u2;

public class MainPF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var pf1 = new PessoaFisica();
		
		pf1.nomeCompleto = "Sheila Menezes dos Santos";
		pf1.dataNasc = "2001-02-06";

		pf1.getSobrenome();
		pf1.getIdade();
	}

}
