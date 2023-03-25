import java .lang.Math;
public class MethodOverloadCalculateArea {
    static public double area(double a,double b){
        double c=a*b;
        return c;
    }
   static public double area(double a){
        return (Math.PI*a*a);
    }
    public static void main(String args[]){
        System.out.println("Area of rectangle is : "+area(34.3,56.0));
        System.out.println("Area of circle is : "+area(45.9));
    }
    
}
