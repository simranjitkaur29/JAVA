class Rectangle
{
    int length;
    int breadth;
    int x=10;
    
    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
   
}

class Cuboid extends Rectangle
{
    int height;
    int x=20;
    
    Cuboid(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    
    void display()
    {
        System.out.println(super.x);
        System.out.println(x);
        System.out.println(this.length);
        System.out.println(this.breadth);
        System.out.println(this.height);
    }
}


public class ThisAndSuper 
{
    public static void main(String[] args) 
    {
    
           Cuboid c=new Cuboid(10,5,20);
          
           c.display();
        
    }   
}