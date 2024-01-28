package com.porto.revisao.src.main.java.org.porto.entities;

public class Account {

    private String numberAccount;
    private String name;
    private Double ammount = 0.0;

    public Account(){}

    public Account(String numberAccount, String name, Double ammount) {
        this.numberAccount = numberAccount;
        this.name = name;
        deposit(ammount);
    }

    public Account(String numberAccount, String name) {
        this.numberAccount = numberAccount;
        this.name = name;
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmmount() {
        return ammount;
    }

    public void withDraw(Double value){
        Double tax = 5.0;
        this.ammount -= (value + tax);
    }

    public void deposit(Double value){
        this.ammount += value;
    }

    public void accountInfo(){
        System.out.println("Account: " + numberAccount + ", Holder:" + name + ", Balance: $" + ammount);
    }
}