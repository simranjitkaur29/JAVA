import java.util.Scanner;

public class ArrayCopyingAnArray{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of both array ");
        n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        System.out.println("Enter element of the array : ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Elements of a array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+ " ");
        }System.out.println("");
        System.out.println("Now copy the elements of array a into array b ");
        for(int i=0;i<n;i++)
        {
            b[i]=a[i];
        }
        System.out.println("Elements of b array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(b[i]+ " ");
        }System.out.println("");
        sc.close();
        }

    }
