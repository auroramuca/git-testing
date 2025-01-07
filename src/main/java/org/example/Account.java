package org.example;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if (amount>0 && amount <= balance){
             balance+=amount;
        }
    }
    public void checkBalance(){
        System.out.println("Your balance is: " + balance);
    }
    public void transfer(double amount, Account anotherAccount){
        if(anotherAccount != null && amount>0 && amount<=balance){
            this.withdraw(amount);
            anotherAccount.deposit(amount);
        }
    }
}
