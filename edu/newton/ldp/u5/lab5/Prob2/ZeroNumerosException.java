package edu.newton.ldp.u5.lab5.Prob2;

public class ZeroNumerosException extends Exception{
	public ZeroNumerosException() {
		super("Senha Inválida: deve conter pelo menos um número. Tente novamente.");
	}
}
