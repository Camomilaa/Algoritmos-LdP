package edu.newton.ldp.u5.exemplo_conta;

public class ValorInvalidoException extends Exception{
	public ValorInvalidoException(float valor) {
		super("Valor inválido " + valor);
	}
}
