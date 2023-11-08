package question10;
/*10. Write a Java program to create a base class BankAccount with methods deposit() and
withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
withdraw() method in each subclass to impose different withdrawal limits and fees.*/
public class SavingsAccount extends BankAccount{
    public static void main(String[]args) {
        SavingsAccount obj = new SavingsAccount();
        obj.withdraw(1000,7);
        obj.withdraw(5000,5);
    }
    @Override
    public double withdraw(double amount,int monthlimits) {
        if (monthlimits > 6) {
            System.out.println("successfully withdraw");
        } else {
            System.out.println("declind limits exceed try next month");
        }
        return monthlimits;
    }
}


