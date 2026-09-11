package exercice9;

import java.util.Objects;

public class Etudiant {

    private String numeroEtudiant;
    private String nom;
    private double moyenne;

    // Constructeur
    public Etudiant(String numeroEtudiant, String nom, double moyenne) {
        this.numeroEtudiant = numeroEtudiant;
        this.nom = nom;
        this.moyenne = moyenne;
    }

    // Affichage de l'étudiant
    @Override
    public String toString() {
        return "Étudiant : " + nom + " - numéro : "
                + numeroEtudiant + " - moyenne : " + moyenne;
    }

    // Compare deux étudiants
    @Override
    public boolean equals(Object o) {

        // Vérifie si c'est le même objet
        if (this == o) {
            return true;
        }

        // Vérifie si l'objet est bien un Etudiant
        if (!(o instanceof Etudiant)) {
            return false;
        }

        Etudiant autre = (Etudiant) o;

        // Deux étudiants sont égaux si leur numéro est identique
        return numeroEtudiant.equals(autre.numeroEtudiant);
    }

    // HashCode basé uniquement sur le numéro étudiant
    @Override
    public int hashCode() {

        // hashCode doit être cohérent avec equals()
        return Objects.hash(numeroEtudiant);
    }
}