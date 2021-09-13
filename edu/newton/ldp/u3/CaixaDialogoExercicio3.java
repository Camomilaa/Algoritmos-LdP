package edu.newton.ldp.u3;

import javax.swing.JOptionPane;

public class CaixaDialogoExercicio3 {
	public static void main(String[] args) {
		
		//declaração de variáveis
		int num = 0;
		String n = "", saida = "";
		boolean success = false;
		
		//entrada
		while(!success) {
			n = JOptionPane.showInputDialog("Digite um número: ");
			
			//se a caixa de dialogo estiver vazia
			if (n == null || n.trim().length() == 0) {
				JOptionPane.showMessageDialog(null, "Para executar, é necessário digitar um valor.");
				System.exit(0);
			}
			
			//se não for numero
			try {	
				num = Integer.parseInt(n);
				
				if (num < 0) {
					throw new RuntimeException("Valor negativo: " + num);
				}
				
				success = true;
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Valor inválido: " + n, "ERRO!", JOptionPane.ERROR_MESSAGE);
			} catch (RuntimeException ex) {
				JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO!!", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		//processamento
		for(int i = 0; i <= 100; i = i + num) {
			saida = saida + i + "\n";
		}
		
		//saida
		JOptionPane.showMessageDialog(null, saida);
		System.out.print(saida);
	}
}
