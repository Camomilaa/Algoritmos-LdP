package edu.newton.ldp.u2.lab_1_2;

import javax.swing.JOptionPane;

/**
 * 
 * Problema 1:
 * 
 * Entrada: N�mero inteiro inserido pelo usu�rio.
 * Sa�da: Indica��o do sistema se o n�mero inserido � primo ou n�o.
 * 
 * @author Camila Soares da Silva
 *
 */

public class Problema1 {

	public static void main(String[] args) {
		
		// declara��o de vari�veis
		int num;
		String n;
		boolean controle = false;
		
		// entrada
		n = JOptionPane.showInputDialog("Insira um n�mero inteiro: ");
		
		// processamento
		num = Integer.parseInt(n);
		
		if(num % 2 != 0) {
			if(num % 3 != 0) {
				if(num % 5 != 0) {  //O n�mero � considerado primo se n�o for divis�vel por nenhum n�mero alem dele mesmo e 1.
					controle = true;
				}
			}
		}
		
		//sa�da
		if(controle == true) {
			System.out.println("O n�mero " + num + " � primo!");
		}
		else {
			System.out.println("O n�mero " + num + " n�o � primo!");
		}
	}

}
