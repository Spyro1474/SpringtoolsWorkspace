package Revature.DAOMadLibs;

public interface MadLibDAO {	
	public void saveMadLib(MadLib lib);
	
	public MadLib getMadLib(String name, String username);
}
