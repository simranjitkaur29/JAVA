import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class MethodFindMaximumElementInArray {
    int max(int A[],int size)
    {int m=A[0];
       for(int i=0;i<size;i++){
           if(m<A[i]){
              m= A[i];
               
   }
       }
       return m;


}
public static void main(String args[])
{
    int A[]={2,5,7,8,9};
    MethodFindMaximumElementInArray m=new MethodFindMaximumElementInArray();
    System.out.println("maximum element is : "+m.max(A,5));
}

}