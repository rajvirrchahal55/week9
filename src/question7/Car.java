package question7;
/*7. Write a Java program to create a class Vehicle with a method called speedUp(). Create
two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
increase the vehicle's speed differently.*/
public class Car extends Vehicle{
    public static void main(String[]args){
    Car c=new Car();
    c.speedUp(60);}
    @Override
    public void speedUp(int speed) {
      System.out.println(speed);
    }
}
