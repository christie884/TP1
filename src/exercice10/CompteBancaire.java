package exercice10;

public class CompteBancaire {
    //attributs
    private String titulaire;
    private double solde;
    public CompteBancaire(String titulaire, double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }
    public double getSolde() {
        return solde;
    }
    public String getTitulaire() {
        return titulaire;
    }
    // Peut lever une exception checked
    public void retirer(double montant) throws SoldeInsuffisantException {

        // Exception unchecked (bonus)
        if (montant <= 0) {
            throw new MontantInvalideException("Le montant doit être positif.");
        }

        if (montant > solde) {
            double manque = montant - solde;

            throw new SoldeInsuffisantException(
                    "Solde insuffisant. Il manque " + manque + " €.",
                    manque
            );
        }
        solde -= montant;
        System.out.println("Retrait effectué : " + montant + " €");
    }
}
