import java.sql.*;

public class lab_13 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String s1 = "jdbc:mysql://35.222.177.233:3306/carmax?useSSL=false";
		Connection connection = DriverManager.getConnection(s1,"root", "N!ko10101");
		Statement st = connection.createStatement();
		
		ResultSet rs = st.executeQuery("select * from cars;");
		while(rs.next()) {
			
			System.out.println(rs.getString(1)+ " " +rs.getString(2)+ " "+rs.getString(3));

			
		}
		
		
		
		connection.close();
		
		System.out.println("Done");

	}

}
