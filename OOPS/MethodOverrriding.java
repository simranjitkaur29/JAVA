class Super{
 
    public void display()
    {
        System.out.println("Super class is called");
    }
}
class Sub extends Super
{
    public void display()
    {
        System.out.println("Sub class is called");
    }
}
public class MethodOverrriding{
    public static void main(String args[])
    {
        Super sup=new Super();
        sup.display();
        Sub sub=new Sub();
        sub.display();
        Super sup1=new Sub();//dynamic method dispatch
        sup1.display();
        

    }
}