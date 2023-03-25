import java.util.Scanner;

public class SwitchTypeOfWebsite {
    public static void main(String args[]){
        String name;
        System.out.println("Enter Website name: ");
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        String type=name.substring(name.lastIndexOf(".")+1);
        switch(type){
            case "net":{
                System.out.println("Networking site");
                break;
            }
            case "com":{
                System.out.println("Commercial site");
                break;
            }
            case "org":{
                System.out.println("Organisation site");
                break;
            }
            case "gov":{
                System.out.println("Government site");
                break;
            }
            default:
            System.out.println("Having no information of this site");

        }
    
    }
    
}
