package Principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import Entidades.Reservation;

public class hotel {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        System.out.print("\nRoom number: ");
        int number = sc.nextInt();
        System.out.print("Check-In date (dd/mm/yyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-Out date (dd/mm/yyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: Check-out date must be after Check-In date");
        } else {
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("\nReservation: " + reservation);

            System.out.println("\nEnter another data to update the reservation: ");
            System.out.print("Check-In date (dd/mm/yyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-Out date (dd/mm/yyy): ");
            checkOut = sdf.parse(sc.next());

            String error = reservation.updateDates(checkIn, checkOut);
            if (error != null){
                System.out.println("Error in reservation: " + error);
            }
            else{
                System.out.println("\nReservation: " + reservation);
            }
            

        }
        sc.close();
    }
}
