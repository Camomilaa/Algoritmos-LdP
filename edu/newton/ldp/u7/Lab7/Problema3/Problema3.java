package edu.newton.ldp.u7.Lab7.Problema3;

public class Problema3 {
	
	public static String inversao(String frase) {
		
		if(frase.length() == 1) {
			return String.valueOf(frase.charAt(0)); //r
		}
		var restoFrase = frase.substring(1);
		var primLetra = frase.charAt(0);
		return inversao(restoFrase) + primLetra; //er
	}

	public static void main(String[] args) {
		String frase = "No massacre, floresço, como uma flor no amanhecer";
		var r = inversao(frase);
		System.out.println(r);

	}

}