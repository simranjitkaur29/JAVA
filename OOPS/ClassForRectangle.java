class Rectangle
{
    public int length;
    public int breadth;
    public int area()
    {
        return length*breadth;
    }
    public int parimeter()
    {
        return 2*(length+breadth); 
    }
}
public class ClassForRectangle {
    public static void main(String args[])
    {
        Rectangle r=new Rectangle();
        r.length=20;
        r.breadth=40;
        System.out.println("Area of Rectangle is : "+r.area());
        System.out.println("Parimeter of Rectangle is : "+r.parimeter());
    }
}
