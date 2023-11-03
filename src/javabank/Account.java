package javabank;

public class Account implements InterfaceBankAccount {

    // class variables
    String accountName;
    int accountNum;
    int balance;

    //default constructor for Account
    Account() {
        this.accountName = "EMPTY";
        this.accountNum = 0;
        this.balance = 0;
    }

    //overloaded constructor for Account
    Account(String Name, int Num, int amt) {
        accountName = Name;
        accountNum = Num;
        balance = amt;
    }
    //make a deposit to the balance

    @Override
    public void deposit(int amt) {
        balance = balance + amt;
    }
    //make a withdrawal from the balance

    @Override
    public void withdraw(int amt) {
        balance = balance - amt;
    }
    //modifier to set the accountName

    public void setAccountName(String Name) {
        accountName = Name;
    }
    //modifier to set the AccountNumber

    public void setAccountNum(int Num) {
        accountNum = Num;
    }
    //modifier to set the balance

    public void setBalance(int Num) {
        balance = Num;
    }
    //accessor to get the accountName

    public String getAccountName() {

        return accountName;
    }

    //accessor to get the accountNumber
    public int getAccountNum() {

        return accountNum;
    }
    //accessor to get the account balance

    @Override
    public int getBalance() {

        return balance;
    }
    
    @Override
    public String getBankName() {
        return InterfaceBankAccount.BANK;
    }

    //print method 
    public void print() {
        System.out.println("\nBank Name : " + getBankName() +
        "\nAccount Holder : " + accountName +
        "\nAccount Number : " + accountNum +
        "\nAccount balance: " + balance);
    }

}
