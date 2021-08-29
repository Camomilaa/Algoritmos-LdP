package edu.newton.ldp.u1;

/**
 * Indica se o número inserido é par ou ímpar
 */

import javax.swing.JOptionPane;

public class Exercicio1ParOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, r;
		boolean ehPar = false;
		
		String valor = JOptionPane.showInputDialog("Digite um número inteiro:");
		
		n = Integer.parseInt(valor);
		
		r = n % 2;
		
		if (r == 0) {
			ehPar = true;
		}
		
		JOptionPane.showMessageDialog(null, "O número é " + (ehPar?"par!":"impar!"));
	}

}
