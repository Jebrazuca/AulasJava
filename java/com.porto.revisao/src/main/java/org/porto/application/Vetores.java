package com.porto.revisao.src.main.java.org.porto.application;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = scan.nextInt();

        int numeros[] = new int[n];

        scan.nextLine();

        for (int i=0; i < numeros.length; i++){

            System.out.println("Digite um numero: ");
            numeros[i] = scan.nextInt();
            scan.nextLine();
        }

        System.out.println("NUMEROS NEGATIVOS: ");

        for (int i=0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }

        scan.close();

    }
}
