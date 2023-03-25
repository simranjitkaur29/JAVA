public class MethodVariableDiscount {
    static double discount(double ...p){
        double sum=0;
        double discount=0;
        int n=p.length;
        for(int i=0;i<n;i++)
        {
            sum+=p[i];
        }
        if(sum<500){
            System.out.println("congratulation!! you get 10% discount");
            discount = 0.1;
        }
        else if(sum>500 || sum<1000){
            System.out.println("congratulation!! you get 15% discount");
            discount=0.15;
        }
        else if(sum>=1000){
            System.out.println("congratulation!! you get 25% discount");
            discount=0.25;
        }
        return discount*sum;
    }
    public static void main(String args[]){
        System.out.println("If you pay more than ₹500 then you will get discount :) ");
        System.out.println(discount(100,250,258.05,500,500.523));
    }
}
