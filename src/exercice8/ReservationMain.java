package exercice8;

import java.time.LocalDate;

public class ReservationMain {

    public static void main(String[] args) {

        Reservation reservation1 = null;
        Reservation reservation2 = null;
        Reservation reservation3 = null;

        // Réservation 1
        try {
            reservation1 = new Reservation(
                    "Alice",
                    LocalDate.of(2026, 7, 10),
                    LocalDate.of(2026, 7, 15)
            );
            System.out.println("Réservation Alice créée avec succès.");

        } catch (IllegalArgumentException e) {
            System.out.println("Erreur Alice : " + e.getMessage());
        }

        // Réservation 2
        try {
            reservation2 = new Reservation(
                    "Bob",
                    LocalDate.of(2026, 5, 10),
                    LocalDate.of(2026, 5, 13)
            );
            System.out.println("Réservation Bob créée avec succès.");

        } catch (IllegalArgumentException e) {
            System.out.println("Erreur Bob : " + e.getMessage());
        }

        // Réservation 3 : invalide
        try {
            reservation3 = new Reservation(
                    "Charlie",
                    LocalDate.of(2026, 5, 15),
                    LocalDate.of(2026, 5, 12)
            );
            System.out.println("Réservation Charlie créée avec succès.");

        } catch (IllegalArgumentException e) {
            System.out.println("Erreur Charlie : " + e.getMessage());
        }

        System.out.println();

        // Affiche les réservations qui ont fonctionné
        if (reservation1 != null) {
            System.out.println("Client : " + reservation1.getNomClient());
            System.out.println("Durée : " + reservation1.dureeSejour() + " nuits");
            System.out.println("Haute saison : "
                    + Reservation.estEnHauteSaison(reservation1.getDateArrivee()));
            System.out.println();
        }

        if (reservation2 != null) {
            System.out.println("Client : " + reservation2.getNomClient());
            System.out.println("Durée : " + reservation2.dureeSejour() + " nuits");
            System.out.println("Haute saison : "
                    + Reservation.estEnHauteSaison(reservation2.getDateArrivee()));
            System.out.println();
        }
    }
}