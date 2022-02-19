import java.sql.*;

public class _004_Statementinterface {

   // public PreparedStatement prepareStatement(String query)throws SQLException{
       // return query ;    }


    public static void main(String args[])throws Exception{


        //Ein Zeile zu löschen

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/projekt","root","");

            Statement stmt=con.createStatement();
        //int result=stmt.executeUpdate("update emp765 set name='Vimal',salary=10000 where id=33");
            int result=stmt.executeUpdate("delete from mitarbeiter where id=25");
            System.out.println(result+" records affected");
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }}
