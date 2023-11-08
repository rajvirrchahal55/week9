package question3;
/*Write a Java program to create a class known as "BankAccount" with methods called
 deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
 withdraw() method to prevent withdrawals if the account balance falls below one
 hundred.*/
public class SavingsAccount extends BankAccount {
    public static void main(String[] args) {
        SavingsAccount Obj = new SavingsAccount();
        Obj.withdraw(99);
        Obj.withdraw(101);
        Obj.withdraw(110);
    }

    @Override
    public void withdraw(int amount) {
        if (amount>100) {
            System.out.println("withdraw successfull");
        }else{
            System.out.println("mininum balance 100 required");
        }

    }
}
