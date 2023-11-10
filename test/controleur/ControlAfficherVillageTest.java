package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

public class ControlAfficherVillageTest {
	private Village village;

	//@Test
	//public ControlAfficherVillage(Village village) {
		//this.village = village;
	//}
	
	@Test
	public String[] donnerNomsVillageois() {
		return village.donnerVillageois();
	}
	@Test
	public String donnerNomVillage() {
		return village.getNom();
	}
	
	@Test
	public int donnerNbEtals() {
		return village.donnerNbEtal();
	}
}


