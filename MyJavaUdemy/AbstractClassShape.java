abstract class Shape{
    abstract public double perimeter();
    abstract public double area();
}
class Circle extends Shape{
   public  double radius;
   public double perimeter(){
       return 2*3.14*radius;
   }
   public double area(){
       return 3.14*radius*radius;
   }
}
class Rectangle extends Shape{
    public double length;
    public double breadth;
    public double perimeter(){
        return 2*(length+breadth);
    }
    public double area(){
        return length*breadth;
    }
}


public class AbstractClassShape {
    public static void main(String args[]){
        Rectangle r=new Rectangle();
        r.length=78;
        r.breadth=45;
        System.out.println(r.perimeter());

    }

    
}
