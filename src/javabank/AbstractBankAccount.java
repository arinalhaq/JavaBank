/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabank;

/**
 *
 * @author hp
 */
public abstract class AbstractBankAccount {

    public final String BANK = "JavaBank";
    protected String accountName;
    protected int accountNum;
    protected int balance;

    public AbstractBankAccount(String accountName, int accountNum, int balance) {
        this.accountName = accountName;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public String getBankName() {
        return BANK;
    }

    public abstract void deposit(int amt);

    public void withdraw(int amt) {
        balance = balance - amt;
    }

    public void setAccountName(String Name) {
        accountName = Name;
    }

    public void setAccountNum(int Num) {
        accountNum = Num;
    }

    public void setBalance(int Num) {
        balance = Num;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "\n\nBank Name : " + getBankName()
                + "\nAccount Holder : " + accountName
                + "\nAccount Number : " + accountNum
                + "\nAccount balance: " + balance;
    }

}
