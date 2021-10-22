package edu.newton.ldp.u5.exemplo_conta;

public class SaldoInsuficienteException extends Exception{
	public SaldoInsuficienteException(float saldo, float valor) {
		super("Saldo da conta (" + saldo + ") insuficiente para saque " + valor);
	}
}
