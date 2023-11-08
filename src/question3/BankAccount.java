package question3;
/*Write a Java program to create a class known as "BankAccount" with methods called
deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the
withdraw() method to prevent withdrawals if the account balance falls below one
hundred.*/
public class BankAccount {


    public void deposit(int amount) {

        System.out.println(amount);
    }

    public void withdraw(int amount) {

            System.out.println("withdraw sucessfull");

        }
    }




