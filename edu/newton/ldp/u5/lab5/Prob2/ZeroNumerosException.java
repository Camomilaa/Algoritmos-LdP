package edu.newton.ldp.u5.lab5.Prob2;

public class ZeroNumerosException extends Exception{
	public ZeroNumerosException() {
		super("Senha Inv�lida: deve conter pelo menos um n�mero. Tente novamente.");
	}
}
