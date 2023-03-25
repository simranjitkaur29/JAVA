import java.util.*;
public class RadixOFNumber {
    public static void main(String args[]){
        String str;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Any number to find Radix of that number :  ");
        str=sc.next();
        if(str.matches("[01]+")){
            System.out.println("Number is Binary and Radix is =2");
        }
        else if(str.matches("[0-7]+")){
            System.out.println("Number is octal and Radix is =8 ");
        }
        
        else if(str.matches("[0-9A-F]+")){
            System.out.println("Number is Hexadecimal and Radix is =16");
        }
        else if(str.matches("[0-9]+")){
            System.out.println("Number is Decimal and Radix is =10");
        }
        else{
            System.out.println("Number is invalid");
        }
    }
    
}
