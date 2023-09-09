//Name: Michael Pollock
//Time: Total: 200 minutes
//References: https://stackoverflow.com/questions/8878015/return-true-or-false-randomly

public class Sandwich {
public static void main(String [] args) {

	//Print the Hamburger Palace sign, made slightly adaptable
	int signH = 5;
	ConsoleIO.printLine("******************************");
	int line = 0;
	while (line < signH) {
		ConsoleIO.printLine("*                            *");
		line++;
	}
	ConsoleIO.printLine("* Dr. Kow's Hamburger Palace *");
	line = 0;
	while (line < signH) {
		ConsoleIO.printLine("*                            *");
		line++;
	}
	ConsoleIO.printLine("******************************");

	//Inventory
	ConsoleIO.print("Please enter the amount of slices of lettuce you assume I have in stock. ");
	int totalLettuce = ConsoleIO.readInt();

	//Get or assign name to customer
	ConsoleIO.print("That's correct. Welcome to Dr. Kow's Hamburger Palace where you can get up to "+totalLettuce+" slices of lettuce on a single burger. Can I get a name for the order? ");
	String name = ConsoleIO.readLine();
	if (name.equals("no")) {
		name = "Dr. Grumps";
	} else if (name.equals("yes")) {
		ConsoleIO.printLine("And what should I call you? ");
		name = ConsoleIO.readLine();
	}
	//Get amout of lettuce desired, make sure we don't run out of lettuce too early in the day again
	ConsoleIO.print("Thanks. How many layers of lettuce do you want " +name+ "? Please don't be too greedy. ");
	int lettuce = ConsoleIO.readInt();
	if (lettuce > totalLettuce) {
		ConsoleIO.printLine("I am sorry "+name+" but that is too much lettuce, and for being greedy, you get none. ");
		lettuce = 0;
	}
	int newLettuce = totalLettuce-lettuce;
	if (newLettuce > 0 && newLettuce < 5){
	ConsoleIO.printLine("That order leaves us with "+newLettuce+" pieces of lettuce. I ought to order more.");
	}

	//Sandwich quality assignment
	ConsoleIO.print("Would you like your sandwich to be 'pristine', 'quick', or is 'either' fine? ");
	String quality = ConsoleIO.readLine();
	while (!quality.equals("pristine") && !quality.equals("quick") && !quality.equals("either")) {
		ConsoleIO.print("Please choose either 'pristine', 'quick', or 'either'. ");
		quality = ConsoleIO.readLine();
	}
	while (quality.equals("either")) {
		if ((Math.random() > .5)) {
			quality = "pristine";
			ConsoleIO.printLine("*The person asking you questions flips a coin. It was very cool and you are impressed*");
			ConsoleIO.printLine("Ok. I flipped a coin and decided to make you something fresh and nice. ");
		} else {
			quality = "quick";
			ConsoleIO.printLine("*The person asking you questions flips a coin. It was very cool and you are impressed*");
			ConsoleIO.printLine("Bad news. Coin toss results are in and you got 'quick'. Our cook left a couple burg's out last night. One of those will be close enough to your order and we can get rid of it. ");
		}
	}
	//Sandwich customization input
	ConsoleIO.print("May I inquire about additional toppings you may seek? (y/n) ");
	String cust = ConsoleIO.readLine();
	while (!cust.equals("y") && !cust.equals("n")) {
		ConsoleIO.print("I'm sorry please choose 'y' or 'n' ");
		cust = ConsoleIO.readLine();
	}
	if (cust.equals("y")) {
		ConsoleIO.print("Would you like Spicy Saucy? (y/n) ");
		String ss = ConsoleIO.readLine();
		ConsoleIO.print("Would you like Hashbrowns? (y/n) ");
		String hb = ConsoleIO.readLine();
		ConsoleIO.print("Would you like Cherry Tomatoes? (y/n) ");
		String ct = ConsoleIO.readLine();
		ConsoleIO.print("*A stranger suggests you get fries. He says they are to die for.* Do you order them? (y/n) ");
		String fries = ConsoleIO.readLine();
		//Stranger danger
		if (fries.equals("y")) {
			ConsoleIO.printLine("You have died and the stranger stole your fries. ");
		}
		else {
			//Assemble sandwich of pristine quality
			ConsoleIO.printLine("");
			if (quality.equals("pristine")) {
				ConsoleIO.printLine("OoOoOrDER UP for "+name+"!! ");
				if (ss.equals("y")) {
					ConsoleIO.printLine("There is sauce on the sandwich, I would show you but I hope you just believe me. ");
				}
				ConsoleIO.printLine("");
				ConsoleIO.printLine("  (___)  ");
				if (hb.equals("y")) {
					ConsoleIO.printLine("   ###  ");
				}
				if (ct.equals("y")) {
					ConsoleIO.printLine("   o0O  ");
				}
				line = 0;
				while (line < lettuce) {
					while (totalLettuce - lettuce < 0) {
						lettuce--;
					}
					ConsoleIO.printLine("   ~~~  ");
					line++;
				}
				ConsoleIO.printLine("  (___)  ");
				ConsoleIO.printLine("|______/|/|/|");
				ConsoleIO.printLine("You may be wondering what those lines are to the right of your burger. All orders come with a side of fries which is not announced. ");
				ConsoleIO.printLine("We have had a lot of trouble in the past with some wild folks getting too hyped up for fries from other customers. We suspect they are seagulls in disguise. ");
			} else {
				//Assemble sandwich of quick quality, may be missing ingredients
				ConsoleIO.printLine("OoOoOrDER UP for "+name+"!! ");
				if (ss.equals("y")) {
					ConsoleIO.printLine("We made it in a rush so we might have forgotten the sauce but then again we might not have. ");
				}
				ConsoleIO.printLine("");
				ConsoleIO.printLine("   (__)  ");
				if (hb.equals("y")) {
					if (Math.random()<.8) {
						ConsoleIO.printLine("  ##~#  ");
					}
				}
				if (ct.equals("y")) {
					if (Math.random()<.8) {
						ConsoleIO.printLine("  oO  0");
					}
				}
				line = 0;
				while (line < lettuce) {
					while (totalLettuce - lettuce < 0) {
						lettuce--;
					}
					ConsoleIO.printLine("  ~~  ");
					line++;
				}
				ConsoleIO.printLine("  (____)  ");
				ConsoleIO.printLine("|o______~/|/|/|");
				ConsoleIO.printLine("You may be wondering what those lines are to the right of your burger. All orders come with a side of fries which is not announced. ");
				ConsoleIO.printLine("We have had a lot of trouble in the past with some wild folks getting too hyped up for fries from other customers. We suspect they are seagulls in disguise. ");

			}
		}


	} else {
		//non-custom pristine order
		if (quality.equals("pristine")) {
				ConsoleIO.printLine("Order UUUUUP for "+name+"! ");
				ConsoleIO.printLine("  (__)  ");
				line = 0;
				while (line < lettuce) {
					while (totalLettuce - lettuce < 0) {
						lettuce--;
					}
					ConsoleIO.printLine("  ~~  ");
					line++;
				}
				ConsoleIO.printLine("  (__)  ");
				ConsoleIO.printLine("|_______|");
			} else {
				//non-custom quick order.
				lettuce = lettuce + (int)(Math.random()*4);
				ConsoleIO.printLine("Order UUUUUP for "+name+"! ");
				ConsoleIO.printLine("   (__)  ");
				line = 0;
				while (line < lettuce) {
					while (totalLettuce - lettuce < 0) {
						lettuce--;
					}
					ConsoleIO.printLine("  ~~  ");
					line++;
				}
				ConsoleIO.printLine("  (__)  ");
				ConsoleIO.printLine("|_______|");
			}
		}
	}
}