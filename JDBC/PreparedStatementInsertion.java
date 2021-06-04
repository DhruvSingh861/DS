/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;

public class PreparedStatementInsertion {
    public static void main(String args[]){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment1", "root", "");
        String que="insert into emp(empno,ename,job,hiredate,sal,comm,deptno) values(?,?,?,?,?,?,?)";
        //PreparedStatement ps=(PreparedStatement) con.prepareStatement(que);
        PreparedStatement ps = con.prepareStatement(que);
        ps.setInt(1, 100);
        ps.setString(2, "Dhruv Singh");
        ps.setString(3, "Software developer");
        ps.setString(4,"2021-01-01");
        ps.setInt(5, 80000);
        ps.setInt(6, 0);
        ps.setInt(7, 90);
        int i=ps.executeUpdate();
        ps.close();
        con.close();
    }
    catch(Exception e){System.out.println(e);}
}
}    
