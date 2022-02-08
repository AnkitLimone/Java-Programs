import java.sql.*;
import java.io.*;

public class MYSQLJDBCINSERT
{
public static void main(String ag[]) throws Exception
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ankit"
                            , "root","Ankit@1516");
String sql ="INSERT INTO EMPP VALUES ('AnkitLimone',3,60000.00,2022-02-07,'%Y',8)";
Statement st = con.createStatement();
int count = st.executeUpdate(sql); 

System.out.println(count+ " row inserted");
st.close();
con.close();
}


}