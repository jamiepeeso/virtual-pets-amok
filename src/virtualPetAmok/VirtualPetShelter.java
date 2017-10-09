package virtualPetAmok;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, RobotCanine> robotCanineCollective = new HashMap<String, RobotCanine>();

	public void addNewRobotCanine(RobotCanine canine) {
		robotCanineCollective.put(canine.getName().toLowerCase(), canine);
	}

	Map<String, OrganicCanine> organicCanineCollective = new HashMap<String, OrganicCanine>();

	public void addNewOrganicCanine(OrganicCanine canine) {
		organicCanineCollective.put(canine.getName().toLowerCase(), canine);
	}

	Map<String, RobotFeline> robotFelineCollective = new HashMap<String, RobotFeline>();

	public void addNewRobotFeline(RobotFeline feline) {
		robotFelineCollective.put(feline.getName().toLowerCase(), feline);
	}

	Map<String, OrganicFeline> organicFelineCollective = new HashMap<String, OrganicFeline>();

	public void addNewOrganicFeline(OrganicFeline feline) {
		organicFelineCollective.put(feline.getName().toLowerCase(), feline);
	}

	public String robotCanineCollective() {
		String collectiveMenu = "Name" + "\t\t\t" + "Description" + "\t\t" + "Happiness" + "\t\t" + "Health" + "\t\t"
				+ "Maintenance";
		String menuDivider = "____________________________________________________________________________________________________";
		String menuLine = "";
		System.out.println("Here are our curent robot dogs and their need levels: " + "\n");
		for (RobotCanine entry : robotCanineCollective.values()) {
			menuLine = entry.eachRobotCaninesLevels();
			collectiveMenu = collectiveMenu + "\n" + menuDivider + "\n" + menuLine + "\n";
		}

		return collectiveMenu;
	}

	public String robotFelineCollective() {
		String collectiveMenu = "Name" + "\t\t\t" + "Description" + "\t\t" + "Happiness" + "\t\t" + "Health" + "\t\t"
				+ "Maintenance";
		String menuDivider = "____________________________________________________________________________________________________";
		String menuLine = "";
		System.out.println("Here are our curent robot cats and their need levels: " + "\n");
		for (RobotFeline entry : robotFelineCollective.values()) {
			menuLine = entry.eachRobotFelinesLevels();
			collectiveMenu = collectiveMenu + "\n" + menuDivider + "\n" + menuLine + "\n";
		}

		return collectiveMenu;
	}

	public String organicCanineCollective() {
		String collectiveMenu = "Name" + "\t\t" + "Description" + "\t\t" + "Hunger" + "\t\t" + "Thirst" + "\t\t"
				+ "Happiness" + "\t" + "Health" + "\t\t" + "Cage Waste Levels";
		String menuDivider = "_____________________________________________________________________________________________________________________________";
		String menuLine = "";
		System.out.println("Here are our curent organic dogs and their need levels: " + "\n");
		for (OrganicCanine entry : organicCanineCollective.values()) {
			menuLine = entry.eachOrganicCaninesLevels();
			collectiveMenu = collectiveMenu + "\n" + menuDivider + "\n" + menuLine + "\n";
		}

		return collectiveMenu;
	}

	public String organicFelineCollective() {
		String collectiveMenu = "Name" + "\t\t" + "Description" + "\t\t" + "Hunger" + "\t\t" + "Thirst" + "\t\t"
				+ "Happiness" + "\t" + "Health" + "\t\t" + "Litterbox Waste";
		String menuDivider = "_____________________________________________________________________________________________________________________________";
		String menuLine = "";
		System.out.println("Here are our curent organic cats and their need levels: " + "\n");
		for (OrganicFeline entry : organicFelineCollective.values()) {
			menuLine = entry.eachOrganicFelinesLevels();
			collectiveMenu = collectiveMenu + "\n" + menuDivider + "\n" + menuLine + "\n";
		}

		return collectiveMenu;
	}

	public void feedAllOrganics() {
		for (OrganicCanine current : organicCanineCollective.values())
			current.comandFeed();
		for (OrganicFeline current : organicFelineCollective.values())
			current.comandFeed();
		System.out.println("You have fed all of our organic creatures.");
	}

	public void waterAllOrganics() {
		for (OrganicCanine current : organicCanineCollective.values())
			current.comandWater();
		for (OrganicFeline current : organicFelineCollective.values())
			current.comandWater();
		System.out.println("You have given water to all of our organic creatures.");
	}

	public void walkAllCanines() {
		for (OrganicCanine current : organicCanineCollective.values())
			current.comandWalkCanines();
		for (RobotCanine current : robotCanineCollective.values())
			current.walkRobotCanines();
		System.out.println(
				"Thank you for walking all of our dogs! Both the robot and organic dogs enjoyed it very much.");
	}

	public void oilAllRobotPets() {
		for (RobotCanine current : robotCanineCollective.values())
			current.comandOil();
		for (RobotFeline current : robotFelineCollective.values())
			current.comandOil();
		System.out.println("All of our robotic creatures are moving with ease, thank you for oiling them!");
	}

	public void comandCleanCages() {
		for (OrganicCanine current : organicCanineCollective.values())
			current.comandCleanCages();
		System.out.println("Ah! I can breath again! Thank you for cleaning all of the dog cages.");
	}

	public void cleanLitterbox() {
		for (OrganicFeline current : organicFelineCollective.values())
			current.cleanLitterbox();
		System.out.println("Smells like roses near the litterbox. Thank you for cleaning that out for me!");
	}

	public void currentNeedLevels() {
		for (OrganicFeline current : organicFelineCollective.values())
			current.currentNeedLevels();
		for (OrganicCanine current : organicCanineCollective.values())
			current.currentNeedLevels();
		for (RobotFeline current : robotFelineCollective.values())
			current.currentNeedLevels();
		for (RobotCanine current : robotCanineCollective.values())
			current.currentNeedLevels();

	}

	public String getMenu() {
		return "Select a number to continue" + "\n" 
				+ " ________________________________" + "\n"
				+ "|                                |" + "\n" 
				+ "| 1. feed all organic pets       |" + "\n"
				+ "| 2. hydrate all organic pets    |" + "\n" 
				+ "| 3. walk all dogs               |" + "\n"
				+ "| 4. clean all dog cages         |" + "\n" 
				+ "| 5. clean the cat's litter box  |" + "\n"
				+ "| 6. oil robot pets              |" + "\n" 
				+ "| 7. quit                        |" + "\n"
				+ "|________________________________|";
	}

	public void tick() {
		for (OrganicFeline current : organicFelineCollective.values())
			current.tick();
		for (OrganicCanine current : organicCanineCollective.values())
			current.tick();
		for (RobotFeline current : robotFelineCollective.values())
			current.tick();
		for (RobotCanine current : robotCanineCollective.values())
			current.tick();
		System.out.println(
				"Welcome back; it is a new day here at Ms. Peeso's Shelter for Peculiar Pets. Let's check in on our current collective.");
	}
}
