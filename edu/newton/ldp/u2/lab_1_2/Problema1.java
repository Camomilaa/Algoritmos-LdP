package edu.newton.ldp.u2.lab_1_2;

import javax.swing.JOptionPane;

/**
 * 
 * Problema 1:
 * 
 * Entrada: Número inteiro inserido pelo usuário.
 * Saída: Indicação do sistema se o número inserido é primo ou não.
 * 
 * @author Camila Soares da Silva
 *
 */

public class Problema1 {

	public static void main(String[] args) {
		
		// declaração de variáveis
		int num;
		String n;
		boolean controle = false;
		
		// entrada
		n = JOptionPane.showInputDialog("Insira um número inteiro: ");
		
		// processamento
		num = Integer.parseInt(n);
		
		if(num % 2 != 0) {
			if(num % 3 != 0) {
				if(num % 5 != 0) {  //O número é considerado primo se não for divisível por nenhum número alem dele mesmo e 1.
					controle = true;
				}
			}
		}
		
		//saída
		if(controle == true) {
			System.out.println("O número " + num + " é primo!");
		}
		else {
			System.out.println("O número " + num + " não é primo!");
		}
	}

}
