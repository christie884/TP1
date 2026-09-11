package exercice2;

public class CompteBancaireMain {

    public static void main(String[] args) {

        CarteBancaire compte = new CarteBancaire("Christie", 100);

        System.out.println("Titulaire : " + compte.getTitulaire());
        System.out.println("Solde : " + compte.getSolde());

        compte.deposer(50);
        System.out.println("Après dépôt : " + compte.getSolde());

        compte.retirer(30);
        System.out.println("Après retrait : " + compte.getSolde());

        // Tests des erreurs
        try {
            compte.deposer(-10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            compte.retirer(500);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
