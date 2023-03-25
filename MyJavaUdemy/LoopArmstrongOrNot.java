import java.util.*;

public class LoopArmstrongOrNot {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
         int n=sc.nextInt();
         int m=n;
         int r;
         int sum=0;
        
         
         while(n!=0){
             r=n%10;
             n=n/10;
             sum=sum+r*r*r;

         }
         if(m==sum){
             System.out.println("Number is Armstrong");
         }
         else{
             System.out.println("Number is not Armstrong");
         }
        
         sc.close();
    }
    
}
