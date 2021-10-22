package edu.newton.ldp.u5.exemplo_conta;

public class ContaBloqueadaParaOperacoesException extends Exception{
	public ContaBloqueadaParaOperacoesException(int estado) {
		super("Esta conta não permite operações - estado: " + estado);
	}
}
