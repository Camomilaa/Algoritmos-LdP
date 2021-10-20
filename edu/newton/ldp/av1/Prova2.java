package edu.newton.ldp.av1;

import java.util.LinkedList;

public class Prova2 {

	public static void main(String[] args) {
		int [] valores = {3, 8, 2, 6, 4, 1, 9, 8, 4};
		var numeros = new LinkedList<Integer>();
		
		for(int c = 0; c < valores.length; c++) {
			if(numeros.contains(valores[c])) {
				System.out.println("O valor " + valores[c] + " já existe dentro do vetor!");
			} else {
				numeros.add(valores[c]);
			}
		}
		int n = numeros.size();
		var vetor = new int[n];
		
		System.out.print("Vetor gerado: ");
		for(int i = 0; i < numeros.size(); i++) {
			vetor[i] = numeros.get(i);
			System.out.print(vetor[i] + " ");
		}
		
		var vetorI = new int[n];
		
		System.out.printf("\nVetor invertido: ");
		for(int j = 0; j < vetor.length; j++) {
			vetorI[j] = numeros.removeLast();
		}
		
		for(int j = 0; j < vetor.length; j++) {
			System.out.print(vetorI[j] + " ");
		}
		
		
		

	}

}
