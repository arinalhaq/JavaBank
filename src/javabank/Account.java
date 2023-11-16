package javabank;

public class Account extends AbstractBankAccount {

    // class variables
    private int bonusValue;

    //overloaded constructor for Account
    Account(String Name, int Num, int amt) {
        super(Name, Num, (amt + calculateInitialBonusValue(amt)));
        bonusValue = calculateInitialBonusValue(amt);
    }
    
    //make a deposit to the balance
    @Override
    public void deposit(int amt) {
        if (amt > 100) {
            balance = balance + (amt + (int) (bonusValue * 0.1));
        } else {
            balance = balance + amt;
        }
    }

    private static int calculateInitialBonusValue(int amt) {
        if (amt >= 1 && amt <= 100) {
            return 10;
        } else if (amt <= 300) {
            return 20;
        } else {
            return 30;
        }
    }

    //print method 
    public void print() {
        System.out.println("\nBank Name : " + getBankName()
                + "\nAccount Holder : " + accountName
                + "\nAccount Number : " + accountNum
                + "\nAccount balance: " + balance);
    }

}
