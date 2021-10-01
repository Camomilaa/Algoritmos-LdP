package edu.newton.ldp.av1.revisao.slides;

import java.util.LinkedList;

public class Ex03 {
	public static void achar(LinkedList<String> lista, String nome) {
		for(int c = 0; c < lista.size(); c++) {
			var item = lista.get(c);
			if(item == nome) {
				System.out.println("O nome " + item + " se encontra na posição " + c);
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
		
		achar(lista, "Vicente");
	}

}
