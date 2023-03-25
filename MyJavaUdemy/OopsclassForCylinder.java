class Cylinder{
   public  double radius;
   public double height;
    public double lidArea(){
        return (2*Math.PI*radius*radius );

    }
    public double totalSurfaceArea(){
        return 2*lidArea()+circumference();

    }
    public double volume(){
        return 2*lidArea()+circumference()*height;

    }
    public double circumference(){
        return 2*Math.PI*radius;

    }
}
public class OopsclassForCylinder {
    public static void main(String args[])
    {
        Cylinder c= new Cylinder();
        c.height=48.23;
        c.radius=45;
        System.out.println("Lidarea of cylinder : "+c.lidArea());
        System.out.println("TotalSurfaceArea is : "+ c.totalSurfaceArea());
        System.out.println("Circumfrence of cylinder : "+c.circumference());


    }
}
