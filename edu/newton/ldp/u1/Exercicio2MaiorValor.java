package edu.newton.ldp.u1;

// Entrada: 3 n�meros
// Sa�da: Maior n�mero dentre os tr�s inseridos	

import javax.swing.JOptionPane;

public class Exercicio2MaiorValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y, z, maior = 0;
		
		String val1 = JOptionPane.showInputDialog("Insira o primeiro n�mero:");
		x = Integer.parseInt(val1);
		
		String val2 = JOptionPane.showInputDialog("Insira o segundo n�mero:");
		y = Integer.parseInt(val2);
		
		String val3 = JOptionPane.showInputDialog("Insira o terceiro n�mero:");
		z = Integer.parseInt(val3);
		
		maior = x;
		
		if (y > maior) {
			maior = y;
		}
		
		if (z > maior) {
			maior = z;
		}
		
		JOptionPane.showMessageDialog(null, "O maior n�mero foi " + maior);
		
	}

}
