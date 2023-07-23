package com.mycompany.projetobanco;

import java.util.Scanner;
import java.util.Random;

public class ProjetoBanco {

    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(1000, 5000);
        
        ContaBanco p1 = new ContaBanco();
        p1.abrirConta(num, "cc", "alysson");
        p1.sacar(50);
        p1.checarSaldo();
    }
}
