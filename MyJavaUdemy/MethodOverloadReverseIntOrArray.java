public class MethodOverloadReverseIntOrArray {
    static int reverse(int n)
    {
        int r,rev=0;
        while(n!=0){
        r=n%10;
        rev=rev*10+r;
        n=n/10;}
        return rev;
    }
    static void reverse(int A[]){
        int n=A.length;
        int B[]=new int[n];
        for(int i=n-1,j=0;i>=0;i--,j++){
            
                B[j]=A[i];
            }
        
            A=B;
            for(int i=0;i<n;i++){
                System.out.print(A[i]+" ");
            }
            System.out.println("");

    }
    public static void main(String args[]){
        int n=1234;
        int A[]={1,2,3,4,5};
                
        System.out.println("Reverse of a number is : "+reverse(n));
        System.out.println("Reverse of an array is :");
        reverse(A);
    }
}
