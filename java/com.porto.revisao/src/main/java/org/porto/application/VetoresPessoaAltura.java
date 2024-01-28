package com.porto.revisao.src.main.java.org.porto.application;

import com.porto.revisao.src.main.java.org.porto.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class VetoresPessoaAltura {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int n = scan.nextInt();

        Pessoa[] pessoas = new Pessoa[n];

        scan.nextLine();

        for (int i=0; i < pessoas.length; i++){

            System.out.println("Dados da "+ (i + 1) +"º pessoa: ");
            System.out.print("Nome: ");
            String name = scan.nextLine();

            System.out.print("Idade: ");
            int age = scan.nextInt();

            System.out.print("Altura: ");
            double alt = scan.nextDouble();

            pessoas[i] = new Pessoa(name, age, alt);
            scan.nextLine();
        }

        System.out.println("********");


        double soma = 0;

        for (int a = 0; a < pessoas.length; a++ ) {
            soma += pessoas[a].getHeight();
        }

        double avg = soma / pessoas.length;

        System.out.printf("Altura média: %.2f\n", avg);

        int countPerCent = 0;

        for (int a = 0; a < pessoas.length; a++ ) {
            if (pessoas[a].getAge() < 16) {
                countPerCent++;
            }

        }

        double percent = (countPerCent * 100) / pessoas.length;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n",percent);


        for (int a = 0; a < pessoas.length; a++ ) {
            if (pessoas[a].getAge() < 16) {
                System.out.println(pessoas[a].getName());
            }

        }


        scan.close();

    }
}
