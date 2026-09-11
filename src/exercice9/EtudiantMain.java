package exercice9;
import java.util.ArrayList;

public class EtudiantMain {

    public static void main(String[] args) {

        Etudiant etudiant1 =
                new Etudiant("001", "Alice", 15.5);

        Etudiant etudiant2 =
                new Etudiant("002", "Bob", 12.0);

        // Même numéro mais nom et moyenne différents
        Etudiant etudiant3 =
                new Etudiant("001", "Charlie", 18.0);

        ArrayList<Etudiant> etudiants = new ArrayList<>();

        etudiants.add(etudiant1);
        etudiants.add(etudiant2);

        // Affichage
        System.out.println(etudiant1);
        System.out.println(etudiant2);

        System.out.println();

        // Test equals()
        System.out.println("etudiant1 == etudiant3 : "
                + etudiant1.equals(etudiant3));
        // Deux étudiants sont égaux si leur numéro est identique.
        // Test contains()
        System.out.println("Liste contient etudiant3 : "
                + etudiants.contains(etudiant3));
    }
}