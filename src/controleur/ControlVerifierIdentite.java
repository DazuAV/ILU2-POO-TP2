package controleur;

import villagegaulois.Village;
import personnages.Gaulois;

public class ControlVerifierIdentite {
    private Village village;

    public ControlVerifierIdentite(Village village) {
        this.village = village;
    }

    public boolean verifierIdentite(String nomVendeur) {
        // Vérification pour le chef
        if (village.getNom().equals(nomVendeur)) {
            return true; // Le nom correspond au chef du village
        }

        Gaulois[] villageois = village.getVillageois();

        // Vérification pour les villages
        for (Gaulois gaulois : villageois) {
            if (gaulois != null && nomVendeur.equals(gaulois.getNom())) {
                return true; // Le nom correspond à un villageois
            }
        }

        // Si le nom ne correspond ni au chef ni à un villageois
        return false;
    }
    public Gaulois trouverHabitant(String nomGaulois) {
        return village.trouverHabitant(nomGaulois);
    }
}
