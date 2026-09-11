package exercice7;

// Interface pour les objets qui peuvent se connecter au wifi
public interface ConnecteWifi {

    void connecter(String reseau);

    void deconnecter();
}