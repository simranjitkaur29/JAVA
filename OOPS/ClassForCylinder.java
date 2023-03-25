class Cylinder
{
    public double radius;
    public int height;
    public double lidArea()
    {
        return Math.PI*radius*radius;
    }
    public double totalSurfaceArea()
    {
        return 2*3.15*radius*height+2*3.15*radius*radius;
    }
    public double volume()
    {
        return 3.15*radius*radius;
    }


}
public class ClassForCylinder {
    public static void main(String args[])
{
    Cylinder c=new Cylinder();
    c.radius=5.6;
    c.height=10;
    System.out.println("Volume of Cylinder is : "+c.volume());
    System.out.println("Total Surface Area of Cylinder is : "+c.totalSurfaceArea());
    System.out.println("LidArea of circle is : "+c.lidArea() );

}
}
