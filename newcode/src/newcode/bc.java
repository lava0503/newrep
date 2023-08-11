package newcode;
import java.sql.*;
public class bc {
	public void getcontectivity() throws SQLException{
		String url="jdbc:mysql://127.0.0.1:3306/bakery";
		String username="root";
		String password="1101";
		String Query="insert into stock values(?,?)";
		
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.setString( 1,"lavacake");
		pst.setInt(2, 100);
		pst.executeUpdate();
		
	}
	

}
