import java.util.*;
public class ArrayDeletingAnElement {
    public static void  main(String args[])
    {
        int A[]=new int[10];
        Scanner sc=new Scanner(System.in);
        int n,x,index;
    System.out.println("enter length of the array");
        n=sc.nextInt();
        System.out.println("Enter all elements in array  ");
        
        for(int i =0;i<n;i++){
            A[i]=sc.nextInt();

        }
        for(int i =0;i<n;i++){
            System.out.print(A[i]+" ");
            

        }System.out.println("");
        System.out.println("Enter element which you want to delete : ");
        x=sc.nextInt();
       
        System.out.println("Enter the index of that element : ");
        index=sc.nextInt();
        

        for(int i=index;i<n;i++){
            A[i]=A[i+1];
        }

        for(int i=0;i<n-1;i++){
            System.out.print(A[i] +" ");
        }

    }
}

