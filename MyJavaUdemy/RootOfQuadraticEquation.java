import java.lang.*;
import java.util.*;
public class RootOfQuadraticEquation {
    public static void main(String[] args){
        int a,b,c; 
        double r1,r2, d;

        Scanner S= new Scanner(System.in);
        System.out.println("Enter Coefficients of X^2 X^1 and X^0 : ");
        a=S.nextInt();
        b=S.nextInt();
        c=S.nextInt();
        d=((b*b)-(4*a*c));
        r1=(-b+Math.sqrt(d))/2*a;
        r2=(-b-Math.sqrt(d))/2*a;
        if(d==0){
            System.out.println("Roots are Real and Equal");
            System.out.println("Then roots are : "+r1 + r2);
        }
        else if(d>0){
            System.out.println("Roots are Real,Unequal and rationl");
            System.out.println("Then roots are : "+r1+r2);

        }
        else{
            System.out.println("Roots are Unequal and imaginary");
        }




    }
}
