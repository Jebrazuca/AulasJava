package com.porto.revisao.src.main.java.org.porto.application;

import java.util.Locale;
import java.util.Scanner;

public class VetoresSomaVetor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = scan.nextInt();

        double  numeros[] = new double[n];

        scan.nextLine();

        for (int i=0; i < numeros.length; i++){

            System.out.println("Digite um numero: ");
            numeros[i] = scan.nextDouble();
            scan.nextLine();
        }

        System.out.print("Valores = ");

        for (int i=0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }


        double soma = 0;

        for (int i=0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println();
        System.out.printf("SOMA: %.2f\n", soma);

        double avg = soma / numeros.length;

        System.out.printf("MEDIA: %.2f\n", avg);



        scan.close();

    }
}
