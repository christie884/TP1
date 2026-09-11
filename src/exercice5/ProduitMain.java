package exercice5;
public class ProduitMain {

    public static void main(String[] args) {

        Produit produit = new Produit("Ordinateur", 1000);

        // Appelle afficher()
        produit.afficher();

        System.out.println();

        // Appelle afficher(double remise)
        produit.afficher(20);

        System.out.println();

        // Appelle afficher(String devise)
        produit.afficher("EUR");
    }
}

