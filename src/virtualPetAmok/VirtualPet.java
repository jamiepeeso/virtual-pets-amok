package virtualPetAmok;

abstract class VirtualPet {

	protected String name;
	protected String description;

	protected int healthLevel;
	protected int happinessLevel;

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
		this.healthLevel = 100;
		this.happinessLevel = 50;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return healthLevel;
	}

	@Override
	public String toString() {
		return name + ":" + " description: " + description + ", Health: " + healthLevel + ", Happiness: "
				+ happinessLevel + ", exsists = ";
	}

}
