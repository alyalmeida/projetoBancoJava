package br.com.projetobanco.contas;

public class ChecarConta {
	
	public void abrirConta (Conta conta) {
		if (!conta.getStatus()) {
			conta.setStatus(true);
			System.out.println("Conta aberta com sucesso!");
		} else {
			System.out.println("Erro! A conta ja esta aberta");
		}
	}
	
	public void fecharConta(Conta conta) {
		if (conta.getStatus()) {
			if (conta.getSaldo() > 0) {
				System.out.println("\nNao e possivel fechar a conta. Voce tem saldo na conta");
			} else if (conta.getSaldo()< 0 ) {
				System.out.println("\nNao e possivel fechar a conta. Voce tem saldo negativo");
			} else {
				conta.setStatus(false);
				System.out.println("\nConta fechada com sucesso!");
			}
		} else {
			System.out.println("\nErro! A conta ja esta fechada");
		}
	}
}
