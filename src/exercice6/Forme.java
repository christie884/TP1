package exercice6;

// Classe abstraite
public abstract class Forme {

    // Méthode pour calculer l'aire
    public abstract double aire();

    // Affiche l'aire
    public void afficherAire() {
        System.out.println("Aire : " + aire());
    }

    // Cherche la forme avec la plus grande aire
    public static Forme plusGrande(Forme[] formes) {

        // Première forme = plus grande au départ
        Forme plusGrande = formes[0];

        // Parcourt le tableau
        for (Forme forme : formes) {

            // Compare les aires
            if (forme.aire() > plusGrande.aire()) {

                // Change la plus grande forme
                plusGrande = forme;
            }
        }

        // Retourne la plus grande forme
        return plusGrande;
    }
}