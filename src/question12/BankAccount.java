package question12;
/*12. Write a Java program to create a class called BankAccount with private instance
variables accountNumber and balance. Provide public getter and setter methods to
access and modify these variables.*/
public class BankAccount {
    private int accountNumber;
    private int balance;
    public static void main(String[]args){
    BankAccount obj=new BankAccount();
     obj.setAccountNumber(12546);
        obj.setBalance(5000);

        System.out.println(obj.getAccountNumber());
        System.out.println(obj.getBalance());

        obj.setAccountNumber(88888);
        obj.setBalance(1000);

        System.out.println(obj.getAccountNumber());
        System.out.println(obj.getBalance());
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
}
