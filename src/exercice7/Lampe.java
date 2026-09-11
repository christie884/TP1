package exercice7;

public class Lampe implements Allumable {

    @Override
    public void allumer() {
        System.out.println("La lampe est allumée.");
    }

    @Override
    public void eteindre() {
        System.out.println("La lampe est éteinte.");
    }
}