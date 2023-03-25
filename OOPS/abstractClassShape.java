abstract class  Shape
{
    Shape()
    {
        System.out.println("Abstract class shape ");
    }
    abstract double parameter();
    abstract double area();
       
}
class Rectangle extends Shape
{


    public int length;
    public int breadth;
    public double parameter()
    {
        return 2*(length+breadth);
    }
    public double area()
    {
        return length*breadth;
    }
}
class Circle extends Shape
{
    public int radius;
    public double parameter()
    {
        return 2*Math.PI*radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
}
public class abstractClassShape
{
    public static void main(String args[])
    {
        Circle c=new Circle();
        c.radius=45;
       System.out.println( c.area());
        System.out.println(c.parameter());
        Rectangle r=new Rectangle();
        r.breadth=5;
        r.length=6;
        System.out.println(r.area());
        System.out.println(r.parameter());
    }
}