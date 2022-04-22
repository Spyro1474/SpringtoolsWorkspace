package Revature.DAOMadLibs;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ask if account is made
		// read in username and password
		
		// sign up/log in
		// create a new user with their credentials "user"
		
		// present menu with choice
			// make a mad lib
			// view a saved mad lib
			// log out
		// gotta do that too idk
		
		int x = 0;
		
		while(x != 3) {
			
			switch(x) {
				case 1:
					//user.makeMadLib()
					//option to save the mad lib
					break;
				case 2:
					// view a saved mad lib
					break;
				case 3:
					// log out
					break;
				default:
					System.out.println("Invalid. Try Again.");
			}
		}

	}

}
