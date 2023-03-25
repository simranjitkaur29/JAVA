import java.util.*;
public class NumberOddEven {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter any number  : ");
        a=sc.nextInt();
        if(a%2==0){
            System.out.println("Number is even: "+a);
        
        }
        else{
            System.out.println("Number is odd: " +a);
        }


    }
    
}
