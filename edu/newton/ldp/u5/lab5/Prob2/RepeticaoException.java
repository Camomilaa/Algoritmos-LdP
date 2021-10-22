package edu.newton.ldp.u5.lab5.Prob2;

public class RepeticaoException extends Exception{
	public RepeticaoException() {
		super("Senha Inválida: não pode possuir caracteres repetidos em sequência. Tente novamente.");
	}
}
