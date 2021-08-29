package edu.newton.ldp.u1;

// Entrada: 3 números
// Saída: Maior número dentre os três inseridos	

import javax.swing.JOptionPane;

public class Exercicio2MaiorValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y, z, maior = 0;
		
		String val1 = JOptionPane.showInputDialog("Insira o primeiro número:");
		x = Integer.parseInt(val1);
		
		String val2 = JOptionPane.showInputDialog("Insira o segundo número:");
		y = Integer.parseInt(val2);
		
		String val3 = JOptionPane.showInputDialog("Insira o terceiro número:");
		z = Integer.parseInt(val3);
		
		maior = x;
		
		if (y > maior) {
			maior = y;
		}
		
		if (z > maior) {
			maior = z;
		}
		
		JOptionPane.showMessageDialog(null, "O maior número foi " + maior);
		
	}

}
