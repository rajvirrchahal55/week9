package question11;

import javax.swing.*;

/*11. Write a Java program to create a class called Person with private instance variables
name, age. and country. Provide public getter and setter methods to access and modify
these variables.*/
public class Person {
    private String name;
    private int age;
    private String country;
    public static void main(String[] args) {
        Person obj=new Person();
       obj.setname("rajvir");
       obj.setAge(20);
      obj.setcountry("America");
        System.out.println(obj.Getname());
        System.out.println(obj.GetAge());
        System.out.println(obj.Getcountry());
        obj.setname("rajr");
        obj.setAge(29);
        obj.setcountry("usa");
        System.out.println(obj.Getname());
        System.out.println(obj.GetAge());
        System.out.println(obj.Getcountry());
    }
    public String Getname(){
        return name;
    }
        public int GetAge(){
        return age;
        }
    public String Getcountry(){
        return country;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setcountry(String country){
        this.country=country;
    }

}
