package exercise1;

import java.util.Scanner;

public class Authentication {
	public static void main(String[] args) {
		String userNamen = "arman_vafa";
		String password = "Password";

		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter your username:");
		String yourUser = scanner.nextLine();
		System.out.println("Now please enter your Password");
		String yourpass = scanner.nextLine();
		if (new String(userNamen).equals(yourUser) && new String(password).equals(yourpass))
			System.out.println("Welcome " + userNamen);
		else
			System.out.println("Invalid Username or Password");
	}

}
