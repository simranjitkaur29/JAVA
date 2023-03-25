import java.util.*;
public class Cubiod {
    public static void main(String args[]){
        int l,b,h;
        int totalArea,volume;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Length , Breadth and Height of cubiod : ");
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        totalArea=2*l*b + 2*l*h+ 2*h*b;
        volume=l*b*h;
        System.out.println("Total area of cubiod is : " + totalArea);
        System.out.println("Total area of cubiod is : " + volume);



    }

}
