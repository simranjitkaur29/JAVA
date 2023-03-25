import java.util.*;
import java.lang.*;
public class TriangleArea {
    public static void main(String args[]){
        float base,Height;
        float area;
        Scanner sc=new  Scanner(System.in);
        System.out.println("Enter Base of the Triangle: ");
        base=sc.nextFloat();
        System.out.println("Enter the Height of the Triangle: ");
        Height=sc.nextFloat();
        area=((base*Height)/2);
        System.out.println("Area of the Triangle is : " + area);
        sc.close();

    }
    
}
