import java.util.Scanner;

public class MethodGCDoFTwoNumbers {
    static int gcd(int m,int n)
    {
        while(m!=n){
            if(m>n){
                m=m-n;
            }
            else {
                n=n-m;
            }
        }return m;
    }
    public static void main(String args[])
    {
        int m,n;
        System.out.println("Enter two number :");
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("GCD of two number is : "+gcd(m, n));
       sc.close();   
    }
    
}
