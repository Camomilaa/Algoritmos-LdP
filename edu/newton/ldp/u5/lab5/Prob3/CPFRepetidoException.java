package edu.newton.ldp.u5.lab5.Prob3;

public class CPFRepetidoException extends Exception{
	public CPFRepetidoException(){
		super("ERRO! O CPF inserido possui apenas um n�mero, portanto n�o � v�lido.");
	}
}
