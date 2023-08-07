package com.mycompany.projetobanco; 

public interface CaixaEletronico {
    public abstract void abrirConta();
    public abstract void fecharConta();
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void saldo();
    public abstract void pix(ContaBanco c, double valor);
}