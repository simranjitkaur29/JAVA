import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class copyAFile
{
    public static void main(String args[]) throws Exception{
        FileInputStream fis=new FileInputStream("Source1.txt");
        FileOutputStream fos=new FileOutputStream("Source2.txt");
        int b;
        String s="HELLO WORLD";
        

        while((b=fis.read())!=-1)
        {
            if((b>=65&&b<=90))
            {
                fos.write(b+32);
            }
            else{
                fos.write(b);
            }
        }
            fis.close();
            fos.close();
        
        }
    }
    
