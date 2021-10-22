package edu.newton.ldp.u5.lab5.Prob1;

import javax.swing.JOptionPane;

public class Problema1 {
	public static void main(String[] args) {
		//Declaração de variáveis
		String q = "", n = "a", saida = " ";
		int qntd = 0, num = 0, erro = 0, acerto = 0;
		
		//Quantidade de entradas
		try {
			q = JOptionPane.showInputDialog(null, "Quantos números deseja digitar?");
			qntd = Integer.parseInt(q);
		}catch(NumberFormatException ex) {
			JOptionPane.showMessageDialog(null, "Erro! Insira uma quantidade válida de números.");
		}
		int conjunto[] = new int[qntd];
		
		//entrada e processamento
		for(int c = 0; c < qntd; c++) {
			try {
				n = JOptionPane.showInputDialog(null, "Insira um número:");
				num = Integer.parseInt(n);
				conjunto[c] = num;
				saida = saida + num + " ";
			} catch(NumberFormatException a) {
				JOptionPane.showMessageDialog(null, "Caráctere inserido não é um número inteiro!");
				erro++;
				break;
			}finally {
				acerto++;
				if(erro == 0 && acerto == qntd) {
					JOptionPane.showMessageDialog(null, "Saída: " + saida);
				}
			}
		}
		

	}

}
