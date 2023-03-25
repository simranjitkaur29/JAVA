public class MethodVaiableArgumentsMaximumOfNumbers {
    static int max(int ...A)
    {int m;
        if(A.length==0)
        return Integer.MIN_VALUE;
        m=A[0];
        for(int i=0;i<A.length;i++){
            if(m<A[i]){
                m=A[i];
            }
        }
        return m;

    }
    public static void main(String[] args){
        System.out.println("Maximum value is : "+max(1,2,3,4,5,6,6,6,5,8,9,4)); 
    }
    
    
}
