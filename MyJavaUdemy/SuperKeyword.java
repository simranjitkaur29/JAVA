class A {
    public int x=1;
}
class B extends A {
    public int x=2;

}
class C extends B{
    public int x=3;
    void display(){
        System.out.println((super.x));
    }
}
public class  SuperKeyword{
    public static void main(String args[]){
    C c1=new  C(); 
    c1.display();
    }

}
    
