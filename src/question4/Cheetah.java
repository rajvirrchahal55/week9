package question4;
/*4. Write a Java program to create a class called Animal with a method named move().
Create a subclass called Cheetah that overrides the move() method to run.*/
public class Cheetah extends Animal{
    public static void main(String[]args) {
        Cheetah obj = new Cheetah();
        obj.move();
    }
    @Override
    public void move() {
        System.out.println("cheetah");
    }
}
