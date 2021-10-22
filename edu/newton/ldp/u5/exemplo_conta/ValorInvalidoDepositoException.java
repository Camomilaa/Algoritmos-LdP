package edu.newton.ldp.u5.exemplo_conta;

public class ValorInvalidoDepositoException extends Exception{
	public ValorInvalidoDepositoException(float valor) {
		super("O valor " + valor + " não é válido para depósito");
	}
}
