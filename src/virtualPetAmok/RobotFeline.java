package virtualPetAmok;

public class RobotFeline extends FelinePets implements RobotPets {

	public RobotFeline(String newName, String newDiscription, int newWasteLevel, int newHappinessLevel,
			int newHealthLevel, int newMaintenanceLevel) {
		super(newName, newDiscription, newWasteLevel, newHappinessLevel, newHealthLevel, newMaintenanceLevel);
	}

	@Override
	public void comandOil() {
		happinessLevel += 25;
		maintenanceLevel -= 50;
	}

}
