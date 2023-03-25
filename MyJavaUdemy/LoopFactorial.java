import java.util.Scanner;

public class LoopFactorial {
    public static void main(String args[]){
        int n,i,fact=1;
        System.out.println("Enter number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for( i=1;i<=n;i++){
                fact*=i;
                
        }
        System.out.println("Factorial of number is : "+fact);
sc.close();

    }
    
}
