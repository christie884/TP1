package exercice6;
public class FormeMain {

    public static void main(String[] args) {

        // Impossible :
        // Forme forme = new Forme();

        // Création des différentes formes
        Cercle cercle = new Cercle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(10, 3);

        // Tableau de type Forme
        Forme[] formes = {
                cercle,
                rectangle,
                triangle
        };

        // Parcours du tableau
        for (Forme forme : formes) {
            forme.afficherAire();
        }

        // Bonus
        Forme plusGrande = Forme.plusGrande(formes);

        System.out.println("La plus grande aire est : "
                + plusGrande.aire());
    }
}
