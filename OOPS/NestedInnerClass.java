class Outer
{
    int x=23;
    // Inner i=new Inner();

    class Inner
    {
        int y=20;
        public void innerDisplay()
        {
        System.out.println("value of x is: "+x);
        System.out.println("Value oof y is : "+y);
        }

    }
    public void outerDisplay()
    {
         Inner i=new Inner();
        i.innerDisplay();
        
    }

}
public class NestedInnerClass {
    public static void main(String args[])
    {

        // Outer o=new Outer();
        // o.outerDisplay();
        Outer.Inner oi=new Outer().new Inner();
        oi.innerDisplay();

    }
}
