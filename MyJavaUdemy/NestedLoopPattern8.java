import java.util.*;
public class NestedLoopPattern8 {
    public static void main(String[] args)
    {
        int row,column;
        System.out.println("Enter Row and Column : ");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        column=sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=column;j++)
            {
                if(j>i){
                System.out.print("*" +" ");
            }
        else{
            System.out.print(" "+ " ");
        }}
            
            System.out.println("\n");
        }


}
}
 
