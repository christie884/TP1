package exercice4;

public class MainEmploye  {

    public static void main(String[] args) {

        Employe employe1 = new Employe("Alice", 2000);
        Employe employe2 = new Employe("Bob", 2500);

        Manager manager1 = new Manager("Charlie", 3000, 1000);
        Manager manager2 = new Manager("David", 3500, 1500);

        Employe[] employes = {
                employe1,
                employe2,
                manager1,
                manager2
        };

        for (Employe employe : employes) {
            System.out.println(
                    employe.getNom() + " : " + employe.calculerSalaire() + " €"
            );
        }
    }
}