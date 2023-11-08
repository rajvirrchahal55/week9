package question9;
/*9. Write a Java program to create a base class Animal with methods move() and
makeSound(). Create two subclasses Bird and Panthera. Override the move() method
in each subclass to describe how each animal moves. Also, override the makeSound()
method in each subclass to make a specific sound for each animal*/
public class Animal {

public void move(){
    System.out.println("animal move");
}
    public void makeSound(){
        System.out.println("animal sound");
    }
}
