import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class LabNumber7 {

	public static void main(String[] args) { // main method
		Scanner sc = new Scanner(System.in); 

	}

	public static String getString(Scanner sc, String prompt) { 
		System.out.print("Please enter your name: "); //Prompt to enter name
		String s = sc.next();
		sc.nextLine();
		return s; }

	public static String getStringMatchingRegex(Scanner scan, String prompt, String regex) { 
		boolean isValid = false;
		String input;

		do {
			input = getString(scan, prompt);
			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Error -- Input must match the right format: ");
				isValid = false;
			}
		} while (!isValid);

		return input;

		if ("^[a-zA-Z\\s]+$ {1,30}$", input); // to see if input for name matches the pattern
		System.out.println(test);
	}

	public static int getInt(Scanner sc, String prompt) { // new method for dealing with phone number input
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			System.out.println("Error -- Number must be made up of integers");
			isValid = true;
		}
		return i;
	}

	public static void checkForInt(Scanner scan) { // new method for dealing with phone number input
		System.out.println("Please enter your phone number: ");
		if (scan.hasNextInt()) { // this is making sure the scanner has an int
			int userNum = scan.nextInt();
			System.out.println(userNum);

		} else {
			System.out.println("Error -- Input must match the right format: ");

		}

		return;

		boolean test = Pattern.matches("\\d{3}-\\d{3}-\\d{4}");
		System.out.println(test);

		if (sc.hasNextInt()) {
			i = sc.nextInt();
			isValid = true;
		} else {
			System.out.println("Error -- Input must match the right format: ");
		}


	}


	public static String getemailRegex(Scanner sc, String prompt, String regex) { // method for dealing with email input
		boolean isValid = false;
		String input;

		do {
			input = getString(sc, prompt);
			if (input.matches(regex)) {
				isValid = true;
			} else {
				System.out.println("Input must match the right format: ");
				isValid = false;
			}
		} while (!isValid);

		return input;

		while Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", name);

		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNext()) {
				isValid = true;
			} else {
				System.out.println("Error -- Invalid entry.");
			}
			sc.nextLine(); // discard any other data entered on the line*/
		}

	}
	public static boolean isValid(String text) {
		if (text == null || !text.matches("^\\d{2}\\/\\d{2}\\d{4}$")) {
			return false;

		}
	}
}


