class Circle
{
    public double r;
    
    public double Area()
    {
        return (float)3.15*r*r;

    }
    public double circumferrence()
    {
        
        return 2*3.15*r;
    }

}
public class ClassForCircle
{
    public static void main(String args[])
    {
        
        Circle c=new Circle();
        Circle c1=new Circle();

        c.r=7;
        c1.r=14;
        System.out.println("Area of Circle: "+c.Area());
        System.out.println("Circumference of Circle "+c.circumferrence());
        System.out.println("Area of Circle: "+c1.Area());
        System.out.println("Circumference of Circle "+c1.circumferrence());

    }
}