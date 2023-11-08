package question14;
/*14. Write a Java program to create a class called Car with private instance variables
company_name, model_name, year, and mileage. Provide public getter and setter
methods to access and modify the company_name, model_name, and year variables.
However, only provide a getter method for the mileage variable.*/
public class Car {
    private String company_name;
    private String model_name;
    private int year;
    private int mileage;
    public static void main(String[]args) {
        Car obj=new Car();
        obj.setModel_name("sb12");
        obj.setCompany_name("ford");
        obj.setYear(2022);
        System.out.println(obj.getCompany_name());
        System.out.println(obj.getModel_name());
        System.out.println(obj.getYear());
        System.out.println(obj.getMileage(120));

        obj.setModel_name("bnm22");
        obj.setCompany_name("porsche");
        obj.setYear(2020);

        System.out.println(obj.getCompany_name());
        System.out.println(obj.getModel_name());
        System.out.println(obj.getYear());
        System.out.println(obj.getMileage(90));
    }
    public int getMileage(int mileage){
        return mileage;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public String getCompany_name(){
        return company_name;
    }
    public void setCompany_name(String company_name){
        this.company_name=company_name;
    }
    public String getModel_name(){
        return model_name;
    }
    public void setModel_name(String model_name){
        this.model_name=model_name;
    }
}
