github.com/killakilla4k
import java.util.Scanner;

public class apples {
	static tuna tunaObject = new tuna();

	
	
	public static void main(String args[]) {
		
		boolean exist = false;
		Scanner bucky = new Scanner(System.in);
		System.out.println("Sign up or sign in? ");
		String existenceQuestion = bucky.next();
		if (existenceQuestion.toUpperCase().equals("UP")) {
			System.out.println("Redirecting you to sign up...");
			tunaObject.accountCreation(exist);
		}
		else if (existenceQuestion.toUpperCase().equals("IN") && exist == true) {
			System.out.println("Redirecting you to sign in...");
		
		}
		else {
			System.out.println("Hm.. something appears to have gone wrong.. please reload the page");
			System.exit(0);
		}
		System.out.println("Ok, time for you to sign in!");
		signIn();
	
	}
	
	public static void signIn() {
		System.out.println("Username: ");
		Scanner usernameCheck = new Scanner(System.in);
		Scanner passwordCheck = new Scanner(System.in);
		String usernamePotential = usernameCheck.next();
		System.out.println("Password: ");
		String passwordPotential = passwordCheck.next();

		tunaObject.Verification(usernamePotential, passwordPotential);
	}

	

}
