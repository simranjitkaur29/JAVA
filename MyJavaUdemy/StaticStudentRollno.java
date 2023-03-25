import java.util.*;
class Student {
    private String rollNo;
    private static int count=1;
    private String generateRollNo(){
        Date d=new Date();
        
        String rn="univ_"+(d.getYear()+1900)+ "_"+count;
        count++;
        return rn;
    }

    Student(){
    rollNo=generateRollNo();
}
public String getRollNo(){
    return rollNo;
}
}
public class StaticStudentRollno{
    public static void main(String args[]){
        Student s=new Student();
        System.out.println(s.getRollNo());
    }
}
