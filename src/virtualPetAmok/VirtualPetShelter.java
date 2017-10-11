package virtualPetAmok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private int shelterLitterBoxWasteLevel = 10;

	Map<String, VirtualPet> currentShelterCollective = new HashMap<>();

	public Collection<VirtualPet> availablePets() {
		return currentShelterCollective.values();
	}

	public VirtualPet getPet(String petName) {
		return currentShelterCollective.get(petName);
	}

	public boolean arePetsAvailable() {
		return currentShelterCollective.isEmpty();
	}

	public void addPet(VirtualPet virtualPet) {
		String adoptablePetSearch = virtualPet.getName();
		currentShelterCollective.put(adoptablePetSearch, virtualPet);
	}

	public void shelterTick() {
		for (VirtualPet availablePets : availablePets()) {
			availablePets.tick();
		}
		shelterLitterBoxWasteLevel++;
	}

	public void feedAllOrganics() {
		for (VirtualPet availablePets : availablePets()) {
			if (availablePets instanceof Organic) {
				Organic organicPet = (Organic) availablePets;
				organicPet.commandFeed();
			}
		}

	}

	public void waterAllOrganics() {
		for (VirtualPet availablePets : availablePets()) {
			if (availablePets instanceof Organic) {
				Organic organicPet = (Organic) availablePets;
				organicPet.commandWater();
			}
		}
	}

	public void maintainTheRobots() {
		for (VirtualPet availablePets : availablePets()) {
			if (availablePets instanceof Robot) {
				Robot roboticPet = (Robot) availablePets;
				roboticPet.commandOil();
			}
		}
	}

	public void cleanTheCanineCages() {
		for (VirtualPet availablePets : availablePets()) {
			if (availablePets instanceof OrganicCanine) {
				OrganicCanine organicDog = (OrganicCanine) availablePets;
				organicDog.cleanCanineCages();
			}
		}

	}

	public void walkTheCanines() {
		for (VirtualPet availablePets : availablePets()) {
			if (availablePets instanceof CaninePet) {
				CaninePet canine = (CaninePet) availablePets;
				canine.walkAllCanines();
			}
		}

	}

	public void cleanTheLitterBox() {
		shelterLitterBoxWasteLevel += 7;
	}

	public int getLitterBoxWasteLevel() {
		return shelterLitterBoxWasteLevel;
	}
}