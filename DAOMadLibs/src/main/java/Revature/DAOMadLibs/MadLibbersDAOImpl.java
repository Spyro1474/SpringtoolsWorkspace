package Revature.DAOMadLibs;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MadLibbersDAOImpl implements MadLibbersDAO {

	@Override
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
	public void login(String username, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveMadLib() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MadLib getMadLib() {
		// TODO Auto-generated method stub
		return null;
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
