package virtualPetAmok;

public class OrganicCanine extends CaninePets implements OrganicPets {

	private int cageWasteLevel;
	private int wasteLevel;
	private int thirstLevel;
	private int hungerLevel;

	public OrganicCanine(String name, String description, int wasteLevel, int thirstLevel, int hungerLevel,
			int cageWasteLevel) {
		super(name, "organic dog");
		this.wasteLevel = wasteLevel;
		this.cageWasteLevel = cageWasteLevel;
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
	}

	public int getCageWasteLevel() {
		return cageWasteLevel;
	}

	public int getWasteLevel() {
		return wasteLevel;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public String eachOrganicCaninesLevels() {
		return name + "\t\t" + description + "\t\t" + hungerLevel + "\t\t" + thirstLevel + "\t\t" + happinessLevel
				+ "\t\t" + healthLevel + "\t\t" + cageWasteLevel;
	}

	@Override
	public void comandFeed() {
		hungerLevel -= 50;
		thirstLevel += 10;
		wasteLevel += 15;
		happinessLevel += 10;
		healthLevel += 10;
	}

	@Override
	public void comandWater() {
		hungerLevel -= 5;
		thirstLevel -= 50;
		wasteLevel += 5;
		happinessLevel += 10;
		healthLevel += 10;
	}

	public void comandWalkCanines() {
		wasteLevel -= 50;
		happinessLevel += 15;
		healthLevel += 15;
	}

	public void comandCleanCages() {
		cageWasteLevel -= 50;
		happinessLevel += 15;
		healthLevel += 15;
	}

	@Override
	public void currentNeedLevels() {
		if (hungerLevel < 0) {
			hungerLevel = 0;
		}
		if (hungerLevel > 100) {
			hungerLevel = 100;
			healthLevel -= 15;
		}
		if (hungerLevel > 50) {
			healthLevel -= 5;
		}
		if (thirstLevel < 0) {
			thirstLevel = 0;
		}
		if (thirstLevel > 100) {
			thirstLevel = 100;
			healthLevel -= 15;
		}
		if (thirstLevel > 50) {
			healthLevel -= 5;
		}
		if (healthLevel > 100) {
			healthLevel = 100;
		}
		if (healthLevel <= 0) {
			System.out.println(
					"You have killed one of our precious pets. You have proved unworthy of caring for the creatures in this shelter. Game Over!");
			System.exit(0);
		}
		if (cageWasteLevel < 0) {
			cageWasteLevel = 0;
		}
		if (cageWasteLevel > 100) {
			cageWasteLevel = 100;
			healthLevel -= 25;
		}
		if (cageWasteLevel > 50) {
			healthLevel -= 15;
		}
		if (wasteLevel < 0) {
			wasteLevel = 0;
		}
		if (wasteLevel > 100) {
			wasteLevel -= 50;
			cageWasteLevel += 25;
		}
		if (wasteLevel > 50) {
			cageWasteLevel += 25;
			healthLevel -= 5;
		}
	}

	public void tick() {
		hungerLevel += 5;
		thirstLevel += 5;
		wasteLevel += 5;
		cageWasteLevel += 5;
	}
}