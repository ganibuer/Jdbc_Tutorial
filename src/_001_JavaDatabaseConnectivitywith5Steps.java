import java.sql.*;

public class _001_JavaDatabaseConnectivitywith5Steps {

    public static void forName(String className) throws ClassNotFoundException, SQLException {
        //1 Register the driver class
        Class.forName("oracle.jdbc.driver.OracleDriver");
        //2 Create the connection object
        Connection connection= DriverManager.getConnection("jdbc.oracle:thin:localhost:3306","root","1234");
        //3 Create the Statement object
        Statement stmt=connection.createStatement();
        //4 Execute the query

        ResultSet rs=stmt.executeQuery("select * from emp");

        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }
        //5) Close the connection object

        connection.close();

    }

}
