package virtualPetAmok;

public class RobotFeline extends FelinePets implements RobotPets {

	private int felineMaintainenceLevel;

	public RobotFeline(String name, String description, int felineMaintainenceLevel) {
		super(name, "robot feline");
		this.felineMaintainenceLevel = felineMaintainenceLevel;
	}

	@Override
	public void comandOil() {
		happinessLevel += 15;
		healthLevel += 25;
		felineMaintainenceLevel -= 50;
	}

	public String eachRobotFelinesLevels() {
		return name + "\t\t" + description + "\t\t" + happinessLevel + "\t\t" + healthLevel + "\t\t"
				+ felineMaintainenceLevel;
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
		if (felineMaintainenceLevel < 0) {
			felineMaintainenceLevel = 0;
		}
		if (felineMaintainenceLevel > 100) {
			felineMaintainenceLevel = 100;
			healthLevel -= 25;
		}
		if (felineMaintainenceLevel > 50) {
			healthLevel -= 15;
		}
	}

	public void tick() {

		felineMaintainenceLevel += 5;
	}
}
