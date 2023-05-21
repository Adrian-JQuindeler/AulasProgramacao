package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

    public Reservation(Integer roomNumber,  Date checkIn, Date checkOut){
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    public Integer getRoomNumber(){
        return roomNumber;
    }
    public void serRoomNumber(Integer roomNumber){
        this.roomNumber = roomNumber;
    }
    public Date getCheckIn() {
        return checkIn;
    }
    public Date getCheckOut() {
        return checkOut;
    }
    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }
    public String updateDates(Date checkIn, Date checkOut){
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)){
            return "reservation dates must be future dates";
        }
        if(!checkOut.after(checkIn)){
            return "Check-out date must be after Check-In date";
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null;
    }
    @Override
    public String toString() {
        return "Room " + roomNumber
        + ", check-In: " + sdf.format(checkIn)
        + ", Checkout " + sdf.format(checkOut)
        + ", " + duration() + " nights";
    }
}
