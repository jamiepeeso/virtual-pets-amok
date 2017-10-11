package virtualPetAmok;

public abstract class CaninePet extends VirtualPet {

	public CaninePet(String name, String description, int healthLevel, int happinessLevel) {
		super(name, description, healthLevel, happinessLevel);
	}

	public void walkAllCanines() {
		setHappinessLevel(getHappinessLevel() + 25);
	}

}