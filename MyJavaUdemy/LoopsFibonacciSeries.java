import java.util.Scanner;

public class LoopsFibonacciSeries {
    public static void main(String args[]){
        int n;
        System.out.println("Enter length of the series ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a=0,b=1;
        int c;
        System.out.print("Fibonacci Series : "+a + " "+b +" ");
        for(int i=0;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");

        }
    }

    
}
