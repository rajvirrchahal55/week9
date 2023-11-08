package question1;
/*Write a Java program to create a class called codebuster with a method called
groupName(). Create a subclass called codebusterGroups() that overrides the
groupName() method.*/
public class CodeBusterGroups extends CodeBuster {
    public static void main(String[]args){
        CodeBusterGroups obj=new CodeBusterGroups();
        obj.groupName();
    }
    @Override
    public void groupName() {
        System.out.println();
    }
}
