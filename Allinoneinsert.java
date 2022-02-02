import java.sql.*;
import java.io.*;
public class Allinoneinsert
{
public static void main(String ag[])
{
Connection con;
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con = DriverManager.getConnection("jdbc:odbc:ankitallinone");
Statement st = con.createStatement();
st.executeUpdate ("CREATE TABLE Emp" + "(FName VARCHAR(32),LName VARCHAR(32),Address VARCHAR(32),Salary FLOAT)");
}

catch(ClassNotFoundException e)

{
System.out.println(e.toString());

}

catch(SQLException e)
{
System.out.println(e.toString());
}
}

}