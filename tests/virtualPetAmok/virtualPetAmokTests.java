package virtualPetAmok;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import cooking.Microwave;
import virtualPetAmok.OrganicCanine;

public class virtualPetAmokTests {

	@Test
	public void shouldBeAbleToCreateAnOrganicCanine() {
		
		OrganicCanine underTest = new OrganicCanine(null, null, 0, 0, 0, 0);
		
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldBeAbleToCreateARobotCanine() {
		
		RobotCanine underTest = new RobotCanine(null, null, 0, 0, 0, 0);
		
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldBeAbleToCreateAnOrganicFeline() {
		
		OrganicFeline underTest = new OrganicFeline(null, null, 0, 0, 0, 0);
		
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldBeAbleToCreateARobotFeline() {
		
		RobotFeline underTest = new RobotFeline(null, null, 0, 0, 0, 0);
		
		assertNotNull(underTest);
	}
	
	@Test
	public void shouldBeAbleToWalkDog() {
		
		CaninePets underTest = new CaninePets(null, null, 0, 0, 0, 0, 0);

		String response = underTest.walkCanines();
		
		assertEquals("Cooking by spinning polar molecules!", response);
	}
}
