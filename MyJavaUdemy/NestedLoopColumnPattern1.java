import java.util.Scanner;

public class NestedLoopColumnPattern1{
    public static void main(String[] args){
        int row,column;
            System.out.println("Enter Row and Column : ");
            Scanner sc=new Scanner(System.in);
            row=sc.nextInt();
            column=sc.nextInt();
            for(int i=1;i<=row;i++)
            {
                for(int j=1;j<=column;j++)
                {
                    System.out.print(j +" ");
                }
                System.out.println("\n");
            }


    }
}