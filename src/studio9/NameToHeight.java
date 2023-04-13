package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Map<String,​ String> height = new HashMap<>();
		Map<String, String> h = new HashMap<>();
		
		String character = "y";
		String name = "";
		String height_1 = "";
		while (character.equals("y")){
			System.out.println("Enter your name: ");
			name = in.next();
			System.out.println("Enter your height in feet: ");
			height_1 = in.next();
			
			h.put(name, height_1);
			
			System.out.println("Press y to continue: ");
			character = in.next();
		}
		System.out.println(h);

	}
}
