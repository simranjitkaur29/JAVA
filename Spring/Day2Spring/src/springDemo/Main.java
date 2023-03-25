package springDemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

interface Shape {
    void getArea();
}
@Component
class GetShape implements InitializingBean, DisposableBean {
    @Autowired
    Rectangle rectangle;

    @Override
    public void destroy() throws Exception
    {
        System.out.println("Destroy method");
    }
    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("After properties set");
    }

    public  void init()
    {
        System.out.println("init method");
    }
//    @PostConstruct
//    public void postConstruct()
//    {
//        System.out.println("Post construct");
//    }
//    @PreDestroy
//    public void preDestroy()
//    {
//        System.out.println("pre destroy");
//    }

}
@Component
@Scope(scopeName = "prototype")
class Triangle implements Shape {


    int side1;
    int side2;
    int side3;
       public Triangle( @Value("10") int side1,@Value("20") int side2,@Value("30") int side3)
    {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    @Override
    public void getArea() {


        double peri=(side1+side2+side3)/2;
        double area=Math.sqrt(Math.abs((peri)*(peri-side1)*(peri-side2)*(peri-side3)));
        System.out.println("Area of triangle is "+area);

    }

}
@Component
@Scope(scopeName = "prototype")
class EquilateralTriangle extends Triangle
{

    public EquilateralTriangle(@Value("30") int sides)
    {
        super(sides,sides,sides);

    }


}
@Component
@Scope(scopeName = "prototype")
class IsocelesTriangle extends Triangle
{

    public IsocelesTriangle(@Value("20") int side1,@Value("20") int side2)
    {
        super(side1,side2,side2);
    }
}
@Component
@Scope(scopeName = "prototype")
class Rectangle implements Shape
{
    int length;
    int breadth;

    public Rectangle(@Value("10") int length,@Value("10") int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    @Override
    public void getArea() {
        System.out.println("Area of triangle is : "+length*breadth);

    }
}
@Component
@Scope(scopeName = "prototype")
class  Square extends Rectangle
{

    public Square(@Value("10") int side)
    {
        super(side,side);
    }
}
public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext app=new ClassPathXmlApplicationContext("spring-Anotation.xml");
        Shape shape=app.getBean("triangle",Triangle.class);
        shape.getArea();
        Shape shape1=app.getBean("equilateralTriangle",EquilateralTriangle.class);
        shape1.getArea();
        Shape shape2=app.getBean("isocelesTriangle",IsocelesTriangle.class);
        shape2.getArea();
        Shape shape3=app.getBean("rectangle",Rectangle.class);
        shape3.getArea();
        Shape shape4=app.
                getBean("square",Square.class);
        shape4.getArea();

        GetShape getShape=app.getBean("getShape",GetShape.class);
        getShape.rectangle.getArea();
        getShape.destroy();
    }
}
