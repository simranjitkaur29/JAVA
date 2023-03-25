import java.util.*;
import java.util.Scanner;
public class YearLeapOrNot{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int year;
        System.out.println("Enter Leap year : ");
        year = sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Its a leap year");

                }else{
                    System.out.println("Its not a leap year");
                }}
                else{
                    System.out.println("Its a leap year");
                }
            }
        
        else{
            System.out.println("it is not a leap year");
        }
        sc.close();

    }
}