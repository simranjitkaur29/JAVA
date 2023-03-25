import java.util.*;
import java.lang.*;
public class TypeOfWebsite {
    public static void main (String args[]) {
        String url="https://www.google.com";
        int i=url.indexOf(":");
        
       
        String protocol=url.substring(url.lastIndexOf(".")+1);
        String type=url.substring(0,i );
        if(type.equals("https")){
            System.out.println("Type of website is : Hyper text transfer protocol");
        }
        else if(type.equals("ftp")){
            System.out.println("Type of website is : File transfer protocol");
        }
        else{
            System.out.println("Not identifies");

        }
        if (protocol.equals("com")){
            System.out.println("Commercial website");
        }
        else if(protocol.equals("net")){
            System.out.println("network website");
        }
        else if(protocol.equals("org")){
            System.out.println("Organization website");
        }
        else{
            System.out.println("Having no idea about it");
        }
        
    }
}
