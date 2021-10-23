package edu.newton.ldp.u5.lab5.Prob3;

public class NumeroCaracteresInvalidoException extends Exception{
	public NumeroCaracteresInvalidoException() {
		super("ERRO! Número de caracteres digitados não condizem com um CPF.");
	}
}
