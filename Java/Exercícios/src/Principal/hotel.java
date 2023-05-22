package Principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import Model_entities.Reservation;
import Model_exceptions.DomainExceptions;

public class hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        try{
            System.out.print("\nRoom number: ");
            int number = sc.nextInt();
            System.out.print("Check-In date (dd/mm/yyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-Out date (dd/mm/yyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("\nReservation: " + reservation);

            System.out.println("\nEnter another data to update the reservation: ");
            System.out.print("Check-In date (dd/mm/yyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-Out date (dd/mm/yyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("\nReservation: " + reservation);
        }
        catch (ParseException e){
            System.out.println("Invalid date format!");
        }
        catch(DomainExceptions e){
            System.out.println("Error in reservation" + e.getMessage());
        }
        catch(RuntimeException e){
            System.out.println("Unexpected Error");
        }
        sc.close();
    }
}