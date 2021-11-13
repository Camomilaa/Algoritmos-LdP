package edu.newton.ldp.u7;

public class Exercicio {

	public static int recursao(int n) {
		if(n == 1) {
			return n;
		}
		
		return n + recursao(n-1);
		
	}
	
	public static int iteracao(int n) {
		var s = 0;
		for(int i = 1; i <= n; i++) {
			s += i;
		}
		return s;
	}
	
	public static void main(String[] args) {
		
		int n = 4;
		
		var resposta = recursao(4);
		System.out.println(resposta);
		var respostaa = iteracao(4);
		System.out.println(respostaa);

	}

}
