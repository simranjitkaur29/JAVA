import java.util.Scanner;

public class NameOfDay {
    public static void main(String args[]){
        int day;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a day number(1-7)");
        day=sc.nextInt();
        if(day==1){
            System.out.println("Monday");
        }
        else if(day==2){
            System.out.println("Tuesday");
        }
        else if(day==3){
            System.out.println("Wednesday");
        }
        else if(day==4){
            System.out.println("Thursday");
        }
        else if(day==5){
            System.out.println("Friday");
        }
        else if(day==6){
            System.out.println("Saturday");
        }
        else if(day==7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("Invalid ");
        }

    }
    
}
