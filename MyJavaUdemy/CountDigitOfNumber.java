import java.util.Scanner;

public class CountDigitOfNumber {
    public static void main(String args[] ){
        int n,count=0;
        System.out.println("Enter Number: ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println("Total number of didgits is : "+ count);

    }

    
}
