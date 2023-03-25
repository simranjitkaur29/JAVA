class Account{
    public int AccNo;
    public String name;
    public String address;
    public int phnNo;
    public String dob;
    public int balance=100;
    public int getAccNo(){
        return AccNo;
    }
    public int getbalance(){
        return balance;
    }
    public String getname(){
        return name;
    }
    public String getaddress(){
        return address;
    }
    public int getphnNo(){
        return phnNo;
    }
    public String getdob(){
        return dob;
    }
    public void setaddress(String address){
        this.address=address;
    }
    public void setPhnNo(int phnNo){
        this.phnNo=phnNo;
    }
    public Account(int AccNo,String name){
        this.AccNo=AccNo;
        this.name=name;
    }
    public String toString(){
        return "Name : "+name+" \nAccNo : "+AccNo+ " \nOld Balance : "+balance;
    }
}
class SavingAccount extends Account{
    public int deposit;
    public int withDraw;
    

    public int getdeposit(){
        return deposit;
    }
      public int getwithDraw()
    {
        return withDraw;
    }
    
    public void setDeposit(int deposit){
        this.deposit=deposit;
    }
    public void setdraw(int withdraw){
        this.withDraw=withdraw;
    
    }
    public int AddAmount(int deposit,int balance){
        super.getbalance();
    
        balance+=deposit;
        return balance;
    }
    public int  DrawAmmount(int withDraw,int balance){
        super.getbalance();
        balance-=withDraw;
        return balance;
    }
   public String toString(){
       return (super.toString()+" \nDeposited Ammount: "+deposit+" \nDrawerAmount : "+withDraw +" \nTotal amount : "+ (AddAmount(deposit,balance)-DrawAmmount(withDraw, balance)));
   } 
   public SavingAccount(String name,int AccNo){
       super(AccNo, name);
   }
 
}
public class InheritanceAccountCustomer{
    public static void main(String args[])
   
    {
        SavingAccount s=new SavingAccount( "smekf",87812);
         s.setDeposit(10000);
         s.setdraw(50);
       
        System.out.println(s);

}}
