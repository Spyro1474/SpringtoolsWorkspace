package Revature.DAOMadLibs;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice1, choice2 = 0;
		String username, password;
		MadLibbersDAO stuff = new MadLibbersDAOImpl();
		String[] words = new String[5];
		words[4] = "One day, a ! went to the market to !. Noticing " +
						  "the day was !, though, the market closed !.";
		System.out.print("Press 1 to sign up or 2 to register for an account. ");
		choice1 = sc.nextInt();
		
		System.out.print("Please enter your username: ");
		username = sc.next();
		
		System.out.print("Please enter your password: ");
		password = sc.next();
		
		MadLibbers user = new MadLibbers();
		
		if(choice1 == 1) {
			stuff.signup(username, password);
			user = new MadLibbers(username, password);
		} else if(choice1 == 2) {
			if(stuff.checkValidLogin(username, password)) {
				user = new MadLibbers(username, password);
			} else {
				System.out.println("Incorrect username or password.");
			}
		}
		
		System.out.println("Pick the number of the option you want.");
		System.out.println("1. Make a new madlib");
		System.out.println("2. View a saved madlib");
		System.out.println("3. Quit");
		
		choice2 = sc.nextInt();
		
		while(choice2 != 3) {
			
			switch(choice2) {
				case 1:
					System.out.print("Enter a noun: ");
					words[0] = sc.next();
					System.out.print("Enter a verb: ");
					words[1] = sc.next();
					System.out.print("Enter an adjective: ");
					words[2] = sc.next();
					System.out.print("Enter an adverb: ");
					words[3] = sc.next();
					user.makeMadLib(words);
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
