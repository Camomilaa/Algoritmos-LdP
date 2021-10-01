package edu.newton.ldp.av1.revisao.slides;

import java.util.LinkedList;

public class Ex04 {
	public static void main (String[] args) {
		var lista = new LinkedList<String>();
		var listaInvertida = new LinkedList<String>();
		
		lista.add("Sheila");
		lista.add("Leonardo");
		lista.add("Vicente");
		lista.add("Pedro");
		lista.add("Cecília");
		
		for(int c = lista.size() - 1; c >= 0 ; c--) {
			listaInvertida.add(lista.get(c));
		}
		System.out.println(listaInvertida.toString());
	} 
}
