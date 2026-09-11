package exercice1;
public class Livre {
        // Attributs
        private String titre;
        private String auteur;
        private int nombrePages;
        private boolean disponible;

        // Constructeur
        public Livre(String titre, String auteur, int nombrePages) {
            this.titre = titre;
            this.auteur = auteur;
            this.nombrePages = nombrePages;
            this.disponible = true;
        }
        // Méthode emprunter
        public void emprunter() {
            if (disponible) {
                disponible = false;
                System.out.println("Le livre \"" + titre + "\" a été emprunté.");
            } else {
                System.out.println("Le livre \"" + titre + "\" n'est pas disponible.");
            }
        }
        // Méthode rendre
        public void rendre() {
            disponible = true;
            System.out.println("Le livre \"" + titre + "\" a été rendu.");
        }

}
