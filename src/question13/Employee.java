package question13;
/*13. Write a Java program to create a class called Employee with private instance variables
employee_id, employee_name, and employee_salary. Provide public getter and setter
methods to access and modify the id and name variables, but provide a getter method
for the salary variable that returns a formatted string.*/
public class Employee {
    private int employee_id;
    private String employee_name;
    private int employee_salary;
    public static void main(String[]args){
        Employee obj=new Employee();
        obj.setEmployee_id(55);
        obj.setEmployee_name("Rajvir");

        System.out.println(obj.getEmployee_id());
        System.out.println(obj.getEmployee_name());
        System.out.println(obj.getEmployee_salary(5000));

        obj.setEmployee_id(885);
        obj.setEmployee_name("Raj1");

        System.out.println(obj.getEmployee_id());
        System.out.println(obj.getEmployee_name());
        System.out.println(obj.getEmployee_salary(4500));


    }
    public int getEmployee_id(){
        return employee_id;
    }
   public String getEmployee_name(){
        return employee_name;
   }
  public void setEmployee_id(int employee_id){
        this.employee_id=employee_id;
  }
 public void setEmployee_name(String employee_name){
        this.employee_name=employee_name;
 }
public int getEmployee_salary(int employee_salary){
        return employee_salary;
}
}
