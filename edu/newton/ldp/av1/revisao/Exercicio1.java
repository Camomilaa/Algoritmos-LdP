package edu.newton.ldp.av1.revisao;

import java.util.ArrayList;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var numeros = new ArrayList<Integer>();
		int soma = 0;
		
		for(int n = 0; n <= 100; n++) {
			if(n % 2 == 0) {
				numeros.add(n);
				soma += n;
			}
		}
		
		System.out.println("A soma equivale a " + soma);
	}

}
