package edu.newton.ldp.u5.exemplo_conta;

public class ContaBancaria {
	float saldo;
	int estado; // 0 - inativo, 1 - bloqueado, 2 - ativo

	public void efetuarSaque(float valor) 
			throws ValorInvalidoException, SaldoInsuficienteException, ContaBloqueadaParaOperacoesException{
		if(valor <= 0) {
			throw new ValorInvalidoException(valor);
		} 
		if(saldo < valor) {
			throw new SaldoInsuficienteException(saldo, valor);
		}
		if(estado != 2) {
			throw new ContaBloqueadaParaOperacoesException(estado);
		}
	}
	public void efetuarDeposito(float valor)
	throws ValorInvalidoDepositoException{
		if(valor <= 0) {
			throw new ValorInvalidoDepositoException(valor);
		}else {
			saldo = valor + saldo;
		}
	}
	
	public void mostrarSaldo() {
		System.out.println("Saldo: " + saldo);
	}
	public ContaBancaria() {
		// TODO Auto-generated constructor stub
	}

}
