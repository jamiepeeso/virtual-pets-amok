package virtualPetAmok;

public class OrganicFeline extends FelinePets implements OrganicPets {

	private int litterWasteLevel;
	private int thirstLevel;
	private int hungerLevel;

	public OrganicFeline(String name, String description, int thirstLevel, int hungerLevel, int litterWasteLevel) {
		super(name, "organic feline");
		this.thirstLevel = thirstLevel;
		this.hungerLevel = hungerLevel;
		this.litterWasteLevel = 0;
	}

	public int getThirstLevel() {
		return thirstLevel;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getLitterWasteLevel() {
		return litterWasteLevel;
	}

	public String eachOrganicFelinesLevels() {
		return name + "\t\t" + description + "\t\t" + hungerLevel + "\t\t" + thirstLevel + "\t\t" + happinessLevel
				+ "\t\t" + healthLevel + "\t\t" + litterWasteLevel;
	}

	@Override
	public void comandFeed() {
		hungerLevel -= 25;
		litterWasteLevel += 5;
		happinessLevel += 10;
		healthLevel += 15;
	}

	@Override
	public void comandWater() {
		thirstLevel -= 25;
		litterWasteLevel += 5;
		healthLevel += 10;
	}

	public void cleanLitterbox() {
		litterWasteLevel -= 50;
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
		if (litterWasteLevel < 0) {
			litterWasteLevel = 0;
		}
		if (litterWasteLevel > 100) {
			litterWasteLevel = 100;
			healthLevel -= 25;
		}
		if (litterWasteLevel > 50) {
			healthLevel -= 15;
		}
	}

	public void tick() {
		hungerLevel += 5;
		thirstLevel += 5;
		litterWasteLevel += 5;
	}
}
