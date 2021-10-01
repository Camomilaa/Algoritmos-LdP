package edu.newton.ldp.av1.revisao.slides;

import java.util.LinkedList;

public class Ex05 {
	public static void contar(LinkedList<String> lista, String nome) {
		int cont = 0;
		
		for(var elemento: lista) {
			if(nome == elemento) {
				cont++;
			}
			if(cont >= 2) {
				System.out.print("A palavra " + elemento + " se repete " + cont + " vezes");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var lista = new LinkedList<String>();
		
		lista.add("Sheila");
		lista.add("Leonardo");
		lista.add("Vicente");
		lista.add("Pedro");
		lista.add("Cecília");
		lista.add("Sheila");
		
		contar(lista, "Sheila");
	}

}
