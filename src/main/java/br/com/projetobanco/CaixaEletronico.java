package br.com.projetobanco;


public interface CaixaEletronico {
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void saldo();
    public abstract void dadosCliente();
}