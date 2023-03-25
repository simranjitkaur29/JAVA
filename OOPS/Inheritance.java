class circle
{
    public int radius;
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double circumferrence()
    {
        return 2*Math.PI*radius;
    }
}
class Cylinder extends circle
{
    public int height;
    public double volume()
    {
        return area()*height;
    }
}
public class Inheritance {
    public static void main(String args[])
    {
        Cylinder c1=new Cylinder();
        c1.height=7;
        c1.radius=5;
        
        System.out.println("Volume of Cylinder is : "+c1.volume());
        System.out.println("Area of Circle is : "+c1.area());
        System.out.println("circumferrence of circle is : "+c1.circumferrence());
    }
}

    

