package edu.newton.ldp.u4;

import java.util.LinkedList;

public class Ex2Lista {

	public static void main(String[] args) {
		var listaC = new LinkedList<Integer>();
		var lista = new LinkedList<Integer>();
		
		lista.add(2);
		lista.add(4);
		lista.add(6);
		lista.add(8);
		
		int tamanho = lista.size();
		for(int c = 0; c < tamanho; c++) {
			listaC.add(lista.getLast());
			lista.removeLast();
		}
		System.out.println(listaC);
	}

}
