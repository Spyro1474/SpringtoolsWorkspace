package Revature.DAOMadLibs;

public interface MadLibDAO {
	// retrieves saved madlibs by user
	public MadLib getMadLib(String name, MadLibbers user);
	
	// add madlib to the database
	public void saveMadLib();
}
