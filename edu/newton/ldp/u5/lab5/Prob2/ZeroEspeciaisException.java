package edu.newton.ldp.u5.lab5.Prob2;

public class ZeroEspeciaisException extends Exception{
	public ZeroEspeciaisException() {
		super("Senha Inválida: deve possuir pelo menos um dos seguintes caracteres: ! @ # ? ]. Tente novamente.");
	}
}
