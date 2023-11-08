package question7;
/*7. Write a Java program to create a class Vehicle with a method called speedUp(). Create
two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
increase the vehicle's speed differently.*/
public class Bicycle extends Vehicle{
    public static void main(String[]args){
        Bicycle b=new Bicycle();
        b.speedUp(50);
    }
    @Override
    public void speedUp(int speed) {
        System.out.println(speed);
    }
}
