package edu.newton.ldp.u6.Lab6.Problema1;

public class ArquivoNaoEncontradoException extends Exception{
	public ArquivoNaoEncontradoException() {
		super("O arquivo não foi encontrado!");
	}
}
