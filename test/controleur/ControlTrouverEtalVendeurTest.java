package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import personnages.Chef;
import personnages.Gaulois;
import villagegaulois.Etal;
import villagegaulois.Village;

public class ControlTrouverEtalVendeurTest {
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
	
	
	//public Etal trouverEtalVendeurTest() {
		
	//	ControlTrouverEtalVendeur.trouverEtalVendeur("obelix");
		
	//}
	
}
