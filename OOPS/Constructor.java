class rectangle{
    private int length;
    private int breadth;
    public rectangle()
    {
        length=1;
        breadth=1;
    }
    // public rectangle(int l,int b)
    // {
    //     length=l;
    //     breadth=b;
    // }
    public void setLength(int l)
    {
        if(l>0)
        {
            length=l;
        }
        else
        {
            length=0;
        }
    }
    public int getLength()
    {
        return length;
    }
    public void setBreadth(int b)
    {
        if(b>0)
        {
            breadth=b;
        }
        else
        {
            length=0;
        }
    }
    public int getBreadth()
    {
        return breadth;
    }
    public rectangle(int l,int b)
    {
        setBreadth(b);
        setLength(l);
    }
    public int area()
    {
        return length*breadth;
    }
    public int parameter()
    {
        return 2*(length+breadth);
    }



}
public class Constructor {
    public static void main(String args[])
    {
        rectangle r=new rectangle(-1,-1);
    System.out.println(r.area());
    System.out.println(r.parameter());
    rectangle r1=new rectangle();
    System.out.println(r1.area());
    System.out.println(r1.parameter());
    rectangle r2=new rectangle(5,10);
    System.out.println(r2.area());
    System.out.println(r2.parameter());
    }
    
}
