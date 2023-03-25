import java.util.*;
import java.lang.*;
public class ThreeSideAreaTriangle {
    public static void main(String args[] ){
        float a,b,c,S;
    
        double Area;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first side : ");
        a=s.nextFloat();
        System.out.println("Enter second side : ");
        b=s.nextFloat();
        System.out.println("Enter third side : ");
        c=s.nextFloat();
        S=(a+b+c)/2f;
        Area=Math.sqrt(S*(S-a)*(S-b)*(S-c));
        System.out.println("Area of the Three Side Triangle is : "+ Area);


    }
}
