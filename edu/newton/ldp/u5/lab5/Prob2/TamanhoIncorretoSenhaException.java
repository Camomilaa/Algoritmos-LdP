package edu.newton.ldp.u5.lab5.Prob2;

public class TamanhoIncorretoSenhaException extends Exception{
	public TamanhoIncorretoSenhaException() {
		super("Senha Inv�lida: deve conter pelo menos 8 caracteres e no m�ximo 12 caracteres. Tente novamente.");
	}
}
