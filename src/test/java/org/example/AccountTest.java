package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void deposit() {
        Account account = new Account(100);
        account.deposit(50);
        assertEquals(150, account.checkBalance(), "Deposit failed: balance should be 150.");
    }

    @Test
    void withdraw() {
        Account account = new Account(100);
        account.withdraw(30);
        assertEquals(30, account.checkBalance(), "Withdraw successful.");

    }

    @Test
    void checkBalance() {
        Account account = new Account(200);
        assertEquals(200, account.checkBalance());
    }

    @Test
    void transfer() {
        Account account1 = new Account(300);
        Account account2 = new Account(100);

        account1.transfer(50, account2);
        assertEquals(250, account1.checkBalance(), "Transfer failed: account1 balance should be 250.");
        assertEquals(150, account2.checkBalance(), "Transfer failed: account2 balance should be 150.");

        account1.transfer(400, account2);
        assertEquals(250, account1.checkBalance(), "Transfer failed: account1 balance should remain 250.");
        assertEquals(150, account2.checkBalance(), "Transfer failed: account2 balance should remain 150.");
    }


}