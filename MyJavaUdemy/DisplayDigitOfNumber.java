import java.util.Scanner;

public class DisplayDigitOfNumber{
    public static void main(String args[]){
        int n,r;
        System.out.println("Enter number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0){
            r=n%10;
            n=n/10;
            System.out.println(r);
        }

    }
}