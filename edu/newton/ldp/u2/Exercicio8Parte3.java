package edu.newton.ldp.u2;

import javax.swing.JOptionPane;

/**
 *entrada: n�mero inteiro digitado pelo usu�rio
 *sa�da: informa a tabuada
 * @author Gadrit
 *
 */
public class Exercicio8Parte3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declara��o de vari�veis
		int n = 0, i = 0;
		String num;
		
		//entrada
		num = JOptionPane.showInputDialog("Insira um n�mero: ");
		n = Integer.parseInt(num);
		
		//processamento e sa�da
		for (i = 0; i < 11; i++) {
			System.out.println(n + " x " + i + " = " + n*i);
		}
	}

}
