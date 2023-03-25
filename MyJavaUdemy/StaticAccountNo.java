import java.util.*;
class Customer{
    private String accNo;
    
    private static int count=1;
    private String generateAccounto(){
        Date d=new Date();
        String an="Ifsc No "+(d.getYear()+1900)+count;
        count++;
        return an;
    }
    Customer(){
        accNo=generateAccounto();
    }
    
    public String getAccountNo(){
        return  accNo ;
    }

}
public class StaticAccountNo{
    public static void main(String args[]){
        Customer c1=new Customer();
        Customer c2=new Customer();
        Customer c3=new Customer();
        Customer c4=new Customer();
        System.out.println(c1.getAccountNo());
        System.out.println(c2.getAccountNo());
        System.out.println(c3.getAccountNo());
        System.out.println(c4.getAccountNo());

    }

}