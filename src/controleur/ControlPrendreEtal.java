package controleur;

import villagegaulois.Village;
import java.util.Scanner;


public class ControlPrendreEtal {
	private Village village;
	private ControlVerifierIdentite controlVerifierIdentite;
	private Scanner scan = new Scanner(System.in);

	
	public ControlPrendreEtal(ControlVerifierIdentite controlVerifierIdentite,
			Village village) {
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.village = village;
	}

	public boolean resteEtals() {
		//TODO a completer, attention le retour ne dit pas etre false :-)
		return false;
	}

	 public void prendreEtal(String nomVendeur) {
	        if (controlVerifierIdentite.verifierIdentite(nomVendeur)) {
	            System.out.println("Identité vérifiée. Vous pouvez prendre un étal.");
	            System.out.println("Entrez le nom du produit à vendre :");
	            String produit = scan.nextLine();
	            System.out.println("Entrez le nombre de produits que vous souhaitez mettre en vente :");
	            int nbProduit = scan.nextInt();

	            int numeroEtal = village.installerVendeur(controlVerifierIdentite.trouverHabitant(nomVendeur), produit, nbProduit);

	            if (numeroEtal >= 0) {
	                System.out.println("Félicitations ! Vous avez pris l'étal numéro " + numeroEtal);
	            } else {
	                System.out.println("Désolé, il n'y a plus d'étal disponible.");
	            }
	        } else {
	            System.out.println("Désolé, vous ne faites pas partie du village.");
	        }
	    }


	 public boolean verifierIdentite(String nomVendeur) {
	     
	        return controlVerifierIdentite.verifierIdentite(nomVendeur);
	    }
	}

