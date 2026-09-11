package exercice2;

public class CarteBancaire {
    private double solde;
    private String titulaire;
    // Constructeur
    public CarteBancaire(String titulaire, double solde) {
        this.solde = solde;
        this.titulaire = titulaire;
    }

    //getter pour chaque attribut mais aucun solde direct pour solde
    public double getSolde() {
        return solde;
    }
    public String getTitulaire() {
        return titulaire;
    }
    // Ajout d'une méthode deposer(double montant) qui refuse (via une exception IllegalArgumentException) tout montant négatif ou nul.
    public void deposer(double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant doit être positif.");
        }
        solde += montant;
    }

    // Ajout d'une méthode retirer(double montant) qui refuse un retrait si le solde est insuffisant (lever IllegalArgumentException avec un message clair).
    public void retirer(double montant) {
        if (montant <= 0) {
            throw new IllegalArgumentException("Le montant doit être positif.");
        }
        if (montant > solde) {
            throw new IllegalArgumentException("Solde insuffisant.");
        }
        solde -= montant;
    }
}
