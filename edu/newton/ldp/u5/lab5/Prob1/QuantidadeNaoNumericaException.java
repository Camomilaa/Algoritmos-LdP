package edu.newton.ldp.u5.lab5.Prob1;

public class QuantidadeNaoNumericaException extends Exception{
	public QuantidadeNaoNumericaException() {
		super("ERRO! Algum caractere n�o n�merico foi inserido.");
	}
}
