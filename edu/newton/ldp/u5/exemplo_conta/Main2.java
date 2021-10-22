package edu.newton.ldp.u5.exemplo_conta;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var conta = new ContaBancaria();
		conta.saldo = 100.0f;
		conta.estado = 2; // inativa 
		
		try {
			conta.efetuarDeposito(10);
			conta.mostrarSaldo();
			
			System.out.println("Depósito bem sucedido.");
		} catch(ValorInvalidoDepositoException ex) {
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("pronto");
		}
	}

}
