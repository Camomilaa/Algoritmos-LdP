package edu.newton.ldp.u1;

/**
 * Indica se o n�mero inserido � par ou �mpar
 */

import javax.swing.JOptionPane;

public class Exercicio1ParOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, r;
		boolean ehPar = false;
		
		String valor = JOptionPane.showInputDialog("Digite um n�mero inteiro:");
		
		n = Integer.parseInt(valor);
		
		r = n % 2;
		
		if (r == 0) {
			ehPar = true;
		}
		
		JOptionPane.showMessageDialog(null, "O n�mero � " + (ehPar?"par!":"impar!"));
	}

}
