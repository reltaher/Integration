import java.util.Scanner;

// This Project has been created by Ramzy El-Taher.
//To format with Google Style Java Guide, Ctrl+Shift+F
public class Main {

	/*
	 * This is a header. Public is an access modifier. void is the return type
	 * meaning this method does not return anything. method names should be in
	 * lowerCamelCase and be named with a verb. Within this header is the parameter,
	 * which in this case would be String[] args.
	 * static belongs to the class, not the object.
	 */
	public static void main(String[] args) {
	MainMenu menuscreen = new MainMenu(); // Creates an object from the MainMenu class.
	menuscreen.menu(); //Retrieves method from the MainMenu class.
	}
}