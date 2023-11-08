package question6;
/*Write a Java program to create a base class Animal (Animal Family) with a method
called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in
each subclass to make a specific sound for each animal.*/
public class Cat extends Bird{
    public static void main(String[]args){
        Cat c=new Cat();
        c.sound();
    }
    @Override
    public void sound() {
     System.out.println("meow meow");
    }
}
