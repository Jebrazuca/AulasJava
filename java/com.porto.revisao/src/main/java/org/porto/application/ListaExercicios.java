package com.porto.revisao.src.main.java.org.porto.application;

import com.porto.revisao.src.main.java.org.porto.entities.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ListaExercicios {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos funcionários serão registrados?");
        int n = scan.nextInt();

        List<Employees> employeesList = new ArrayList();

        scan.nextLine();

        for (int i=1; i <= n; i++){

            System.out.println("Funcionario #"+ i);
            System.out.print("ID: ");
            long id = scan.nextLong();
            while (existingID(employeesList, id)){
                System.out.print("ID de Funcionário já existe, tente novamente: ");
                id = scan.nextLong();
            }

            scan.nextLine();
            System.out.print("Nome: ");
            String name = scan.nextLine();

            System.out.print("Salário: ");
            double salary = scan.nextDouble();

            scan.nextLine();

            employeesList.add(new Employees(id, name, salary));
        }

        System.out.println();


        System.out.print("Informe o ID do funcionário que terá o aumento do salário: ");
        Long id = scan.nextLong();

        scan.nextLine();

        // Localiza o ID informado e chama o metodo para atualizar o sala
        //employeesList.stream().filter(res -> res.getId().equals(id)).findFirst().orElse(null).updateSalaryPerCent(percAumento);
        Employees emp = employeesList.stream().filter(res -> res.getId().equals(id)).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("Esse ID de funcionário não existe!");
        } else {
            System.out.print("Informe o percentual de aumento: ");
            Double percAumento = scan.nextDouble();

            emp.updateSalaryPerCent(percAumento);
        }




        System.out.println();




        System.out.println("Lista de funcionários:");

        for (Employees e:
             employeesList) {
            System.out.println(e.toString());
        }

        scan.close();

    }


    public static boolean existingID(List<Employees> list, Long id) {
        Employees emp = list.stream().filter(res -> res.getId().equals(id)).findFirst().orElse(null);
        return emp != null;
    }
}
