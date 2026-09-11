package exercice10;
public class ExceptionMain {
    public static void main(String[] args) {
        CompteBancaire compte = new CompteBancaire("Alice", 100);
        try {
            compte.retirer(150);
        } catch (SoldeInsuffisantException e) {
            System.out.println("Erreur : " + e.getMessage());
            System.out.println("Montant manquant : " + e.getMontantManquant() + " €");
        } finally {
            System.out.println("Solde final : " + compte.getSolde() + " €");
        }
    }
}