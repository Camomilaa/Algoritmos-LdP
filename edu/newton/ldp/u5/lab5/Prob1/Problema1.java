package edu.newton.ldp.u5.lab5.Prob1;

import javax.swing.JOptionPane;

public class Problema1 {
	
	public static int validar(String q) throws QuantidadeVaziaException, QuantidadeNaoNumericaException{
		//Conferindo se est� vazio
		if(q.isBlank() || q.isEmpty()) {
			throw new QuantidadeVaziaException();
		}
		
		//conferindo se � possivel transformar string em int
		boolean digito = q.matches("[+-]?\\d*(\\.\\d+)?");
		if(digito == false) {
			throw new QuantidadeNaoNumericaException();
		}
		int qntd = Integer.parseInt(q);
		return qntd;
	}
	
	public static void validarNegativo(int qntd) throws NumeroNegativoException{
		//conferindo se o valor � negativo
		if(qntd < 0) {
			throw new NumeroNegativoException();
		}
	}
	
	public static void main(String[] args) {
		//declara��o de vari�veis
		String q = "", n = "a", saida = " ";
		int qntd = 0, num = 0, erro = 0;
		
		//processamento
		try {
			//tamanho do array
			q = JOptionPane.showInputDialog(null, "Quantos n�meros deseja digitar?");
			qntd = validar(q);
			validarNegativo(qntd);
			
			//armazenamento dos numeros
			int conjunto[] = new int[qntd];
			for(int c = 0; c < qntd; c++) {
				n = JOptionPane.showInputDialog(null, "Insira um n�mero:");
				num = validar(n);
				conjunto[c] = num;
				saida = saida + num + " ";
			}
			
		} catch(QuantidadeVaziaException | QuantidadeNaoNumericaException | NumeroNegativoException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
			erro++;
		} finally {
			if(erro == 0) {
				JOptionPane.showMessageDialog(null, "Sa�da: " + saida);
			}
		}

	}

}
