package virtualPetAmok;

public class RobotCanine extends CaninePets implements RobotPets {

	private int canineMaintainenceLevel;

	public RobotCanine(String name, String description, int canineMaintainenceLevel) {
		super(name, "robot canine");
		this.canineMaintainenceLevel = canineMaintainenceLevel;
	}

	@Override
	public void comandOil() {
		happinessLevel += 15;
		healthLevel += 25;
		canineMaintainenceLevel -= 50;
	}

	public String eachRobotCaninesLevels() {
		return name + "\t\t" + description + "\t\t" + happinessLevel + "\t\t" + healthLevel + "\t\t"
				+ canineMaintainenceLevel;
	}

	public void walkRobotCanines() {
		canineMaintainenceLevel -= 15;
		happinessLevel += 25;
		healthLevel += 15;
	}

	@Override
	public void currentNeedLevels() {
		if (healthLevel > 100) {
			healthLevel = 100;
		}
		if (healthLevel <= 0) {
			System.out.println(
					"You have killed one of our precious pets. You have proved unworthy of caring for the creatures in this shelter. Game Over!");
			System.exit(0);
		}
		if (canineMaintainenceLevel < 0) {
			canineMaintainenceLevel = 0;
		}
		if (canineMaintainenceLevel > 100) {
			canineMaintainenceLevel = 100;
			healthLevel -= 25;
		}
		if (canineMaintainenceLevel > 50) {
			healthLevel -= 15;
		}
	}

	public void tick() {

		canineMaintainenceLevel += 5;
	}
}