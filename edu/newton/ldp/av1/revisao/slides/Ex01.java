package edu.newton.ldp.av1.revisao.slides;

import java.util.LinkedList;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var lista = new LinkedList<String>();
		
		lista.add("Sheila");
		lista.add("Leonardo");
		lista.add("Vicente");
		lista.add("Pedro");
		lista.add("Cecília");
		
		var controle = lista.size();
		
		for(int c = 0; c < controle; c++) {
			System.out.println(lista.get(c));
		}
	}

}
