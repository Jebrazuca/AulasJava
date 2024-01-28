package com.porto.revisao.src.main.java.org.porto.application;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tamanho da Matriz?");
        int n = scan.nextInt();

        int[][] mat = new int[n][n];

        scan.nextLine();

        for (int i=0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = scan.nextInt();
            }
        }

        System.out.println("Numeros Diagonais: ");

        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();

        int countImpar = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    countImpar++;
                }
            }
        }

        System.out.println("Numeros impares: "+ countImpar);



        scan.close();

    }
}
