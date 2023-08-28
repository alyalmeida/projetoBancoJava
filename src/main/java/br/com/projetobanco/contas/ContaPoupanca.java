package br.com.projetobanco.contas;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int num, Pessoa titular) {
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
		System.out.println("\n");
		super.sacar(valor);
		
	}

}
