package edu.newton.ldp.u5.lab5.Prob2;

public class EspacoException extends Exception{
	public EspacoException() {
		super("Senha Inválida: não pode ter espaços. Tente novamente.");
	}
}
