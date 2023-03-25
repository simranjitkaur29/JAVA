import java.util.Scanner;

//  Display a number in words even with tailing 0
public class DisplayNumberInWords{
    public static void main(String args[]){
        int n,r;
        System.out.println("Enter number : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        String str="";
        char c;
        while(n!=0){
            r=n%10;
            n=n/10;
            str=str+r;

        }
        for(int i=str.length()-1;i>=0;i--){
            c=str.charAt(i);
            switch(c){
                case '1':{
                System.out.print("One ");
                break;}
                case '2':{
                    System.out.print("Two ");
                    break;}
                    case '3':{
                        System.out.print("Three ");
                        break;}
                        case '4':{
                        System.out.print("Four ");
                        break;}
                        case '5':{
                        System.out.print("Five ");
                        break;}
                        case '6':{
                        System.out.print ("Six ");
                        break;}
                        case '7':{
                        System.out.print("Seven ");
                        break;}
                        case '8':{
                        System.out.print("Eight ");

                        break;}
                        case '9':{
                        System.out.print("Nine ");
                        break;}
                        case '0':{
                        System.out.print("Zero ");
                        break;}
            }
        

        
    }
    
}}