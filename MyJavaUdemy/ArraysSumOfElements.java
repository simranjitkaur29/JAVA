import java.util.Scanner;

public class ArraysSumOfElements {
    public static void main(String args[])
    {
        int n,sum=0;
        System.out.println("Enter Size of Array : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter all the elements of array : ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for (int i : array) {
            sum+=i;
        }
        System.out.println("Sum of all elements : "+ sum);
        sc.close();
    }
    
}
