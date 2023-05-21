package Principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import Entidades.Reserva;

public class hotel {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

        System.out.print("\nRoom number: ");
        int number = sc.nextInt();
        System.out.print("\nCheck-In date (dd/mm/yyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("\nCheck-Out date (dd/mm/yyy): ");
        Date checkOut = sdf.parse(sc.next());
        Reserva reserva = new Reserva(number, checkIn, checkOut);
        System.out.print(reserva);
        sc.close();
    }
}
