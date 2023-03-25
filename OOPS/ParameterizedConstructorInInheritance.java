class Parent{

    public Parent()
    {
        System.out.println("parent Non Parameterized constructor");
    }
    public  Parent(int x) {
        System.out.println("parent Constructor with parameter : "+x);
        
    }
}
class Child extends Parent
{
    public Child()
    {
        System.out.println("child non parameterized constructor");
    }
    public Child(int x)
    {
        System.out.println("child Constructor with parameter: "+x);
    }

}
public class ParameterizedConstructorInInheritance {
    public static void main(String args[])
    {
        //Child c=new Child();
        Child c1=new Child(5);

    }

}
