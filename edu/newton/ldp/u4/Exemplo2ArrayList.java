package edu.newton.ldp.u4;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exemplo2ArrayList {
	
	/**
	 * Problema:
	 * implementar um m�todo que permite buscar por um determinado
	 * estado dentro da lista de estados.
	 * Se o estado for encontrado, retornar o �ndice onde ele foi
	 * encontrado no vetor
	 * Caso contr�rio, retornar -1 (n�o encontrado)
	 * 
	 * @param args
	 */
	
	private static int buscaSequencial(ArrayList<String> estados, String estado) {
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		var estados = new ArrayList<String>();
		
		System.out.println("lista: " + estados);
		
		estados.add("Minas Gerais");
		System.out.println("lista: " + estados);
		
		estados.add("S�o Paulo");
		System.out.println("lista: " + estados);
		
		estados.add("Santa Catarina");
		System.out.println("lista: " + estados);
		
		estados.remove("S�o Paulo");
		System.out.println("lista: " + estados);
		
		// for-each avan�ado
		for (var estado: estados) {
			System.out.println("Estado: " + estado);
		}
		
		// for-each classico
		for (int i = 0; i < estados.size(); i++) {
			var estado = estados.get(i);
			System.out.println("Estado: " + estado);
		}
		
		System.out.println("Minas Gerais: " + estados.indexOf("Minas Gerais"));
		
		
		estados.clear();
		for (var estado: estados) {
			System.out.println("Estado: " + estado);
		}
		
	}

}