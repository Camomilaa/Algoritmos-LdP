package edu.newton.ldp.u1;
/**
 * entrada: n�mero inteiro digitado pelo usu�rio
 * sa�da: divisores desse n�mero
 */
import javax.swing.JOptionPane;

public class Exercicio3Divisores {

	public static void main(String[] args) {
		//declara��o de vari�veis
		int n, c = 0;
		
		//entrada
		String val1 = JOptionPane.showInputDialog("Insira o n�mero:");
		n = Integer.parseInt(val1);
		
		//processamento e sa�da
		for (c = 1; c < n; c++) {
			if (n % c == 0){
				System.out.print(c + " ");
			}
		}
	}

}
