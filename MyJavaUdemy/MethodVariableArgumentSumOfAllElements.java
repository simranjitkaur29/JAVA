public class MethodVariableArgumentSumOfAllElements{
    static int sum(int ...S){
        int sum=0;
        int n=S.length;
        for(int i=0;i<n;i++)
        {
            sum+=S[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println("Sum of all elements is : "+sum(1,2,3,4,5,6,7,8,9));
        System.out.println("Sum of all elements is : "+sum(1,2,3,4,9));
        System.out.println("Sum of all elements is : "+sum(1,6,7,8,9));
        System.out.println("Sum of all elements is : "+sum(1,2,3));
    }
}