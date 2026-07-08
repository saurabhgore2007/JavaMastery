package Day23;

import java.sql.*;

public class DatabaseConnectionEx2 {

	public static void main(String[] args) {

	      String url = "jdbc:mysql://localhost:3306/test";
	      String username = "root";
	      String password = "shreyas";

	      String sql = "SELECT * FROM student";

	      String createTable = """
	      				CREATE TABLE IF NOT EXISTS student(
	      					id INT PRIMARY KEY,
	      					name VARCHAR(30),
	      					age INT
	      				)
	      		""";
	      
	      String insertRec = """
	    	        INSERT INTO student(id, name, age)
	    	        VALUES
	    	        (1,'Saurabh',22),
	    	        (2,'Rahul',21),
	    	        (3,'Priya',20),
	    	        (4,'Amit',23)
	    	        """;
	      
	      try (
	                Connection con = DriverManager.getConnection(url, username, password);
	                Statement stmt = con.createStatement();
	        ) {

	    	  	stmt.executeUpdate(createTable);
	            System.out.println("Table Created Successfully!");
	            
	    	  	int rows = stmt.executeUpdate(insertRec);
	    	  	System.out.println(rows + " Record Inserted");
                ResultSet rs = stmt.executeQuery(sql);

	    	  	while (rs.next()) {

	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                int age = rs.getInt("age");

	                System.out.println(id + " " + name + " " + age);
	            }
	    	  	
	    	  	stmt.executeUpdate("DROP TABLE student");
	      }
	         catch (SQLException e) {

	            e.printStackTrace();

	        }
	}

}
