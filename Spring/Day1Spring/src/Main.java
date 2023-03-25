import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  //  private static ApplicationContext app;
    public static void main(String[] args) {

        // Read the xml file
//        // Manually
//        Student s1 = new Student(1,"ss");
//        s1.setName("SImi");
//        s1.setRollno(21);


        //app = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext app1 = new ClassPathXmlApplicationContext("spring.xml");

        Student simi= app1.getBean("objType2",Student.class);





        // IOC perform  rather from new we create object we will do it from ap
        //Student vs = app.getBean("objType1",Student.class);
        System.out.println("Roll No :  "+ simi.getRollno()+" Name : "+simi.getName());


    }
}