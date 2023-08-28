package br.com.projetobanco.contas;


public class ContaCorrente extends Conta {
	
	public ContaCorrente(int num, Pessoa titular) {
		super(num , titular);
	}
	
	@Override
	public void abrirConta() {
		ChecarConta checa = new ChecarConta();
		checa.abrirConta(this);
	}

	@Override
	public void fecharConta() {
		ChecarConta checa = new ChecarConta();
		checa.fecharConta(this);
	
	}
	
	@Override
	public void sacar(double valor) {
		System.out.println("\nEh cobrado R$ 1,00 para saques de contas correntes");
		double servico = valor + 1;
		super.sacar(servico);
		
	}
	
	

	
	
}

