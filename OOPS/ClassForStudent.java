class Student
{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int total()
    {
        return m1+m2+m3;
    }
    public double average()
    {
        return (m1+m2+m3)/3;
    }
    public String grade()
    {
        if(average()>=80)
        {
            return "A";

        }
        else if(average()<60&&average()>=40)
        {
            return "B";
        }
        return "C";
    }

}
public class ClassForStudent {
    public static void main(String args[])

    {
        Student s=new Student();
        s.course="DATA-MANAGEMENT";
        s.name="Simranjit kaur";
        s.roll=46;
        s.m1=45;
        s.m2=46;
        s.m3=47;
        System.out.println("Total Marks Of "+s.name+" in "+s.course+" : "+s.total());
        System.out.println("Average Marks Of "+s.name+" in "+s.course+" : "+s.average());
        System.out.println("Grade of "+s.name+" in "+s.course+" : "+s.grade());

       
    }
}
