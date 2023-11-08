package question9;
/*9. Write a Java program to create a base class Animal with methods move() and
makeSound(). Create two subclasses Bird and Panthera. Override the move() method
in each subclass to describe how each animal moves. Also, override the makeSound()
method in each subclass to make a specific sound for each animal*/
public class Bird extends Animal{
    public static void main(String[]args){
       Bird obj=new Bird();
        obj.makeSound();
        obj.move();

    }
    @Override
    public void move() {
        System.out.println("Birds' wings flap with an up-and-down motion");
    }

    @Override
    public void makeSound() {
        System.out.println("birds are making sound like quak quak");
    }
}
