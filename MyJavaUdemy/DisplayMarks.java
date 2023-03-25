import java.util.*;
public class DisplayMarks {
    public static void main(String args[] ){
        int marks1,marks2,marks3,total,avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of first subject : ");
        marks1=sc.nextInt();
        System.out.println("Enter marks of second subject : ");
        marks2=sc.nextInt();
        System.out.println("Enter marks of Third subject : ");
        marks3=sc.nextInt();
        total=marks1+marks2+marks3;
        avg=total/3;
        System.out.println("Total of your marks is : "+total);
        System.out.println("Average of your marks is : "+avg);
        if(avg>=70){
            System.out.println("As given condition your Grade is : A");

        }else if(avg>=60 && avg<70){
            System.out.println("As given condition your Grade is : B");

        }
        else if(avg>=50 &&avg<60){
            System.out.println("As given condition your Grade is : C");
        }
        else if(avg>=40 &&avg <50){
            System.out.println("As given condition your Grade is : D");
        }
        else{
            System.out.println("You are fail in Exam ");
        }




    }
}
