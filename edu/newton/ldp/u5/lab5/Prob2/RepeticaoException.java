package edu.newton.ldp.u5.lab5.Prob2;

public class RepeticaoException extends Exception{
	public RepeticaoException() {
		super("Senha Inv�lida: n�o pode possuir caracteres repetidos em sequ�ncia. Tente novamente.");
	}
}
