package exercice5;

public class Produit {

    private String nom;
    private double prix;

    // Constructeur
    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    // 1. Afficher le nom et le prix
    public void afficher() {
        System.out.println("Produit : " + nom);
        System.out.println("Prix : " + prix);
    }

    // 2. Afficher le prix avec une remise
    public void afficher(double remise) {
        double prixApresRemise = prix - (prix * remise / 100);
        System.out.println("Produit : " + nom);
        System.out.println("Prix après remise de " + remise + "% : " + prixApresRemise);
    }

    // 3. Afficher le prix avec une devise
    public void afficher(String devise) {
        System.out.println("Produit : " + nom);
        System.out.println("Prix : " + prix + " " + devise);
    }
}
