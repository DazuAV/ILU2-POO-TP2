package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlEmmenagerTest {
	private Village village;
	private Chef abraracourcix;
	
	
	@BeforeEach
	public void initialiserSituation() {
		System.out.println("Initialisation");
		village =new Village ("le village des gaulois",10,5);
		abraracourcix= new Chef("abraracourcix",10,village);
		village.setChef(abraracourcix);
		
		
	}
	
	
	@Test
	void testControlEmmenager() {
		
		ControlEmmenager controlEmmenager = new ControlEmmenager(village);
		assertNotNull(controlEmmenager,"Constructeur ne renvoie pas null");
		
	}
	@Test
	void testisHabitant() {
		ControlEmmenager controlEmmenager=new ControlEmmenager(village);
		
	}
	@Test
	void testajouterDuide() {
		
	}
	@Test
	void testajouterGaulois() {
		
	}
	
	
	
}
