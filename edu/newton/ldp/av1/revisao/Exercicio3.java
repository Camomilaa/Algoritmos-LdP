package edu.newton.ldp.av1.revisao;

import java.util.Stack;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] valores = {5, 2, 9, 13, 7, 3, 1, 20, 18, 6, 65, 34};
		 var pilha = new Stack<Integer>();

		 for(int n = 0; n < valores.length; n++) {
			 pilha.push(valores[n]);
		 }
		 for(int n = pilha.size() - 1; n >= 0; n--) {
			 System.out.println(pilha.get(n));
		 }
		 System.out.println(pilha.toString());
	}

}
