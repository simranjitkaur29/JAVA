class Cylinder {
    private int  radius;
    private int height;
    public Cylinder(){
        radius=0;
        height=0;
    }
    public Cylinder(int r,int h){
        radius =r;
        height=h;
    }
   public int getRadius(){
        return radius;
    }
    public int  getHeight(){
        return height;
    }
    public void setRadius(int r){
        radius=r;

    }
    public void setHeight(int h){
        height =h;
    }
    public double area(){
        return (2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
    }

}
public class OopsConstructorCylinder {
    public static void main(String args[])
    {
        Cylinder c=new Cylinder(45,78);
        System.out.println(" surface Area of cylinder is : " + c.area());

    }
    
}
