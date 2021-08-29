package edu.newton.ldp.u2;

import javax.swing.JOptionPane;

/**
 * Entrada: Frase digitada pelo usuário
 * Saída: quantidade de vogais na frase
 * @author Gadrit
 *
 */
public class Exercicio2Parte1VogaisEmFrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaração de variaveis
		String ent = "a";
		int contVog = 0, i = 0;
		
		//entrada
		ent = JOptionPane.showInputDialog("Insira a frase:");
		
		//processamento
		ent.toLowerCase();
		for (i = 0; i < ent.length(); i++) {
			char l = ent.charAt(i);
			if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u') {
				contVog++;
			}
		}
		
		//saida
		
		System.out.println("Foram inseridas " + contVog + " vogais");
	}

}
