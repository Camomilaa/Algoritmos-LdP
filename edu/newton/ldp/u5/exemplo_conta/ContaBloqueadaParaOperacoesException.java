package edu.newton.ldp.u5.exemplo_conta;

public class ContaBloqueadaParaOperacoesException extends Exception{
	public ContaBloqueadaParaOperacoesException(int estado) {
		super("Esta conta n�o permite opera��es - estado: " + estado);
	}
}
