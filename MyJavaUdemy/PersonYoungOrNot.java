import java.util.*;
public class PersonYoungOrNot {
    public static void main(String[] args){
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age ");
        age = sc.nextInt();
        if(age>=14&&age<=55){
        System.out.println("You are young man! :)");
        }
        else{
            System.out.println("YOu are not young :(");
        }

    }
    
}
