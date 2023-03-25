import java.util.Scanner;

public class NestedLoopPattern10 {
    public static void main(String args[])
    {
        int row,column;
        System.out.println("Enter row and column: ");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        column=sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=column;j++)
            {
                if(i+j>row){
                    System.out.print("* ");
                }
                else{
                    System.out.print( " ");
                }

            }
            for(int j=column;j>=1;j--){
                if(i+j>6){
                    System.out.print("* ");
                }
                else{
                    System.out.print( " ");
                }
            }   
System.out.print("\n");
        }
        for(int i=row-1;i>=1;i--)
        {
            for(int j=1;j<=column;j++)
            {
                if(i+j>row){
                    System.out.print("* ");
                }
                else{
                    System.out.print( " ");
                }

            } 
            for(int j=column;j>=1;j--){
                if(i+j>6){
                    System.out.print("* ");
                }
                else{
                    System.out.print( " ");
                }
            }     
System.out.print("\n");
        }
    }
    
}
