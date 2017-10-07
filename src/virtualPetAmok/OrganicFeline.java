package virtualPetAmok;

public class OrganicFeline extends FelinePets implements OrganicPets {

	public OrganicFeline(String newName, String newDiscription, int newHungerLevel, int newThirstLevel,
			int newWasteLevel, int newHappinessLevel) {
		super(newName, newDiscription, newHungerLevel, newThirstLevel, newWasteLevel, newHappinessLevel);
	}

	public void comandFeed() {
		hungerLevel -= 50;
		thirstLevel += 10;
		wasteLevel += 15;
		happinessLevel += 10;
		healthLevel += 10;
	}

	public void comandWater() {
		hungerLevel -= 5;
		thirstLevel -= 50;
		wasteLevel += 5;
		happinessLevel += 10;
		healthLevel += 10;
	}

	public void comandCleanLitterBox() {
		wasteLevel -= 50;
		happinessLevel += 25;
		healthLevel += 25;
	}

}
