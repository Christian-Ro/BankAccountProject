package com.company;

import java.util.Scanner;

public class personAcc {

    private	String name;
    private int accountNum;
    private double accountBal = 0;

    personAcc(String name){
        this.name = name;
    }

    //We need to check for same account numbers
    public int setAccount(int accountNum){
        this.accountNum = accountNum;
        return accountNum;
    }

    public double setBalance(double accountBal){
        this.accountBal += accountBal;
        return accountBal;
    }

    public void viewBalance(){
        System.out.println("Your balance is: $" + accountBal + "\n");
        System.out.println("****************************************");
    }

    public void deposit(double accountBal){
        this.accountBal += accountBal;
    }

    public void withdraw(double accountBal){
        this.accountBal -= accountBal;
    }

    public void viewInfo(){
        String info = new String("Welcome to your Account. \n" + "Name: " + name + "\nAccount Number: " + accountNum + "\nAccount Balance: $" + accountBal + "\n");
        System.out.println(info);
        System.out.println("****************************************");
    }

    public String viewName(){
        return name;
    }

    public double getBalance(){
        return accountBal;
    }
}
