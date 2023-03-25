import java.util.*;
public class ArrayFindMaximumElement {
    public static void main(String args[])
    {
        int n,max;
     
        System.out.println("Enter Size of Array : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter all the elements of array : ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        max=array[0];
        for(int i=0;i<n;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        System.out.println("Maximum Element of the array is  :"+max);
        sc.close();
    }
}
