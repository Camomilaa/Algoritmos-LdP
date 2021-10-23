package edu.newton.ldp.u5.lab5.Prob3;

public class CaractereNaoNumericoException extends Exception{
	public CaractereNaoNumericoException() {
		super("ERRO! Foi detectada a presença de um caractere não númerico!");
	}
}
