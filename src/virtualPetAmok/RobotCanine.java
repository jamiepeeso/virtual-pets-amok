package virtualPetAmok;

public class RobotCanine extends CaninePets implements RobotPets {

	public RobotCanine(String newName, String newDiscription, int newHungerLevel, int newThirstLevel, int newWasteLevel,
			int newHappinessLevel, int newMaintenanceLevel) {
		super(newName, newDiscription, newHungerLevel, newThirstLevel, newWasteLevel, newHappinessLevel,
				newMaintenanceLevel);
	}

	public void walkCanines() {
		super.walkCanines();
	}

	@Override
	public void comandOil() {
		happinessLevel += 25;
		maintenanceLevel -= 50;
	}

}
