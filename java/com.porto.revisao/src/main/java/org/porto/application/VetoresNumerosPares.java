package com.porto.revisao.src.main.java.org.porto.application;

import java.util.Locale;
import java.util.Scanner;

public class VetoresNumerosPares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = scan.nextInt();

        int  numeros[] = new int[n];


        for (int i=0; i < numeros.length; i++){

            System.out.println("Digite um numero: ");
            numeros[i] = scan.nextInt();
        }

        System.out.println("");
        System.out.println("Numeros Pares:");

        int contPar = 0;

        for (int i=0; i < numeros.length; i++){
            if( numeros[i] % 2 == 0 ) {
                System.out.print(numeros[i] + " ");
                contPar++;
            }
        }

        System.out.println("\n");


        System.out.printf("Quantidade de Pares = %d", contPar);


    }
}
