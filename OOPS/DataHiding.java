class Data{
    private int length;
    private int breadth;
    public void setLength(int l)
    {
        length=l;
    }
    public int getLength()
    {
        return length;
    }
    public void setBreadth(int b)
    {
        breadth=b;
    }
    public int getBreadth()
    {
        return breadth;
    }
    public int area()
    {
        return length*breadth;
    }
    public int parimeter()
    {
        return 2*(length+breadth); 
    }
} 

public class DataHiding {
    public static void main(String args[])
    {
        Data d=new Data();
        d.setBreadth(5);
        d.setLength(5);
        System.out.println("Area of rectangle with "+d.getBreadth()+" and "+d.getLength()+" is : "+d.area());
        System.out.println("Parameter of rectangle with "+d.getBreadth()+" and "+d.getLength()+ " is : "+d.parimeter());
    }
}
