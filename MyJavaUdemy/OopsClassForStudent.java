class Student{
    public int rollNo;
   public  String name;
    public String course;
    public int  marks1,marks2,marks3;
    public int total(){
        return marks1+marks2+marks3;

    } 
    public int average(){
        return (marks1+marks2+marks3)/3;
    }
    public char grade(){
        if(total()>=70){
            return 'A';
        }
        else{
            return 'B';
        }

    }

}
public class OopsClassForStudent {
    public static void main(String args[])
    {
Student s=new Student();
s.rollNo=45;
s.name="Simranjit";
s.course="Math";
s.marks1=78;
s.marks2=45;
s.marks3=55;
System.out.println("Roll no :"+s.rollNo+" Name : "+s.name+" in course  : "+s.course+" got total marks : "+s.total()+" average marks : "+s.average()+" and grade is : "+s.grade()); 

    }
    
}
