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

    public abstract void deposit(int amt);
    //make a withdrawal from the balance

    public abstract void withdraw(int amt);
    //modifier to set the accountName

    public abstract int getBalance();

    public abstract String getBankName();
    
}
