package exercice8;

import java.time.LocalDate;

public class ReservationMain {

    public static void main(String[] args) {

        try {
            Reservation reservation1 = new Reservation(
                    "Alice",
                    LocalDate.of(2026, 7, 10),
                    LocalDate.of(2026, 7, 15)
            );

            Reservation reservation2 = new Reservation(
                    "Bob",
                    LocalDate.of(2026, 5, 10),
                    LocalDate.of(2026, 5, 13)
            );

            // Réservation invalide : départ avant l'arrivée
            Reservation reservation3 = new Reservation(
                    "Charlie",
                    LocalDate.of(2026, 5, 15),
                    LocalDate.of(2026, 5, 12)
            );

            Reservation[] reservations = {
                    reservation1,
                    reservation2,
                    reservation3
            };

            for (Reservation reservation : reservations) {
                System.out.println("Client : " + reservation.getNomClient());
                System.out.println("Durée : " + reservation.dureeSejour() + " nuits");

                if (Reservation.estEnHauteSaison(reservation.getDateArrivee())) {
                    System.out.println("Haute saison : oui");
                } else {
                    System.out.println("Haute saison : non");
                }

                System.out.println();
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}