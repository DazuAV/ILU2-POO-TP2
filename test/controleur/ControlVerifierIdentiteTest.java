package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Village;




public class ControlVerifierIdentiteTest {
	private Village village;
	private Chef abraracourcix;
	private Gaulois obelix;
	
	
	
	
	@Test	
	public void initialiserSituation() {
		System.out.println("Initialisation");
		village =new Village ("le village des gaulois",10,5);
		abraracourcix= new Chef("abraracourcix",10,village);
		village.setChef(abraracourcix);
		obelix = new Gaulois ("Obelix",10);
		
		
	}
	
	
	
	
	//@Test
	//public void verifierIdentiteTest() {
	//ControlVerifierIdentite.verifierIdentite("Obelix");
    //assertTrue(ControlVerifierIdentite.verifierIdentite(true));
    //assertFalse(ControlVerifierIdentite.verifierIdentite(false));}
	
	@Test
	public void trouverHabitantTest() {
		village.trouverHabitant("obelix");
		//assertTrue(ControlVerifierIdentite.trouverHabitant("obelix"));
		
		
		
}
}
