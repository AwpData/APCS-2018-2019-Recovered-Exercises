import java.util.*;
public class GameProject {

	static String name;
	public static void main(String[] args) {
		//Start Game
		System.out.println("Hello adventurer Enter your name");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		int x =1;
		//Check ID
		while(x == 1) {
			System.out.println("Is " + name + " correct?");
			String s = sc.nextLine();
			if(s.equalsIgnoreCase("Yes")) {
				x++;
			}
			if(s.equalsIgnoreCase("No")) {
				System.out.println("Please enter your desired name.");  //Prompt for name
				name = sc.nextLine();
			}
			}
			System.out.println("You are in a cave and you see a door with a large keyhole in the middle.");
			System.out.println("You walk down the hall and find a chest");
			x = 1;
			/*while(x== 1) {
			System.out.println("What do you want to do?");
			String s = sc.nextLine();
			if(s.equalsIgnoreCase("Open CHest") || s.equalsIgnoreCase("Open") || s.equalsIgnoreCase("Inspect")) {
				if(s.equalsIgnoreCase("Inspect")) {
					System.out.println("It's just an unlocked wooden box");
				}
				x++;
			}
			else {
				System.out.println("Invalid Command");
			}*/
			}
	//Instructions;
			System.out.println("You turn around and head towards the door and unlock it");
			System.out.println("Behind the door is a generic boss monster");
			
			}
	}
