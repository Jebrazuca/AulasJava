package com.porto.revisao.src.main.java.org.porto.application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MatrizExercicio {

    public static void main(String[] args) {

        //Exercicio:

        // Fazer um programa para ler dois números inteiros M e N, e depois ler
        //uma matriz de M linhas por N colunas contendo números inteiros,
        //podendo haver repetições. Em seguida, ler um número inteiro X que
        //pertence à matriz. Para cada ocorrência de X, mostrar os valores à
        //esquerda, acima, à direita e abaixo de X, quando houver, conforme
        //exemplo.

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o tamanho da Matriz?");
        int m = scan.nextInt();
        int n = scan.nextInt();


        int[][] mat = new int[m][n];

        scan.nextLine();

        for (int i=0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = scan.nextInt();
            }
        }

        System.out.println();
        int x = scan.nextInt();


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Posição: " + i + " , " + j + ":");
                    if (j+1 <= mat.length) {
                        System.out.println("RIGHT: "+ mat[i][j+1]);
                    }
                    if (j-1 >= 0) {
                        System.out.println("LEFT: " + mat[i][j - 1]);
                    }
                    if (i-1 >= 0 ) {
                        System.out.println("DOWN: "+ mat[i-1][j]);

                    }
                    if (i+1 <= mat.length ) {
                        System.out.println("UP: "+ mat[i+1][j]);

                    }

                }
            }
            System.out.println();
        }




        scan.close();

    }
}
