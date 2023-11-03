/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javabank;

/**
 *
 * @author hp
 */
public interface InterfaceBankAccount {

    public final String BANK = "JavaBank";

    void deposit(int amt);
    //make a withdrawal from the balance

    void withdraw(int amt);
    //modifier to set the accountName

    int getBalance();

    public String getBankName();

}
