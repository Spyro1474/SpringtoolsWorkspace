package Revature.DAOMadLibs;

public interface MadLibbersDAO {
	public void signup(String username, String password);
	
	public boolean checkValidLogin(String username, String password);
	
	public boolean checkUsername(String username);
}
