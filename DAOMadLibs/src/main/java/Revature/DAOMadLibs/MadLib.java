package Revature.DAOMadLibs;

public class MadLib {

	private String madlibName;
	private String madlibText;
	private String username;
	
	public MadLib(String madlibName, String madlibText, String username) {
		setMadlibName(madlibName);
		setMadlibText(madlibText);
		setUsername(username);
	}
	
	public String getMadlibName() {
		return madlibName;
	}
	
	public void setMadlibName(String madlibName) {
		this.madlibName = madlibName;
	}
	
	public String getMadlibText() {
		return madlibText;
	}
	
	public void setMadlibText(String madlibText) {
		this.madlibText = madlibText;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	
}
