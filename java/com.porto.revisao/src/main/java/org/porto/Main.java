package com.porto.revisao.src.main.java.org.porto;

import com.porto.revisao.src.main.java.org.porto.entities.Account;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number: ");
        String accountnum = scanner.nextLine();

        System.out.println("Enter account holder: ");
        String accountname = scanner.nextLine();

        System.out.println("Is there an initial deposit? ");
        String optional = scanner.nextLine().toUpperCase();

        Account newHolder = new Account(accountnum, accountname);

        if (optional.equals("Y")) {
            System.out.println("Enter initial deposit: ");
            Double accountDeposit = scanner.nextDouble();
            newHolder.deposit(accountDeposit);
        }

        System.out.println("Account data:");
        newHolder.accountInfo();

        scanner.nextLine();

        System.out.println("Enter a deposit value: ");
        newHolder.deposit(scanner.nextDouble());

        System.out.println("Updated Account data:");
        newHolder.accountInfo();

        scanner.nextLine();


        System.out.println("Enter a withdraw value: ");
        newHolder.withDraw(scanner.nextDouble());

        System.out.println("Updated Account data:");
        newHolder.accountInfo();

        scanner.close();


//        System.out.printf("Products: \n" +
//                "%s, which price is %.2f \n", product1, price1);
         //       +
         //       "%s, which price is %.2f \n", product2, price2 +
           //     "\n" +
         //       "Record: %d years old, code %d and gender: %s", age, code, gender);
    }
}