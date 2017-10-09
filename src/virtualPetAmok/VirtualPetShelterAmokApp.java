package virtualPetAmok;

import java.util.Scanner;

public class VirtualPetShelterAmokApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		OrganicCanine mercy = new OrganicCanine("Mercy", "organic dog", 10, 15, 10, 15);

		OrganicFeline drogon = new OrganicFeline("Drogon", "organic cat", 20, 20, 10);

		RobotCanine bran = new RobotCanine("Bran2005", "robot dog", 25);

		RobotFeline lorilia = new RobotFeline("Lorilia4000", "robot feline", 20);

		VirtualPetShelter allPeculiarPetShelter = new VirtualPetShelter();

		allPeculiarPetShelter.addNewOrganicCanine(mercy);

		allPeculiarPetShelter.addNewOrganicFeline(drogon);

		allPeculiarPetShelter.addNewRobotCanine(bran);

		allPeculiarPetShelter.addNewRobotFeline(lorilia);

		System.out.println(
				"Welcome to Ms. Peeso's Shelter for Peculiar Pets. We have added robotic dogs and cats for you to play with.\n");
		System.out.println(
				"You are a brave one to volunteer here at my shelter. Beware, if you allow any creature's health to drop to 0, the creature will die and the game will be over. \n");
		do {
			allPeculiarPetShelter.currentNeedLevels();
			System.out.println(allPeculiarPetShelter.robotCanineCollective());
			System.out.println(allPeculiarPetShelter.robotFelineCollective());
			System.out.println(allPeculiarPetShelter.organicCanineCollective());
			System.out.println(allPeculiarPetShelter.organicFelineCollective());

			System.out.println(allPeculiarPetShelter.getMenu());
			String choice = input.next();
			switch (choice) {
			case "1":
				allPeculiarPetShelter.feedAllOrganics();
				break;
			case "2":
				allPeculiarPetShelter.waterAllOrganics();
				break;
			case "3":
				allPeculiarPetShelter.walkAllCanines();
				break;
			case "4":
				allPeculiarPetShelter.comandCleanCages();
				break;
			case "5":
				allPeculiarPetShelter.cleanLitterbox();
				break;
			case "6":
				allPeculiarPetShelter.oilAllRobotPets();
				break;
			case "7":
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice, please try again.");
			}
			allPeculiarPetShelter.currentNeedLevels();
			allPeculiarPetShelter.tick();
		} while (!allPeculiarPetShelter.organicCanineCollective.isEmpty());
	}
}
