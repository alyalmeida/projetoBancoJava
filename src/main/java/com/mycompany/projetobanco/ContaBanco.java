package com.mycompany.projetobanco;


public class ContaBanco {
    
    public int numConta; //número da conta bancária 
    protected String tipo;  //tipo de conta. Corrente ou poupança
    private String dono; // O proprietário da conta bancária
    private float saldo; // Saldo que o proprietário tem no banco.
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
        setStatus(false);
        setSaldo(0);
}
    
    public void abrirConta(String tipo) { 
        this.setStatus(true);
        this.setTipo(tipo);
        if (getTipo() == "cc") {
            this.setSaldo(50);
            System.out.println("Sua conta foi criada e você recebeu R$ 50,00 de bônus.");
        }
        else {
            this.setSaldo(150);
            System.out.println("Sua conta foi criada e você recebeu R$ 150,00 de bônus.");
        }
        this.setNumConta(numConta);
        this.setDono(dono);
    }
    
    public void fecharConta() {
        if (this.getSaldo() < 0) {
            System.out.println("Não é possível fechar conta pois consta dívida.");
        }
        else if (this.getSaldo() > 0) {
            System.out.println("Não é possível fechar conta pois há saldo no banco.");
        }
        else {
            this.setStatus(false);
            System.out.println("Conta devidamente fechada.");
        }
        
    }
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + (float) valor);
        System.out.printf("Foi depositado %.2f na sua conta. Agora você tem %.2f de saldo \n",valor, getSaldo());
    }
    public void sacar(double valor) {
        if (valor > this.getSaldo()) {
            System.out.println("Você não tem saldo suficiente para este saque.");
        }
        else {
            this.setSaldo(this.getSaldo() - (float) valor);
            System.out.printf("Saque realizado! Seu saldo atual é %.2f \n", this.getSaldo());
        }
    }
    public void pagarMensal() {
        if (this.getTipo() == "cc") {
            this.setSaldo((int) this.getSaldo() - 12);
            System.out.printf("Mensalidade paga! Seu saldo atual é %.2f \n", this.getSaldo());
        }
        else {
            this.setSaldo((int) this.getSaldo() - 20);
            System.out.printf("Mensalidade paga! Seu saldo atual é %.2f \n", this.getSaldo());
        }
    }
    
    public void setNumConta(int n) {
        this.numConta = n;
    }
    public int getNumConta() {
        return this.numConta;
    }
    
    public void setTipo(String t) {
        this.tipo = t;
    }
    public String getTipo() {
        return this.tipo;
    }
    
    public void setDono(String d) {
        this.dono = d;
    }
    public String getDono() {
        return this.dono;
    }
    
    public void setSaldo(double s) {
        this.saldo = (float) s;
    }
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus() {
        return this.status;
    }
    
}

 
