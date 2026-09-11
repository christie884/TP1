package exercice1;

public class Main {

    public static void main(String[] args) {
        // Création de deux livres
        Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 96);
        Livre livre2 = new Livre("1984", "George Orwell", 328);


        // Test de l'emprunt
        livre1.emprunter();

        // Tentative d'emprunter à nouveau
        livre1.emprunter();

        // Rendre le livre
        livre1.rendre();

        // Réemprunter
        livre1.emprunter();
    }
}
