package br.com.projetobanco.contas;

import br.com.projetobanco.CaixaEletronico;

public abstract class Conta implements CaixaEletronico{
    
    private int numConta; //número da conta bancária 
    private double saldo; // Saldo que o proprietário tem no banco.
    private boolean status; // Chetar se a conta está aberta ou fechada.
    private Pessoa titular;
 
    public Conta(int conta, Pessoa titular) {
    	this.setNumConta(conta);
    	this.setTitular(titular);
    }
    
    public abstract void abrirConta();
    public abstract void fecharConta();
    
    
    public void sacar(double valor) {
    	if (this.status && valor <= this.saldo) {
    		saldo = this.getSaldo() - valor;
    		this.setSaldo(saldo);
    		System.out.printf("Saque de %.2f efetuado com sucesso!\n", (valor-1));
    	} else {
    		System.out.println("Saldo insuficiente");
    	}
    }
    
    public void depositar(double valor) {
    	if (this.status) {
    		double deposito = this.getSaldo() + valor;
    		this.setSaldo(valor);
    		System.out.printf("\nDeposito de %.2f efetuado com sucesso\n", valor);
    	}
    }
    
    public void saldo() {
    	System.out.printf("\nSeu saldo: %.2f\n", this.getSaldo());
    }
    
public void dadosCliente() {
		System.out.println("\nDados do cliente:");
		System.out.println("Nome: " + this.getTitular().getNome());
		System.out.println("Idade: " + this.getTitular().getIdade());
	}
    
    
    
    
    
    //Setters e getters
    public void setNumConta(int n) {
        this.numConta = n;
    }
    
    public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
    
    protected double getSaldo(){
        return this.saldo;
    }
    
    protected void setStatus(boolean status) {
        this.status = status;
    }
    
    protected boolean getStatus() {
        return this.status;
    }

    protected void setTitular(Pessoa titular) {
		this.titular = titular;
	}
    
    protected Pessoa getTitular() {
		return titular;
	}
    
    
}


 
