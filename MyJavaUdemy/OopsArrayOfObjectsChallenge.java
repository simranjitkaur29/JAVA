import java.lang.reflect.Constructor;

import org.w3c.dom.DOMStringList;

class Subject{
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtain;
    public String getsubId(){
        return subId;

    }
    public String getName(){
        return name;
    }
    public int getMaxMarks(){
        return maxMarks;
    }
    public int getmarksObtain(){
        return marksObtain;
    }
    public void setmaxMarks(int m){
        maxMarks=m;
    }
    public void setObtainMarks(int o){
        marksObtain=o;
    }
   public  boolean isQualified(){
        return marksObtain>=maxMarks/10*4;
    }
    public String toString(){
        return "\n subject ID : "+subId+"\n Name : "+name+"\n Marks Obtained : "+marksObtain;
    }
    public Subject(String s,String n){
        subId=s;
        name=n;
    }
    public Subject(String s,String n,int o){
        subId=s;
        name=n;
        
        marksObtain=o;
    }
    public Subject(String s,String n,int m,int o){
        subId=s;
        name=n;
        maxMarks=m;
        marksObtain=o;
    }
}
class Student{
    private int rollNo;
    private String name;
    private String dept;
    private String subjects;
    public int getRollno(){
        return rollNo;
    }
    public String getName(){
        return name;
    }
    public String getDept(){
        return dept;
    }
    public String getSubjects(){
        return subjects;
    }
    public void setSubjects(String s) {
        subjects=s; 
    }
    public String toString(){
        return "\n rollNo : "+rollNo+"\n Name "+name+"\n dept " +dept;
    }
    public Student(int r,String n,String d) {
        rollNo=r;
        name=n;
        dept=d;


    }
}
public class OopsArrayOfObjectsChallenge {
    public static void main(String args[])
    {
        Subject sub[]=new Subject[4];
        sub[0]=new Subject("cse310","Java",82);
        sub[1]=new Subject("Int404","Python",75);
        sub[2]=new Subject("Cse205", "DSA",80);
        sub[3]=new Subject("Cse101", "C",200,80 );
       
        for(Subject s:sub){
            System.out.println(s);
        }
       
        Student stu[] =new Student[2];
       
        stu[0]=new Student(78, "simi", "cse");
        stu[1]=new Student(74,"simran","ece");
        for(Student s2:stu){
        System.out.println(s2);
        }
      
    }
}
