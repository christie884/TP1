
package exercice3;
public class RectangleMain {
    public static void main(String[] args) {

        // Rectangle avec largeur et hauteur
        Rectangle r1 = new Rectangle(5, 3);

        // Carré avec un seul côté
        Rectangle r2 = new Rectangle(4);

        // Rectangle par défaut : 1 x 1
        Rectangle r3 = new Rectangle();

        // Affichage des résultats
        System.out.println("Rectangle 1");
        System.out.println("Aire : " + r1.aire());
        System.out.println("Périmètre : " + r1.perimetre());

        System.out.println();

        System.out.println("Rectangle 2");
        System.out.println("Aire : " + r2.aire());
        System.out.println("Périmètre : " + r2.perimetre());

        System.out.println();

        System.out.println("Rectangle 3");
        System.out.println("Aire : " + r3.aire());
        System.out.println("Périmètre : " + r3.perimetre());
    }
}