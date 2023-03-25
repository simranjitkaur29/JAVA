

class Rectangle{
    public double length;
    public double breadth;
    public  double area(){
        return length*breadth;
    }
    public  double perimeter()
    {
        return 2*(length+breadth);
    }
    public  boolean isSquare(){
        return length==breadth;
}
}
public class OopsClassForRectangle {
    public static void main(String args[]){
        Rectangle r=new Rectangle();
        r.length=45.5;
        r.breadth=45.5;
        System.out.println("area of triangle is : "+r.area());
        System.out.println("Perimeter of traingle : "+r.perimeter());
        System.out.println("Is square() : "+r.isSquare());

    }
    
}
