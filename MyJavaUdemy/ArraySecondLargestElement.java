import java.util.*;
public class ArraySecondLargestElement {
    public static void main(String args[])
    {
        int n,max1,max2;
     
        System.out.println("Enter Size of Array : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter all the elements of array : ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        max1=array[0];
        max2=array[0];
        for(int i=0;i<n;i++)
        {
            if(array[i]>max1){
                max2=max1;
                max1=array[i];
            }
            else if(array[i]>max2){
                max2=array[i];
            }

        }
        System.out.println("Second largest element : " + max2);
    
    sc.close();
    }}
