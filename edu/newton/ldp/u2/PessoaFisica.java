package edu.newton.ldp.u2;

import java.util.Calendar;

public class PessoaFisica {
	public String nomeCompleto;
	public String cpf;
	public String email;
	public String celular;
	public String dataNasc;
	public String genero;
	
	public void getIdade(){
		String[] ano = dataNasc.split("-");
		int a = Integer.parseInt(ano[0]);
		int m = Integer.parseInt(ano[1]);
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int idade = year - a;
		
		if (m > Calendar.getInstance().get(Calendar.MONTH) + 1) {
			System.out.println((idade - 1) + " anos.");
		}
		else {
			System.out.println(idade + " anos.");
		}
		
	}
	
	public void getSobrenome() {
		String[] sobre = nomeCompleto.split(" ");
		for (int i = 1; i < sobre.length; i++) {
			System.out.print(sobre[i] + " ");
		}
		System.out.println("\n");
	}
}
