package exercice7;
public class TelMain {

    public static void main(String[] args) {

        // Tableau contenant un téléphone et une lampe
        Allumable[] appareils = {
                new TelephonePortable(),
                new Lampe()
        };

        // On parcourt les appareils
        for (Allumable appareil : appareils) {

            // On allume chaque appareil
            appareil.allumer();

            // On vérifie si l'appareil possède le wifi
            if (appareil instanceof ConnecteWifi) {

                // Downcasting vers ConnecteWifi
                ConnecteWifi wifi = (ConnecteWifi) appareil;

                // Connexion au wifi
                wifi.connecter("Maison-Wifi");
            }
        }
    }
}
/*je conclue que : Le téléphone peut jouer plusieurs rôles :
il peut être allumé et il peut se connecter au WiFi.
Les interfaces permettent donc à une classe d'avoir plusieurs rôles.*/