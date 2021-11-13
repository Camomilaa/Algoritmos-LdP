package edu.newton.ldp.u7.Lab7.Problema3;

public class Problema3 {
	
	public static String inversao(String frase, String fraseInvertida) {
		
		if(frase.length() == 0) {
			return fraseInvertida;
		}
		
		var f = frase.charAt(frase.length() - 1); //a
		fraseInvertida = fraseInvertida +  f; // adicionando ultima letra a string
		var i = frase.substring(0, frase.length() - 1); //sheil
		return inversao(i, fraseInvertida); //mandando o resto da frase, para tirar a ultima
	}

	public static void main(String[] args) {
		String frase = "No massacre, floresço, como uma flor no amanhecer", fraseInvertida = "";
		var r = inversao(frase, fraseInvertida);
		System.out.println(r);

	}

}
