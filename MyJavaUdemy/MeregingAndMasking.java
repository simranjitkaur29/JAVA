import java.util.*;
public class MeregingAndMasking{
    public static void main(String arga[]){
        byte a=9,b=12;//here 9 takes 4 bits and b also take 4 bits 
        
        byte c;//so we have to store both in c 
        c=(byte)(a<<4);
        c=(byte)(c|b);
        //to see first four bits are storing 9 or not
        System.out.println((c&0b11110000)>>4);
        System.out.println((c&0b00001111));//no need to shift they are already on right place
       }
}
