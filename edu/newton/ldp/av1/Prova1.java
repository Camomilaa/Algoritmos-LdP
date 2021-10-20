package edu.newton.ldp.av1;

public class Prova1 {

	public static void main(String[] args) {
		String [] palavras = {"the", "book", "helicoptero", "table ", "binóculo"};
		int num = 0, index = -1;
		for(int c = 0; c < palavras.length; c++) {
			var palavra = palavras[c].trim();
			var tamanho = palavra.length();
			if(tamanho > num) {
				num = tamanho;
				index = c;
			}
		}
		System.out.println("A maior palavra do conjunto é: " + palavras[index]);
		System.out.println("Tamanho: " + num);
	}

}
