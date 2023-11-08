package question8;
/*8. Write a Java program to create a class Employee with a method called
calculateSalary(). Create two subclasses Manager and Programmer. In each subclass,
override the calculateSalary() method to calculate and return the salary based on their
specific roles.*/
public class Employee {
    double pay;

    public void calculateSalary(double pay, double hours) {
        double salary = hours * pay;
        System.out.println(salary);
    }

    public double getpay(double pay) {
        return pay;
    }
}