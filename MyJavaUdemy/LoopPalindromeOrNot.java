import java.util.Scanner;

public class LoopPalindromeOrNot{
    public static void main(String args[]){
        int n,m, r,rev=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number: ");
        n=sc.nextInt();
        m=n;
        while(n!=0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;

        }
        if(rev==m){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
        sc.close();



    }
}