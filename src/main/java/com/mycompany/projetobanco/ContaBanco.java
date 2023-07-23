package com.mycompany.projetobanco;


        
public class ContaBanco implements CaixaEletronico {
    
    public int numConta; //número da conta bancária 
    protected String tipo;  //tipo de conta. Corrente ou poupança
    private String dono; // O proprietário da conta bancária
    private double saldo; // Saldo que o proprietário tem no banco.
    private boolean status; // Chetar se a conta está aberta ou fechada.
    
    public void estado() {
        System.out.println("número da conta: " + this.getNumConta());
        System.out.println("Tipo da conta: " + this.getTipo());
        System.out.println("Dono da conta: " + this.getDono());
        System.out.println("Saldo da conta: "+ this.getSaldo());
        System.out.println("Status da conta: "+ this.getStatus());
        System.out.println("--------------------------------");
    }
    
    public ContaBanco() { //assim que criada a conta, define a conta como fechada e com saldo 0,00
        this.setStatus(false);
        this.setSaldo(0);
}
    
    public void abrirConta(int n, String tipo, String dono ){
        if (this.getStatus()) {
            System.out.println("ERRO! A conta já está aberta.");
        } else {
            this.setTipo(tipo);
            this.setNumConta(n);
            this.setDono(dono);
            double bonus = 0;
            if (this.getTipo() == "cc") {
                bonus = 50;
            } else if (this.getTipo() == "cp") {
                bonus = 150;
            }
            System.out.printf("Sua conta foi aberta e você ganhou %.2f de bonus! %n", bonus);
            this.setSaldo( bonus);
            this.setStatus(true);
        }
    }
    public void fecharConta() {
        if (this.getStatus()) {
            if (this.getSaldo() > 0) {
                System.out.println("Não é possível fechar conta com saldo nela.");
            } else if (this.getSaldo() < 0) {
                System.out.println("Não é possível fechar conta com dívida.");
            } else {
                this.setStatus(false);
                System.out.println("Sua conta foi fechada com sucesso!");
            }
        } else {
            System.out.println("A conta já se encontra fechada.");
        }
    }
    
    public void checarSaldo() {
        System.out.printf("boa tarde %s! Você tem %.2f de saldo. %n", this.getDono(), this.getSaldo());
    }
    
    public void sacar(double valor) {
        if (this.getStatus() && this.getSaldo() >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.printf("Foi sacado %.2f com sucesso! %n", valor);
            System.out.printf("Agora você tem %.2f de saldo %n", getSaldo());
        } else {
            System.out.println("Não foi possível realizar o saque pois a conta está fechada.%n");
        }
    }
    public void depositar(double valor){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.printf("Foi depositado %.2f com sucesso! %n", valor);
            System.out.printf("Agora você tem %.2f de saldo %n", getSaldo());
        } else {
            System.out.println("Não foi possível realizar o depósito pois a conta está fechada.%n");
        }
    }
    public void pagarMensal() {
        if (this.getStatus()) {
            double mensalidade = 0;
            if (this.getTipo() == "cc") {
                mensalidade = 20;
            } else if (this.getTipo() == "cp") {
                mensalidade = 50;
            }
            this.setSaldo(this.getSaldo() - mensalidade);
            System.out.printf("Foi pago o falor de R$ %.2f de mensalidade. %n", mensalidade);
            System.out.printf("Você tem R$ %.2f de saldo%n", this.getSaldo());
        }
    }
    
    private void setNumConta(int n) {
        this.numConta = n;
    }
    private int getNumConta() {
        return this.numConta;
    }
    
    private void setTipo(String t) {
        this.tipo = t;
    }
    private String getTipo() {
        return this.tipo;
    }
    
    private void setDono(String d) {
        this.dono = d;
    }
    private String getDono() {
        return this.dono;
    }
    
    private void setSaldo(double s) {
        this.saldo = s;
    }
    private double getSaldo(){
        return this.saldo;
    }
    
    private void setStatus(boolean status) {
        this.status = status;
    }
    private boolean getStatus() {
        return this.status;
    }
}



 
