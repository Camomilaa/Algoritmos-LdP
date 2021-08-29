package edu.newton.ldp.u2;

import javax.swing.JOptionPane;

/**
 *entrada: número inteiro digitado pelo usuário
 *saída: informa a tabuada
 * @author Gadrit
 *
 */
public class Exercicio8Parte3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaração de variáveis
		int n = 0, i = 0;
		String num;
		
		//entrada
		num = JOptionPane.showInputDialog("Insira um número: ");
		n = Integer.parseInt(num);
		
		//processamento e saída
		for (i = 0; i < 11; i++) {
			System.out.println(n + " x " + i + " = " + n*i);
		}
	}

}
