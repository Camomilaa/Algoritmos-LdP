package edu.newton.ldp.u5.lab5.Prob1;

public class QuantidadeVaziaException extends Exception{
	public QuantidadeVaziaException(){
		super("ERRO! Esse dado não pode estar vazio");
	}
}
