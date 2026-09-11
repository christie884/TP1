package exercice3;

public class Rectangle {
    private double largeur;
    private double hauteur;
    //Constructeur
    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    public Rectangle(double cote) {
        this.largeur = cote;
        this.hauteur = cote;
    }
    public Rectangle() {
        this.largeur = 1;
        this.hauteur = 1;
    }
    // Calcul de l'aire
    public double aire() { return largeur * hauteur; }
    // Calcul du périmètre
    public double perimetre() { return 2 * (largeur + hauteur); }
}
