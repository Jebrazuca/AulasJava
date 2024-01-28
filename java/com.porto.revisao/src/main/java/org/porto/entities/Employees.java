package com.porto.revisao.src.main.java.org.porto.entities;

public class Employees {
    private Long id;
    private String name;
    private Double salary;

    public Employees(){}

    public Employees(Long id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }


    public void updateSalaryPerCent(Double perc) {
        Double increaseSalary = (perc * getSalary() )/ 100;
        this.salary += increaseSalary;

    }

    @Override
    public String toString() {
        return  id +
                ", " + name +
                ", " +
                String.format("%.2f", salary);
    }
}
