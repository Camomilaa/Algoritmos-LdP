package edu.newton.ldp.u5.lab5.Prob2;

public class ZeroLetrasMaiusculasException extends Exception{
	public ZeroLetrasMaiusculasException() {
		super("Senha Inv�lida: deve possuir letras mai�sculas. Tente novamente.");
	}
}
