import java.util.Scanner;

public class LoopApSeries {
    public static void main(String args[])
    {
        int a,d,n,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number of Ap series ");
        a=sc.nextInt();
        System.out.println("Enter common difference of Ap series ");
        d=sc.nextInt();
        System.out.println("Enter total length of Ap series");
        n=sc.nextInt();
        System.out.print(a+" ");
        for(int i=0;i<n;i++){
            a=a+d;

            System.out.print(a+" ");
        }
    }
    
}
