package Model_entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import Model_exceptions.DomainExceptions;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");

    public Reservation(Integer roomNumber,  Date checkIn, Date checkOut) throws DomainExceptions{
        if(!checkOut.after(checkIn)){
            throw new DomainExceptions("Check-out date must be after Check-In date");
        }
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)){
            throw new DomainExceptions("reservation dates must be future dates");
        }
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
    public void updateDates(Date checkIn, Date checkOut) throws DomainExceptions{
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)){
            throw new DomainExceptions("reservation dates must be future dates");
        }
        if(!checkOut.after(checkIn)){
            throw new DomainExceptions("Check-out date must be after Check-In date");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }
    @Override
    public String toString() {
        return "Room " + roomNumber
        + ", check-In: " + sdf.format(checkIn)
        + ", Checkout " + sdf.format(checkOut)
        + ", " + duration() + " nights";
    }
}
