class Product{
    private String itemno="46";
    private String name;
    private double price=45.55;
   private int qnty;
   public  Product(String i,String n){
    itemno=i;
    name=n;
}
   public  Product(String i,String n,double p,int q){
       itemno=i;
       name=n;
       price=p;
       qnty=q;
   }
   public String getItemNo(){
       return itemno;
   }
   public String getName(){
       return name;
   }
   public double getPrice(){
       return price;

   } 
   public int getQnty(){
       return qnty;

   }
   public void setPrice(double p)
   {
       price=p;
   }
   public void setqnty(int q){
       qnty=q;
   }



}

class Customer{
    private String custid;
    private String name;
    private String address;
    private String phnno;
    public String getCustid(){
        return custid;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhnno(){
        return phnno;
    }
    public void setAddress(String a){
        address=a;

    }
    public void setPhno(String p){
        phnno=p;
    }
    public Customer(String c,String n ){
        custid=c;
        name=n;
    }
    public Customer(String c,String n,String a,String p ){
        custid=c;
        name=n;
        address=a;
        phnno=p;
    }


}
public class OopsProductAndCustomer {
    public static void main(String args[]){
        Product p=new Product("AK45", "cocacola");
       System.out.println( p.getItemNo()+p.getPrice());

    }
}
