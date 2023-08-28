package br.com.projetobanco;

import br.com.projetobanco.contas.*;

public class TesteBanco {

    public static void main(String[] args) {

    	Pessoa p1 = new Pessoa();
    	p1.setNome("Alysson Luiz");
    	p1.setIdade(25);
    	
    	Pessoa p2 = new Pessoa();
    	p2.setNome("Thales Cardoso");
    	p2.setIdade(33);
    	
    	ContaCorrente cc1 = new ContaCorrente(222, p1);
    	ContaPoupanca cp1 = new ContaPoupanca(111, p2);
    	
    	cc1.abrirConta();
    	cc1.dadosCliente();
    	cc1.depositar(500);
    	cc1.sacar(450);
    	cc1.fecharConta();
    	cc1.saldo();
    	cc1.sacar(48);
    	cc1.fecharConta();
    	
    	
 
    	
        
            
    }
}