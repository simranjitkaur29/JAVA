import  java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) throws  Exception{

        //driver registration
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Creation of connection
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/simi","root","741852963");

        //Query generation

        String query="insert into student values (?,?,?);";

        PreparedStatement preparedStatement=connection.prepareStatement(query);

        preparedStatement.setInt(1,20);
        preparedStatement.setString(2,"Simran");
        preparedStatement.setFloat(3,99.8f);

        //Excution of query

        preparedStatement.executeUpdate();//return type void
//        preparedStatement.executeQuery();//return type ResultSet

        System.out.println("Successfull excuted");

    }
}