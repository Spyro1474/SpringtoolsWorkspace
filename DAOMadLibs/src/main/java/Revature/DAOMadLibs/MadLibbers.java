package Revature.DAOMadLibs;

public class MadLibbers {
	private String username;
	private String password;
	
	public MadLibbers(String username, String password) {
		setUsername(username);
		setPassword(password);
	}
	
	public MadLibbers() {
		this.username = "";
		this.password = "";
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	// words[0] = noun
	// words[1] = adjective
	// words[2] = verb
	// words[3] = adverb
	// words[4] = story text
	public String makeMadLib(String[] words) {
		String result = "";
		int length = words[4].length();
		int j = 0;
		
		for(int i = 0; i < length; ++i) {
			char ch = words[4].charAt(i);
			
			if(ch == '!') {
				result += words[j];
				++j;
			} else {
				result += ch;
			}
		}
		
		return result;
	}
	
}