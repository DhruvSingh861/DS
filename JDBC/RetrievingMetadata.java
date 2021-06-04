/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;

public class RetrievingMetadata {
    public static void main(String args[]){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment1", "root", "");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from emp");
        ResultSetMetaData rsmd=rs.getMetaData();
            System.out.println("Total number of column= "+rsmd.getColumnCount());
            System.out.println("Name of second column= "+rsmd.getColumnName(2));
            System.out.println("Type of second column= "+rsmd.getColumnType(2));
            con.close();
    }
    catch(Exception e){System.out.println(e);}
}
}    
