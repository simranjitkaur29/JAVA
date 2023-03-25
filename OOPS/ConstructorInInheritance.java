class Parent
{
    public Parent() 
    {
    System.out.println("parent class Constructor is called");
    }
}
class child extends Parent
{
    public child() 
    {
    System.out.println("child class Constructor is called ");
    }
}
public class ConstructorInInheritance {
    public static void main(String args[])
    {
        child c=new child();
        

    }

    
}
