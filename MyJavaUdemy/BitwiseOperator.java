import java.util.*;
public class BitwiseOperator{
 public static void main(String[] args) {
        
    
        int a=0b1010,b=0b0110,x,y,z,w,v;
        x=a&b;
        y=a|b;
        z=a^b;
        w=x>>1;
        v=x<<1;

        System.out.println("Bitwise and opeator: "+Integer.toBinaryString(x));
        System.out.println("Bitwise Or operator :  "+ Integer.toBinaryString(y));
        System.out.println("Bitwise Xor operator : " +Integer.toBinaryString(z));
        System.out.println("Bitwise not operator : " + ~a);
        System.out.println("Bitwise left shift operator : "+ Integer.toBinaryString(w));
        System.out.println("Bitwise right operator : " + Integer.toBinaryString(v));



    }
}