package edu.newton.ldp.u7;

public class Palindromo {
	
	public static String palindromo(String p) {
		if(p.length() == 1) {
			return p;
		}
		
		var resto = p.substring(1);
		var pLetra = String.valueOf(p.charAt(0));
		
		return palindromo(resto) + pLetra;
	}
	
	public static void main(String[] args) {
		var palavra = "ovo";
		var r = palindromo(palavra);
		if (palavra.equals(r)) {
			System.out.println("É um palíndromo");
		} else {
			System.out.println("Não é um palíndromo");
		}

	}

}
