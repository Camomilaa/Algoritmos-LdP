package edu.newton.ldp.u5.lab5.Prob2;

import javax.swing.JOptionPane;

public class Problema2 {
	public static void validacao(String senha, int tamanho, char r)
	throws TamanhoIncorretoSenhaException, ZeroLetrasMaiusculasException, ZeroNumerosException, ZeroEspeciaisException, 
	RepeticaoException, EspacoException{
		int contLM = 0, contN = 0, contE = 0, contPrimeiro = 1, contR = 0, contEs = 0;
		for(int c = 0; c < tamanho; c++) {
			char l = senha.charAt(c);
			if(Character.isUpperCase(l)) {
				contLM++;
			}
			if(Character.isDigit(l)) {
				contN++;
			}
			if(l == '!' || l == '@' || l == '#' || l == '?' || l == ']') {
				contE++;
			}
			if(contPrimeiro == 1) {
				r = l;
				contPrimeiro++;
			} else {
				if (l == r) {
					contR++;	
				}
				r = l;
				contPrimeiro++;
			}
			if(l == ' ') {
				contEs++;
			}
		}	
			
		if(tamanho < 8 || tamanho > 12) {
			throw new TamanhoIncorretoSenhaException();
		}
		if(contLM == 0) {
			throw new ZeroLetrasMaiusculasException();
		}
		if(contN == 0) {
			throw new ZeroNumerosException();
		}
		if(contE == 0) {
			throw new ZeroEspeciaisException();
		}
		if(contR > 0) {
			throw new RepeticaoException();
		}
		if(contEs > 0) {
			throw new EspacoException();
		}
	}
	public static void main(String[] args) {
		//Declaração de variáveis
		String senha = "";
		int tamanho = 0;
		
		//entrada
		senha = JOptionPane.showInputDialog(null, "Insira a senha");
		tamanho = senha.length();
		String[] senhaQuebrada = senha.split("");
		try {
			validacao(senha, tamanho, '´');
		} catch(TamanhoIncorretoSenhaException | ZeroLetrasMaiusculasException | ZeroNumerosException | ZeroEspeciaisException | 
				RepeticaoException | EspacoException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
		}

	}

}
