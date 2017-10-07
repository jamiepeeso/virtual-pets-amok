package virtualPetAmok;

abstract class VirtualPet {
	String name;
	String description;

	int hungerLevel;
	int thirstLevel;
	int wasteLevel;
	int happinessLevel;
	int healthLevel;
	int maintenanceLevel;

	public VirtualPet(String newName, String newDiscription, int newWasteLevel, int newHappinessLevel,
			int newHealthLevel, int newMaintenanceLevel) {
		name = newName;
		description = newDiscription;
		happinessLevel = newHappinessLevel;
		healthLevel = newHealthLevel;
		maintenanceLevel = newMaintenanceLevel;
	}

	public VirtualPet(String newName, String newDiscription, int newHungerLevel, int newThirstLevel, int newWasteLevel,
			int newHappinessLevel, int newMaintenanceLevel) {
		this.name = newName;
		this.description = newDiscription;
		this.hungerLevel = 5;
		this.thirstLevel = 10;
		this.wasteLevel = 25;
		this.happinessLevel = 5;
		this.healthLevel = 5;
		this.maintenanceLevel = 5;
	}

	void tick() {
		hungerLevel += 5;
		thirstLevel += 5;
		wasteLevel += 5;
		happinessLevel -= 5;
		healthLevel -= 5;
		maintenanceLevel += 5;
	}

	void comandPlay() {
		hungerLevel += 15;
		thirstLevel += 20;
		wasteLevel += 10;
		happinessLevel -= 25;
		healthLevel += 10;
		maintenanceLevel += 10;
	}

}