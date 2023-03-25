import java.util.*;
public class ArrayMultiplicationOfTwoMatrices{
    
        public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array : " );
        n=sc.nextInt();
        int A[][]=new int[n][n];
        System.out.println("Enter Element in A matrices : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                A[i][j]=sc.nextInt();
            }

        }
        int B[][]=new int[n][n];
        System.out.println("Enter Element in B matrices : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                B[i][j]=sc.nextInt();
            }

        }
        int C[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                    C[i][j]=0;
                for(int k=0;k<n;k++){
                    C[i][j]+=A[i][j]*B[k][j];

                }
            }

        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                System.out.print(C[i][j] + " ");
            }
            System.out.println("");

        }
        sc.close();
    }
}