package Revature.DAOMadLibs;

public interface MadLibDAO {	
	public void saveMadLib(String name, String madlib, MadLibbers user);
	
	public MadLib getMadLib(String name, String username);
}
