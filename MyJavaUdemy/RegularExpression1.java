public class RegularExpression1 {
    public static void main(String args[])
    {
        int b=10110001;
        String  c="132346AZ";
        String d= "01/12/2022";
        String str=b+"";
   
        System.out.println(str.matches("[10]*"));//number contains binary digit or not
        System.out.println(c.matches("[0-9A-F]*"));//number contains hexadecimal or not
        System.out.println(d.matches("[0-3][1-9]/[01][0-9]/[0-9]{4}"));
    }
 
    
}
