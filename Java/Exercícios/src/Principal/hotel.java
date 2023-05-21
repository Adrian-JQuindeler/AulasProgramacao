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

        if(!checkOut.after(checkIn)){
            System.out.println("Error in reservation: Check-out date must be after Check-In date");
        }
        else{
            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("\nReservation: " + reservation);
            
            System.out.println("\nEnter another data to update the reservation: ");
            System.out.print("Check-In date (dd/mm/yyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-Out date (dd/mm/yyy): ");
            checkOut = sdf.parse(sc.next());
            
            Date now = new Date();
            if (checkIn.before(now) || checkOut.before(now)){
                System.out.println("Error in reservation: reservation dates must be future dates");
            }
            else if(!checkOut.after(checkIn)){
                System.out.println("Error in reservation: Check-out date must be after Check-In date");
            }
            else{
                reservation.updateDates(checkIn, checkOut);
                System.out.println("\nReservation: " + reservation);
            }
        }
        sc.close();
    }
}
