import java.util.Scanner;

public class tuna {
	static apples applesObject = new apples();

	private static String password;
	private static String username;
	
	public static boolean accountCreation(boolean exist){
		System.out.println("What is your username?");
		Scanner usernameScan = new Scanner(System.in);
		String username = usernameScan.next();
		System.out.println("What is your password?");
		Scanner passwordScan = new Scanner(System.in);
		String password = passwordScan.next();
		return exist = true;
	}

	public static void Verification(String usernamePotential, String passwordPotential) {
	if(passwordPotential.equals(password) && usernamePotential.equals(username)) {
		System.out.println("Welcome "+ username);
		
	}
	else {
		System.out.println("That username or password is incorrect, please try again");
		//there is a method the IDE made for me so i can call signIn(); but idk what it is xd
		applesObject.signIn();
	}
	

	
}

}
