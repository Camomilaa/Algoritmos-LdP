package edu.newton.ldp.u5.lab5.Prob3;

public class ValidacaoPrimeiroDigitoException extends Exception{
	public ValidacaoPrimeiroDigitoException() {
		super("CPF inválido! Falha na verificação do primeiro digito após o traço!");
	}
}
