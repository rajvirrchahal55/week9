package question10;
/*10. Write a Java program to create a base class BankAccount with methods deposit() and
withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
withdraw() method in each subclass to impose different withdrawal limits and fees.*/
public  class BankAccount {
    double amount;
    int monthlimits;

    public double deposit(double amount) {
        return amount;
    }

    public double withdraw(double amount,int monthlimits) {
        return amount;
    }
}

