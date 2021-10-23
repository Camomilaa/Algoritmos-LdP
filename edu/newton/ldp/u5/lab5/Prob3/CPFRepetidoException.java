package edu.newton.ldp.u5.lab5.Prob3;

public class CPFRepetidoException extends Exception{
	public CPFRepetidoException(){
		super("ERRO! O CPF inserido possui apenas um número, portanto não é válido.");
	}
}
