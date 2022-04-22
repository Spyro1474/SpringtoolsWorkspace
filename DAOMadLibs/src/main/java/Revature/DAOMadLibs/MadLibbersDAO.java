package Revature.DAOMadLibs;

public interface MadLibbersDAO {
	public void signup(String username, String password);
	
	public void login(String username, String password);
	
	public void saveMadLib();
	
	public MadLib getMadLib();
}
