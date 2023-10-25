package frontiere;

import java.util.Scanner;
import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
    private ControlPrendreEtal controlPrendreEtal;
    private Scanner scan = new Scanner(System.in);

    public BoundaryPrendreEtal(ControlPrendreEtal controlPrendreEtal) {
        this.controlPrendreEtal = controlPrendreEtal;
    }

    public void prendreEtal(String nomVendeur) {
        // Vérifier l'identité du vendeur
        boolean identiteVerifiee = controlPrendreEtal.verifierIdentite(nomVendeur);
        
        if (identiteVerifiee) {
            // Le vendeur est connu, recherche d'un étal
            boolean etalDisponible = controlPrendreEtal.resteEtals();
            if (etalDisponible) {
                int numeroEtal = controlPrendreEtal.prendreEtal(nomVendeur, "produit", 5);
                if (numeroEtal != -1) {
                    System.out.println("Étal attribué au vendeur : " + nomVendeur);
                } else {
                    System.out.println("Aucun étal disponible.");
                }
            } else {
                System.out.println("Aucun étal disponible.");
            }
        } else {
            System.out.println(nomVendeur + " ne fait pas partie du village.");
        }
    }

    private void installerVendeur(String nomVendeur) {
        // TODO: Ajouter le code pour installer un vendeur sur un étal
    }
}
