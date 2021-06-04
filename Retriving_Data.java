/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;

public class Retriving_Data {
    public static void main(String args[]){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment1", "root", "");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from emp");
        while(rs.next()){
            System.out.print(rs.getInt(1)+"\t  ");
            System.out.print(rs.getString(2)+"   ");
            System.out.print(rs.getString(3)+"   ");
            System.out.print(rs.getDate(4)+"   ");
            System.out.print(rs.getInt(5)+"   ");
            System.out.print(rs.getInt(6)+"   ");
            System.out.println(rs.getInt(7));
        }
    }
    catch(Exception e){System.out.println(e);}
}
}    
