public class ArrayIncreasingSizeOfArray {
    public static void main(String args[])
    {
        int A[]={1,2,3,4,5};
        System.out.println("length of A array : "+A.length);
        int B[]=new int[2*A.length];
       
        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        A=B;
        B=null;
        System.out.println("Now length of A array : "+A.length );
    }
}
