package virtualPetAmok;

import java.util.Scanner;

public class VirtualPetAmokApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		VirtualPetShelter newShelter = new VirtualPetShelter();
		VirtualPet drogon = new VirtualPet("drogon", "dragon", 2, 6, 3, 4);
		VirtualPet mercy = new VirtualPet("mercy", "werecoyote", 2, 5, 2, 2);
		VirtualPet lorilia = new VirtualPet("lorilia", "hippogriff", 7, 3, 4, 3);
		VirtualPet bran = new VirtualPet("bran", "werewolf", 2, 4, 7, 1);
		newShelter.addPeculiarPet(drogon);
		newShelter.addPeculiarPet(mercy);
		newShelter.addPeculiarPet(lorilia);
		newShelter.addPeculiarPet(bran);
		System.out.println("Ms. Peeso's Shelter for Peculiar Pets");
		System.out.println("Our current collective of peculiar pet's vitals:");
		System.out.println();
		System.out.println("name\t\thunger\t\tthirst\t\tdirty cage\t\tboredom");
		System.out.println("______________________________________________________________________________________");
		for (VirtualPet currentPeculiarPet : newShelter.allPeculiarPets()) {
			System.out.println(currentPeculiarPet.name + "\t\t" + currentPeculiarPet.hungerLevel + "\t\t"
					+ currentPeculiarPet.thirstLevel + "\t\t" + currentPeculiarPet.wasteLevel + "\t\t"
					+ currentPeculiarPet.happinessLevel);
			System.out.println("______________________________________________________________________________________");
		}
		boolean goToShelter = true;
		while (goToShelter) {
			System.out.println();
			System.out.println("Select a number to continue");
			System.out.println(" ___________________________________");
			System.out.println("|                           		|");
			System.out.println("| 1. feed all organic pets      	|");
			System.out.println("| 2. hydrate all organic pets    	|");
			System.out.println("| 3. clean all canine cages        	|");
			System.out.println("| 4. clean feline litter box        |");
			System.out.println("| 5. oil robot pets        			|");
			System.out.println("| 6. play with a pet        		|");
			System.out.println("| 7. adopt a Pet            		|");
			System.out.println("| 8. drop off a Pet         		|");
			System.out.println("| 9. quit                   		|");
			System.out.println("|___________________________________|");
			String userResponse = input.next();
			switch (userResponse) {
			case "1":
				newShelter.feedAllPeculiarPets();
				System.out.println("You fed the collective.");
				System.out.println("Everyone enjoyed their meals.");
				break;
			case "2":
				newShelter.waterAllPeculiarPets();
				System.out.println("The collective is now hydrated.");
				break;
			case "3":
				newShelter.cleanAllPeculiarCaninesCages();
				System.out.println("All of the canine cages are now clean.");
				break;
			case "4":
				newShelter.cleanAllPeculiarFelineLitterBox();
				System.out.println("All of the cages are now clean.");
				break;
			case "5":
				newShelter.oilAllPeculiarRobotPets();
				System.out.println("All of the cages are now clean.");
				break;
			case "6":
				System.out.println("What peculiar pet would you like to play with?");
				System.out.println("Enter their name to continue.");
				for (VirtualPet currentPeculiarPet : newShelter.allPeculiarPets()) {
					System.out.println(currentPeculiarPet.name + ", the " + currentPeculiarPet.description);
				}
				String petToPlayWith = input.next();
				newShelter.getName(petToPlayWith.toLowerCase()).comandPlay();
				System.out.println("You played with " + petToPlayWith);
				break;
			case "7":
				System.out.println("Which pet do you want to adopt? Enter their name below.");
				for (VirtualPet currentPet : newShelter.allPeculiarPets()) {
					System.out.println(currentPet.name + ", " + currentPet.description);
				}
				String petNameToAdopt = input.next();
				newShelter.adoptPeculiarPet(petNameToAdopt);
				System.out.println("You adopted " + petNameToAdopt);
				System.out.println("");
				break;
			case "8":
				System.out.println("Oh look, you have found another homeless creature.");
				System.out.println("What is this creature's name?");
				String newPetName = input.next().toLowerCase();
				System.out.println("What kind of creature is this pet?");
				String newPetDescription = input.next();
				VirtualPet strayPet = new VirtualPet(newPetName, newPetDescription);
				newShelter.addPeculiarPet(strayPet);
				System.out
						.println("We will take great care of " + newPetName + " and find them a safe and happy home.");
				break;
			case "9":
				System.out.println(
						"Thank you for visiting Ms. Peeso's Shelter for Peculiar Pets, please come back again soon.");
				System.exit(0);
			}
			System.out.println("\nCurrent Status of Ms. Peeso's peculair pets");
			System.out.println("Name\t\tHunger\tThirst\tBoredom");
			System.out.println("_______________________________________");
			for (VirtualPet current : newShelter.allPeculiarPets()) {
				System.out.println(current.name + "\t\t" + current.hungerLevel + "\t" + current.thirstLevel + "\t"
						+ current.happinessLevel);
				System.out.println("____________________________________");
			}

			newShelter.tickAllPeculiarPets();
		}
		input.close();
	}
}
