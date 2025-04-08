package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	
	public static void main(String []args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection 	c =DriverManager.getConnection("jdbc:mysql://localhost:3306/Pollob", "root", "Pollob@");
        PreparedStatement p=c.prepareStatement("INSERT INTO PUPC VALUES(?,?,?)");
           p.setString(1, "fjfff");
           p.setString(2, "01714.91" );
           p.setString(3, "pollob@gmail.com");
    
    
    
        int e=p.executeUpdate();
        
        if(e>0) {
        	System.out.println("insert success");
        }
        
        else {
        	System.out.println("fail");
        }
        
        System.out.println("all done");
        
        c.close();
        p.close();
	}

}