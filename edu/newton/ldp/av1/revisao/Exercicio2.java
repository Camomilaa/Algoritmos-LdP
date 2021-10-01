package edu.newton.ldp.av1.revisao;

import java.util.HashSet;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var vetor = new String[10];
		var palavras = new HashSet<String>();
	    vetor[0] = "book";
	    vetor[1] = "table";
	    vetor[2] = "sky";
	    vetor[3] = "house";
	    vetor[4] = "sunday";
	    vetor[5] = "car";
	    vetor[6] = "sky";
	    vetor[7] = "house";
	    vetor[8] = "tablet";
	    vetor[9] = "monitor";

	    for(int n = 0; n < vetor.length; n++) {
	    	var palavra = vetor[n];
	    	if (palavras.contains(palavra)) {
	    		System.out.println("A palavra " + palavra + " se repetiu!");
	    	} else {
	    		palavras.add(palavra);
	    	}
	    }
	    
	}

}
