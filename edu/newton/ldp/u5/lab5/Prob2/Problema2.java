package edu.newton.ldp.u5.lab5.Prob2;

import javax.swing.JOptionPane;

public class Problema2 {
	public static void validacao(String senha, int tamanho, char r)
	throws TamanhoIncorretoSenhaException, ZeroLetrasMaiusculasException, ZeroNumerosException, ZeroEspeciaisException, 
	RepeticaoException, EspacoException{
		int contLM = 0, contN = 0, contE = 0, contPrimeiro = 1, contR = 0, contEs = 0;
		for(int c = 0; c < tamanho; c++) {
			char l = senha.charAt(c);
			//contando letras mai�sculas
			if(Character.isUpperCase(l)) {
				contLM++;
			}
			//contando n�meros
			if(Character.isDigit(l)) {
				contN++;
			}
			//contando caracteres especiais
			
			if(l == '!' || l == '@' || l == '#' || l == '?' || l == ']') {
				contE++;
			}
			//contando repeti��es
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
			//contando espa�os
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
		//Declara��o de vari�veis
		String senha = "";
		int tamanho = 0, erro = 0;
		
		//entrada
		senha = JOptionPane.showInputDialog(null, "Insira a senha");
		tamanho = senha.length();
		try {
			validacao(senha, tamanho, ' ');
		} catch(TamanhoIncorretoSenhaException | ZeroLetrasMaiusculasException | ZeroNumerosException | ZeroEspeciaisException | 
				RepeticaoException | EspacoException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
			erro++;
		} finally {
			if(erro == 0) {
				JOptionPane.showMessageDialog(null, "Senha v�lida!");
			}
		}

	}

}
