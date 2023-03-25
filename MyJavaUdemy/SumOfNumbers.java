import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String args[]){
        int n=10;
        System.out.println("Enter Number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int i,j=0; 
        for( i=1;i<=n;i++){
            
            j+=i;
        
        }
        System.out.println("Sum of numbers : "+j);
        sc.close();
    }
    
}
