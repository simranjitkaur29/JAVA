import java.sql.
        Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class ResultFromMySql
{
    public static void main(String[] args) throws  Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/simi","root","741852963");

        String query="select * from student ;";

        Statement statement=connection.createStatement();

     ResultSet resultSet=   statement.executeQuery(query);
     while(resultSet.next())
     {
        int rollNo= resultSet.getInt(1);
        String name=resultSet.getString(2);
        float marks=resultSet.getFloat(3);
         System.out.println("RollNo : "+rollNo+" Name : "+name+" Marks: "+marks);
     }

    }
}
