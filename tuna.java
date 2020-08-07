package github.com/killakilla4k;
import java.util.Scanner;

public class tuna {
	static apples applesObject = new apples();

	private String password;
	
	private String username;
	
	private String email;
	
	String emailVerify;
	
	int i = 0;
	
	public boolean accountCreation(boolean exist){
		System.out.println("What is your username?");
		Scanner usernameScan = new Scanner(System.in);
		username = usernameScan.next();
		System.out.println("What is your password?");
		Scanner passwordScan = new Scanner(System.in);
		password = passwordScan.next();
		System.out.println("Would you like to enter an email? (Optional) Enter N/A if you would not like to enter an email: ");
		Scanner emailScan = new Scanner(System.in);
		email = emailScan.next();
		return exist = true;
		
	}

	public void Verification(String usernamePotential, String passwordPotential) {
		System.out.println(password);
	if(passwordPotential.equals(password) && usernamePotential.equals(username)) {
		System.out.println("Welcome "+ username);
		
		
	}
	else {
		
		i++;
		System.out.println(i);
		if(i == 3 && email.equals("N/A")) {
			System.out.println("We have recieved a number of strange attempts to access this account.. please try again later");
			System.exit(0);
		}
		else if (i == 3) {
			System.out.println("Please enter your email, and we will send an email to that account with your account details");
			Scanner emailVerifyScan = new Scanner(System.in);
			emailVerify = emailVerifyScan.next();
			if(emailVerify.equals(email)) {
				System.out.println("The email would read\nUsername: "+username + "\nPassword: " + password);
				applesObject.signIn();
			}
			else {
				System.out.println("Sorry, we do not recognize that email, please try again later.");
				System.exit(0);
			}
		}
		System.out.println("That username or password is incorrect, please try again");
		applesObject.signIn();
	}
	

	
}

}
