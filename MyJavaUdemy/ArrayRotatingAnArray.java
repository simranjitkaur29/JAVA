
import java.util.*;
public class ArrayRotatingAnArray{
    public static void main(String args[])
    {
        int n,temp;
     
        System.out.println("Enter Size of Array : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter all the elements of array : ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        temp=array[0];
        for(int i=1;i<n;i++){
            array[i-1]=array[i];
        }
        array[array.length-1]=temp;
        System.out.print("Rotation of an array : ");
        for(int i=0;i<n;i++){
            System.out.print( array[i] +" ");
        }
    }
}