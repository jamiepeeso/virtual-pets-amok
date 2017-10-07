package virtualPetAmok;

public class OrganicCanine extends CaninePets implements OrganicPets {

	public OrganicCanine(String newName, String newDiscription, int newHungerLevel, int newThirstLevel,
			int newWasteLevel, int newHappinessLevel, int newMaintenanceLevel) {
		super(newName, newDiscription, newHungerLevel, newThirstLevel, newWasteLevel, newHappinessLevel,
				newMaintenanceLevel);
	}

	public void walkCanines() {
		super.walkCanines();
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

	public void comandCleanCages() {
		wasteLevel -= 50;
		happinessLevel += 25;
		healthLevel += 25;
	}
}
