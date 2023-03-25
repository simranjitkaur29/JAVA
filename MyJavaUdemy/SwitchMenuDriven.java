import java.util.Scanner;

public class SwitchMenuDriven {
    public static void main(String args[])
    {
        int a ,b;
        String option;
        System.out.println("Menu");
        System.out.println("===");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Enter two no.: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter option in  Capital words: ");
        option=sc.nextLine();
        switch(option){
            case "ADD":
            {
                System.out.println("sum : "+(a+b));
                break;
            }
            case "SUB":
            {
                System.out.println("Minus: "+(a-b));
                break;
            
            }
            case "MUL":
            {
                System.out.println("Mul: "+(a*b));
                break;
            }
            case "DIV":
            {
                System.out.println("Div: " +(a/b));
                break;
            }
            default:
            System.out.println("Make sure you satisfy all the conditon ");
        }

sc.close();
    
    }
}
