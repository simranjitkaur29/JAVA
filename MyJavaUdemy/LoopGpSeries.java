import java.util.Scanner;

public class LoopGpSeries {
    public static void main(String args[])
    {
        int a, r, n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first digit of Gp series ");
        a=sc.nextInt();
        System.out.println("Enter common ration between the series ");
        r=sc.nextInt();
        System.out.println("Enter total length of series");
        n=sc.nextInt();
        System.out.print(a + " ");
        for(int i=0;i<n;i++){
            a=a*r;
            System.out.print(a + " ");
        }
        sc.close();

    }
    
}
