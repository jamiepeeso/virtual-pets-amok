package virtualPetAmok;

public class CaninePets extends VirtualPet {

	public CaninePets(String newName, String newDiscription, int newHungerLevel, int newThirstLevel, int newWasteLevel,
			int newHappinessLevel, int newMaintenanceLevel) {
		super(newName, newDiscription, newHungerLevel, newThirstLevel, newWasteLevel, newHappinessLevel,
				newMaintenanceLevel);
	}

	void comandCleanCanineCages() {
		wasteLevel -= 35;
		happinessLevel += 5;
		healthLevel += 25;
	}

	void walkCanines() {
		wasteLevel -= 20;
		happinessLevel += 10;
		healthLevel += 15;
		maintenanceLevel += 10;
	}

}
