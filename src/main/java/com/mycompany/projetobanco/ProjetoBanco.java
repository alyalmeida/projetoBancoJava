package com.mycompany.projetobanco;

import java.util.Scanner;

public class ProjetoBanco {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        ContaBanco[] contas = new ContaBanco[3];
        
        bancoApresentacao(contas);
        System.out.println("");
        contas[0].estado();
        contas[1].estado();
        contas[2].estado();
        
    }
    
    public static void bancoApresentacao(ContaBanco[] conta) {
        byte resposta;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        
        do {
            System.out.print("Bem vindo ao banco teste do ALY\n");
            System.out.println("  Você já é nosso cliente? ");
            System.out.print("\n1-já sou cliente\n2-não sou cliente\n0-SAIR\n");
            System.out.print("Digite aqui o número do que deseja: ");
            resposta = scan.nextByte();
            if (resposta == 0) {
                System.out.println("Obrigado e até a próxima!");
                break;
            } else if (resposta == 1) {
                logarConta(); 
            } else if (resposta == 2) {
                conta[count] = new ContaBanco();
                conta[count].abrirConta();
                count++;
            }
        } while (true);
    }
    //public void abrirConta() {}
    public static void logarConta() {
        System.out.println("logando na conta...");
    }
    public static void servicosConta() {}
}