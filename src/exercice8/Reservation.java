package exercice8;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Reservation {

    private String nomClient;
    private LocalDate dateArrivee;
    private LocalDate dateDepart;

    // Constructeur
    public Reservation(String nomClient, LocalDate dateArrivee, LocalDate dateDepart) {

        // Vérifie que la date de départ est après la date d'arrivée
        if (!dateDepart.isAfter(dateArrivee)) {
            throw new IllegalArgumentException(
                    "La date de départ doit être après la date d'arrivée."
            );
        }

        this.nomClient = nomClient;
        this.dateArrivee = dateArrivee;
        this.dateDepart = dateDepart;
    }

    // Calcule le nombre de nuits
    public long dureeSejour() {
        return ChronoUnit.DAYS.between(dateArrivee, dateDepart);
    }

    // Vérifie si la date est en haute saison
    public static boolean estEnHauteSaison(LocalDate date) {
        return date.getMonth() == Month.JULY
                || date.getMonth() == Month.AUGUST;
    }

    // Getter du nom
    public String getNomClient() {
        return nomClient;
    }

    // Getter de la date d'arrivée
    public LocalDate getDateArrivee() {
        return dateArrivee;
    }
}
