package com.mycompany.projetobanco;

public class ProjetoBanco {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(111);
        p1.setDono("Jubileu");
        p1.abrirConta("cc");
        
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(222);
        p2.setDono("Creuza");
        p2.abrirConta("cp");
        
        p1.depositar(100);
        p2.depositar(500);
        
        p2.sacar(1000);
        p1.sacar(150);
        p1.fecharConta();
        p1.estado();
        p2.estado();
                
    }
}
