package edu.newton.ldp.u1;
/**
 * entrada: número inteiro digitado pelo usuário
 * saída: divisores desse número
 */
import javax.swing.JOptionPane;

public class Exercicio3Divisores {

	public static void main(String[] args) {
		//declaração de variáveis
		int n, c = 0;
		
		//entrada
		String val1 = JOptionPane.showInputDialog("Insira o número:");
		n = Integer.parseInt(val1);
		
		//processamento e saída
		for (c = 1; c < n; c++) {
			if (n % c == 0){
				System.out.print(c + " ");
			}
		}
	}

}
