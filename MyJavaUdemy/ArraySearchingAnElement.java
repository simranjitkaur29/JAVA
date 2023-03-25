import java.util.*;
public class ArraySearchingAnElement {
    public static void main(String args[])
    {
        int n,key;
     
        System.out.println("Enter Size of Array : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter all the elements of array : ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter Key element which you want to find out from the array : ");
        key=sc.nextInt();
        for(int i=0;i<n;i++){
            if(array[i]==key){
                System.out.println("Your Key element is at position : "+i);
                System.exit(0);
            }
        }
        System.out.println("Not Found");
        sc.close();
    }
    
}
