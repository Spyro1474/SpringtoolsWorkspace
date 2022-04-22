package Revature.DAOMadLibs;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MadLibbersDAOImpl implements MadLibbersDAO {

	public void signup(String username, String password) {
		try {
			if(checkUsername(username)) {
				String command = "INSERT INTO madlibbers " +
								 "VALUES (?, ?);";
				PreparedStatement st = ConnectionManager.getConnection()
													    .prepareStatement(command);
				st.setString(1, username);
				st.setString(2, password);
				st.execute();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
		
	@Override
	public boolean checkValidLogin(String username, String password) {
		try {
			String query = "SELECT * " +
					 	   "FROM madlibbers " +
					 	   "WHERE username = ? " +
					 	   "AND passcode = ?;";
			PreparedStatement st = ConnectionManager.getConnection()
				    								.prepareStatement(query);
			st.setString(1, username);
			st.setString(2, password);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				return true;
			}
			return false;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}
	
	public boolean checkUsername(String username) {
		try {
			String query = "SELECT * FROM madlibbers " +
						   "WHERE username = ?;";
			
			PreparedStatement st = ConnectionManager.getConnection()
													.prepareStatement(query);
			st.setString(1, username);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				return false;
			} // end if
			
			return true;
		} catch(SQLException e) {
			e.printStackTrace();
		} // end try-catch
		
		return false;
	} // end checkUsername()
	
}
