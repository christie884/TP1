package exercice7;

public class TelephonePortable implements Allumable, ConnecteWifi {

    private boolean allume;
    private String reseauConnecte;

    // Allumer le téléphone
    @Override
    public void allumer() {
        allume = true;
        System.out.println("Le téléphone est allumé.");
    }

    // Éteindre le téléphone
    @Override
    public void eteindre() {
        allume = false;
        System.out.println("Le téléphone est éteint.");
    }

    // Connecter le téléphone au wifi
    @Override
    public void connecter(String reseau) {
        reseauConnecte = reseau;
        System.out.println("Connecté au réseau : " + reseau);
    }

    // Déconnecter le wifi
    @Override
    public void deconnecter() {
        reseauConnecte = null;
        System.out.println("Wifi déconnecté.");
    }
}