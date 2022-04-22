package Revature.DAOMadLibs;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MadLibDAOImpl implements MadLibDAO {
	@Override
	public void saveMadLib(String name, String madlib, MadLibbers user) {
		try {
			String command = "INSERT INTO madlibs " +
							 "VALUES (?, ?, ?);";
			PreparedStatement st = ConnectionManager.getConnection()
													.prepareStatement(command);
			
			st.setString(1, name);
			st.setString(2, madlib);
			st.setString(3, user.getUsername());
			st.execute();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public MadLib getMadLib(String name, String username) {
		try {
			String query = "SELECT * " +
						   "FROM madlibs " +
						   "WHERE madlib_name = ? " +
						   "AND username = ?;";
			PreparedStatement st = ConnectionManager.getConnection()
													.prepareStatement(query);
			
			st.setString(1, name);
			st.setString(2, username);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				MadLib result = new MadLib(rs.getString("madlib_name"),
										   rs.getString("madlib"),
										   rs.getString("username"));
				return result;
			}
			
			return null;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
