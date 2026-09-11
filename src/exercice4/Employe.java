package exercice4;

public class Employe {
    protected String nom;
    protected double salaireBase;  //on met pritected pour y accéder
    //constructeur
    public Employe(String nom, double salaireBase) {
        this.nom = nom;
        this.salaireBase = salaireBase;
    }
    public double calculerSalaire(){
        return salaireBase;
    }
    //getteur et setteur
    public String getNom() {
        return nom;
    }

    public double getSalaireBase() {
        return salaireBase;
    }

}

