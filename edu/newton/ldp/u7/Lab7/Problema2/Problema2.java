package edu.newton.ldp.u7.Lab7.Problema2;

import java.util.Arrays;

public class Problema2 {
	
	public static int buscaRecursiva(int num, int[] vetor, int l, int r) {
		
		int  pm = (l + r)/2;
		
		if(l > r) {
			return -1;
		}
		
		if(vetor[pm] == num) {
			return pm;
		} else if(vetor[pm] < num) {
			return buscaRecursiva(num, vetor, pm+1, r);
		} else
			return buscaRecursiva(num, vetor, l, pm-1);

	}
	
	public static int buscaIterativa(int num, int[] vetor) {
		int l = 0;
		int r = vetor.length - 1;
		while(l <= r) {
			int pm = (l + r)/2;
			
			if(vetor[pm] == num) {
				return pm;
			} else if(vetor[pm] > num) {
				r = pm - 1;
			} else {
				l = pm + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] vetor = {2, 4, 3, 9, 22};
		int l = 0;
		int r = vetor.length - 1;
		
		Arrays.sort(vetor);
		for(var n: vetor) {
			System.out.print("[" + n + "]");
		}
		System.out.print("\n");
		
		var resp = buscaRecursiva(3, vetor, l, r);
		var res = buscaIterativa(0, vetor);
		System.out.println("Posição do núemero requerido: " + resp);
		System.out.println("Posição do núemero requerido: " + res);
	}
}
