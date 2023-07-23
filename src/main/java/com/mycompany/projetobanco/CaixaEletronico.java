package com.mycompany.projetobanco; 

public interface CaixaEletronico {
    public abstract void abrirConta(int n, String tipo, String dono);
    public abstract void fecharConta();
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void pagarMensal();
    public abstract void checarSaldo();
}