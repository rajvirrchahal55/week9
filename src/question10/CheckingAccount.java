package question10;
/*10. Write a Java program to create a base class BankAccount with methods deposit() and
withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the
withdraw() method in each subclass to impose different withdrawal limits and fees.*/
public class CheckingAccount extends BankAccount {

   public static void main(String[]args){
       CheckingAccount obj=new CheckingAccount();
       obj.withdraw(9999,1);
       obj.withdraw(199,1);

   }
    @Override
    public double withdraw(double amount,int monthlimits) {

        if (amount >10000) {
            System.out.println("successfully withdraw");
        } else if (amount <= 2000) {
            System.out.println("minimum amount require in account");
        }
        return amount;
    }
}
