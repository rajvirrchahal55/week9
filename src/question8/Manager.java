package question8;
/*8. Write a Java program to create a class Employee with a method called
calculateSalary(). Create two subclasses Manager and Programmer. In each subclass,
override the calculateSalary() method to calculate and return the salary based on their
specific roles.*/
public class Manager extends Employee {

public static void main(String[]args) {

    Manager obj=new Manager();
    obj.calculateSalary(55,160);
}
    @Override
    public void calculateSalary(double pay,double hours) {
        double salary=hours*pay;
        System.out.println(salary);
    }

}
