import java.util.Scanner;

public class LoopReverseNumber {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        n=sc.nextInt();
        int r,rev=0;
        while(n!=0){
            r=n%10;
            rev=rev*10+r;

            n=n/10;
        }
        System.out.println("Reversed number : "+ rev);
    }
    
}
