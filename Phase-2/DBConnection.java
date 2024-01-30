


import java.sql.*;
import java.util.*;

public class DBConnection {
    public static void main(String[] args)throws Exception {
    	Scanner sc=new Scanner(System.in);
    	boolean ans=true;
    	while(ans) {
    		System.out.println("1-create 2-read 3-update 4-delete 5-exit");
    		int n=sc.nextInt();
    		switch(n) {
    		case 1:
    			create();
    			break;
    		case 2:
    			read();
    			break;
    		case 3:
    			update();
    			break;
    		case 4:
    			delete();
    			break;
    		case 5:
    			ans=false;
    			break;
    		default:
    			System.out.print("Enter the valid option ");
    			break;
            
            }
    	}
         
    }
    public static void read() throws Exception {
    	
        	String url="jdbc:mysql://localhost:3306/JDBCdemo";
        	String user="root";
        	String pass="bala";
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from student");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
            con.close();
        
    }
    public static void prcreate()throws Exception {
    	String url="jdbc:mysql://localhost:3306/JDBCdemo";
    	String user="root";
    	String pass="bala";
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the id:");
    	int id=sc.nextInt();
    	System.out.println("Enter the name");
    	String name=sc.next();
    	
    	System.out.println("enter the Age");
    	int age=sc.nextInt();
    	String query="insert into student values(?,?,?)";
        Connection con = DriverManager.getConnection(url, user, pass);
        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1, id);   
        pst.setString(2, name);
        pst.setInt(3, age);
        int row=pst.executeUpdate();
        System.out.println("Row affeccted "+row);
    }
    public static void create()throws Exception {
    	String url="jdbc:mysql://localhost:3306/JDBCdemo";
    	String user="root";
    	String pass="bala";
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the id:");
    	int id=sc.nextInt();
    	System.out.println("Enter the name");
    	String name=sc.next();
    	System.out.println("enter the Age");
    	int age=sc.nextInt();
    	//insert into student values(id,name,age);
    	String query="insert into student values("+ id +",'"+ name +"',"+ age +");";
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        int row=st.executeUpdate(query);
        
        System.out.println("Row affeccted "+row);
    }
    public static void delete() throws Exception{
    	String url="jdbc:mysql://localhost:3306/JDBCdemo";
    	String user="root";
    	String pass="bala";
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the id:");
    	int id=sc.nextInt();
    	String query="delete from student where id="+id;
        Connection con = DriverManager.getConnection(url, user, pass);
        PreparedStatement pst = con.prepareStatement(query);
        int row=pst.executeUpdate();
        System.out.println("Row affeccted "+row);
    }
    public static void update() throws Exception{
    	String url="jdbc:mysql://localhost:3306/JDBCdemo";
    	String user="root";
    	String pass="bala";
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the id:");
    	int id=sc.nextInt();
    	boolean ans=true;
    	while(ans) {
    		System.out.println("1-update name 2-update age ");
    		int update=sc.nextInt();
    		switch(update) {
    		case 1:
    			System.out.println("enter the updated name");
    			String name=sc.next();
    	    	String query="update student set name= ? where id= ?";
    	        Connection con = DriverManager.getConnection(url, user, pass);
    	        PreparedStatement pst = con.prepareStatement(query);
    	        pst.setString(1, name);
    	        pst.setInt(2, id);
    	        int row=pst.executeUpdate();
    	        System.out.println("Row affeccted "+row);
    	        break;
    	        
    		case 2:
    			 System.out.println("enter the updated age");
    			 int age=sc.nextInt();
    			 String query1="update student set age=? where id=?";
    			 Connection con1 = DriverManager.getConnection(url, user, pass);
     	        PreparedStatement pst1 = con1.prepareStatement(query1);
     	        pst1.setInt(1, age);
     	        pst1.setInt(2, id);
     	        int row1=pst1.executeUpdate();
     	        System.out.println("Row affeccted "+row1);
     	        break;
    		case 3:
    			ans=false;
    			break;
    		}
    		
    	}
    	System.out.println("enter the updated age");
    	int age=sc.nextInt();
    	String query="update students set age="+age;
        Connection con = DriverManager.getConnection(url, user, pass);
        PreparedStatement pst = con.prepareStatement(query);
        int row=pst.executeUpdate();
        System.out.println("Row affeccted "+row);
    }
}
