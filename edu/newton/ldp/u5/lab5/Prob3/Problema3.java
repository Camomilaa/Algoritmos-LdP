package edu.newton.ldp.u5.lab5.Prob3;

import javax.swing.JOptionPane;

public class Problema3 {
	public static void validacao(String cpf) throws ValidacaoPrimeiroDigitoException, ValidacaoSegundoDigitoException, 
	NumeroCaracteresInvalidoException, CaractereNaoNumericoException, CPFRepetidoException {
		
		//verificando caracteres
		boolean numerico = false;
		int primeiro = 1, contR = 0;
		char r = ' ';
		
		String[] cpfS = cpf.split("");
		int[] cpfSI = new int[cpf.length()];
		for(int c = 0; c < cpf.length(); c++) {
			char n;
			n = cpfS[c].charAt(0);
			cpfSI[c] = Character.getNumericValue(n);
			if(Character.isDigit(n)) {
				numerico = true;
			} else {
				numerico = false;
			}
			if(numerico == false) {
				throw new CaractereNaoNumericoException();
			}
			if(primeiro == 1) {
				primeiro++;
				r = n;
			} else {
				primeiro++;
				if(r == n) {
					contR++;
				}
			}
		}
		
		//contando repetições
		if(contR == 10) {
			throw new CPFRepetidoException();
		}
		
		//verificando quantidade de numeros
		int tamanho = cpf.length();
		if(tamanho > 11 || tamanho < 11) {
			throw new NumeroCaracteresInvalidoException();
		}
		
		//verificando primeiro digito
		int res1 = cpfSI[0]*10 + cpfSI[1]*9 + cpfSI[2]*8 + cpfSI[3]*7 + cpfSI[4]*6 + cpfSI[5]*5 + cpfSI[6]*4 + cpfSI[7]*3 +
				cpfSI[8]*2;
		float resultado1 = (res1 * 10)%11;
		if((res1*10) % 11 == 10) {
			resultado1 = 0;
		}
		if(resultado1 != cpfSI[9]) {
			throw new ValidacaoPrimeiroDigitoException();
		}
		
		//verificando segundo digito
		int res2 = cpfSI[0]*11 + cpfSI[1]*10 + cpfSI[2]*9 + cpfSI[3]*8 + cpfSI[4]*7 + cpfSI[5]*6 + cpfSI[6]*5 + cpfSI[7]*4 +
				cpfSI[8]*3 + cpfSI[9]*2;
		float resultado2 = (res2 * 10)%11;
		if((res2*10) % 11 == 10) {
			resultado2 = 0;
		}
		if(resultado2 != cpfSI[10]) {
			throw new ValidacaoSegundoDigitoException();
		}
		
	}
	public static void main(String[] args) {
		//declaração de variáveis
		String cpf;
		int erro = 0;
		
		//entrada
		cpf = JOptionPane.showInputDialog(null, "Insira o cpf para a validação: ");
		
		//processamento
		try {
			validacao(cpf);
		}catch(ValidacaoPrimeiroDigitoException | ValidacaoSegundoDigitoException | NumeroCaracteresInvalidoException | 
				CaractereNaoNumericoException | CPFRepetidoException ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage());
			erro++;
		} finally {
			if(erro == 0) {
				JOptionPane.showMessageDialog(null, "CPF validado com sucesso!");
			}
		}
	}

}
