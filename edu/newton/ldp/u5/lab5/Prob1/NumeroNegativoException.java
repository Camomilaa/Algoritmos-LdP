package edu.newton.ldp.u5.lab5.Prob1;

public class NumeroNegativoException extends Exception{
	public NumeroNegativoException() {
		super("ERRO! Quantidade de números não pode ser negativa.");
	}
}
