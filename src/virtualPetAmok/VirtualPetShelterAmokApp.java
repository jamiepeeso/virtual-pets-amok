package virtualPetAmok;

import java.util.Scanner;

public class VirtualPetShelterAmokApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter petShelter = new VirtualPetShelter();

		VirtualPet mercy = new OrganicCanine("Mercy", "organic werewolf", 10, 5, 8, 7, 6);
		petShelter.addPet(mercy);
		VirtualPet bran = new RobotCanine("Bran", "robot werewolf", 10, 8, 7);
		petShelter.addPet(bran);
		VirtualPet drogon = new OrganicFeline("Drogon", "organic fire breathing cat", 10, 10, 3, 8);
		petShelter.addPet(drogon);
		VirtualPet lorilia = new RobotFeline("lorilia", "robot cat-bird hybrid", 10, 4, 9);
		petShelter.addPet(lorilia);

		System.out.println(displayWelcomeMessage());

		do {

			// Display pet statuses
			System.out.println("All organic dogs currently at our shelter and their needs:\n");
			System.out.println("Name \t|Health |Happiness |Hunger |Thirst |Cleanliness");
			for (VirtualPet availablePets : petShelter.availablePets()) {
				if (availablePets instanceof OrganicCanine) {
					System.out.println(availablePets.getName() + "\t|" + availablePets.getHealthLevel() + "\t|"
							+ availablePets.getHappinessLevel() + "\t   |"
							+ ((OrganicCanine) availablePets).getHungerLevel() + "\t   |"
							+ ((OrganicCanine) availablePets).getThirstLevel() + "\t   |"
							+ ((OrganicCanine) availablePets).getWasteLevel());
				}
			}

			System.out.println("\nAll organic cats currently at our shelter and their needs:\n");
			System.out.println("Name \t|Health |Happiness |Hunger |Thirst |Shelter Litter Box");
			for (VirtualPet availablePets : petShelter.availablePets()) {
				if (availablePets instanceof OrganicFeline) {
					System.out.println(availablePets.getName() + "\t|" + availablePets.getHealthLevel() + "\t|"
							+ availablePets.getHappinessLevel() + "\t   |"
							+ ((OrganicFeline) availablePets).getHungerLevel() + "\t   |"
							+ ((OrganicFeline) availablePets).getThirstLevel() + "\t   |"
							+ petShelter.getLitterBoxWasteLevel());
				}
			}

			System.out.println("\nAll robotic dogs currently at our shelter and their needs:\n");
			System.out.println("Name \t|Health |Happiness |Maintenance");
			for (VirtualPet availablePets : petShelter.availablePets()) {
				if (availablePets instanceof RobotCanine) {
					System.out.println(availablePets.getName() + "\t|" + availablePets.getHealthLevel() + "\t|"
							+ availablePets.getHappinessLevel() + "\t   |"
							+ ((RobotCanine) availablePets).getMaintenanceLevel());
				}
			}

			System.out.println("\nAll robotic cats currently at our shelter and their needs:\n");
			System.out.println("Name \t|Health |Happiness |Maintenance");
			for (VirtualPet availablePets : petShelter.availablePets()) {
				if (availablePets instanceof RobotFeline) {
					System.out.println(availablePets.getName() + "\t|" + availablePets.getHealthLevel() + "\t|"
							+ availablePets.getHappinessLevel() + "\t   |"
							+ ((RobotFeline) availablePets).getMaintenanceLevel());
				}
			}

			System.out.println(displayMenu());

			String menuEntry = input.next();

			switch (menuEntry) {

			case "1":
				petShelter.feedAllOrganics();
				petShelter.shelterTick();
				System.out.println("All organic pets have full tummies thanks to you, delicious.\n");
				break;

			case "2":
				petShelter.waterAllOrganics();
				petShelter.shelterTick();
				System.out.println("Water has been given to all of our organic pets, hydration is key.\n");
				break;

			case "3":
				System.out.println("Enter the pet's name you would like to play with:\n");
				for (VirtualPet availablePets : petShelter.availablePets()) {
					System.out.println(availablePets.getName() + "\t|" + availablePets.getDescription());
				}
				String petName = input.next();
				petShelter.getPet(petName).commandPlay();
				petShelter.shelterTick();
				System.out.println("\n" + petName + " had a great time... I am sure you will heal quickly!\n");
				break;

			case "4":
				petShelter.walkTheCanines();
				petShelter.shelterTick();
				System.out.println("The dogs loved their walk thru the woods!\n");
				break;

			case "5":
				petShelter.cleanTheCanineCages();
				petShelter.shelterTick();
				System.out.println("Ah! The dog cages smell like roses!");
				break;

			case "6":
				petShelter.cleanTheLitterBox();
				petShelter.shelterTick();
				System.out.println("I can breath again! Thank you for cleaning the litterbox.\n");
				break;

			case "7":
				petShelter.maintainTheRobots();
				petShelter.shelterTick();
				System.out.println("The robotic pets thank you for the oil.\n");
				break;

			case "8":
				petShelter.addPet(newStrayOrganicCanine(input));
				petShelter.shelterTick();
				break;

			case "9":
				petShelter.addPet(newStrayOrganicFeline(input));
				petShelter.shelterTick();
				break;

			case "10":
				petShelter.addPet(newStrayRobotCanine(input));
				petShelter.shelterTick();
				break;

			case "11":
				petShelter.addPet(newStrayRobotFeline(input));
				petShelter.shelterTick();
				break;

			case "12":
				System.out.println("Enter the pet's name you would like to adopt: ");
				petName = input.next();
				petShelter.currentShelterCollective.remove(petName);
				petShelter.shelterTick();
				break;

			case "13":
				System.out.println(
						"Thank you for visiting Ms. Peeso's Shelter for Peculiar Pets, please come back again soon.");
				System.exit(0);
				break;

			default:
				System.out.println("Please select a valid menu option.\n");
			}

		} while (petShelter.arePetsAvailable() == false);

		System.out.println("Game over.  All homeless virtual pets have found homes. :)");

		input.close();
	}

	private static String displayWelcomeMessage() {
		return "Welcome to Ms. Peeso's Shelter for Peculiar Pets";
	}

	private static String displayMenu() {
		return "Select a number to continue" + "\n" + " _________________________________" + "\n"
				+ "|                                 |" + "\n" + "| 1.  feed all organic pets       |" + "\n"
				+ "| 2.  hydrate all organic pets    |" + "\n" + "| 3.  play with a pet             |" + "\n"
				+ "| 4.  walk all dogs               |" + "\n" + "| 5.  clean the dog's cages       |" + "\n"
				+ "| 6.  clean the litterbox         |" + "\n" + "| 7.  oil all robots              |" + "\n"
				+ "| 8.  you found an organic dog    |" + "\n" + "| 9.  you found an organic cat    |" + "\n"
				+ "| 10. you found a robot dog       |" + "\n" + "| 11. you found a robot cat       |" + "\n"
				+ "| 12. adopt a pet                 |" + "\n" + "| 13. quit                        |" + "\n"
				+ "|_________________________________|";
	}

	private static VirtualPet newStrayOrganicCanine(Scanner input) {
		System.out.println("Enter the name of the dog:");
		String name = input.next();
		System.out.println("Enter a short description of the dog:");
		String description = input.next();
		return new OrganicCanine(name, description, 10, 10, 10, 10, 10);
	}

	private static VirtualPet newStrayOrganicFeline(Scanner input) {
		System.out.println("Enter the name of the cat:");
		String name = input.next();
		System.out.println("Enter a short description of the cat:");
		String description = input.next();
		return new OrganicFeline(name, description, 10, 10, 10, 10);
	}

	private static VirtualPet newStrayRobotCanine(Scanner input) {
		System.out.println("Enter the name of the dog:");
		String name = input.next();
		System.out.println("Enter a short description of the dog:");
		String description = input.next();
		return new RobotCanine(name, description, 10, 10, 10);
	}

	private static VirtualPet newStrayRobotFeline(Scanner input) {
		System.out.println("Enter the name of the cat:");
		String name = input.next();
		System.out.println("Enter a short description of the cat:");
		String description = input.next();
		return new RobotFeline(name, description, 10, 10, 10);
	}

}