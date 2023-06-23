import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {


    List<Booking> bookingList = new ArrayList<>();
    public void addBooking(Booking newBooking){
        bookingList.add(newBooking);}

    public Booking getBooking(int index) {//zkusil jsem si místo index zadat id
        return bookingList.get(index);
    }

    public ArrayList<Booking>getAllBooking() {
     return new ArrayList<>(bookingList);
    }


    List<Guest> guestList = new ArrayList<>();
    public void addGuest(Guest newGuest){
        guestList.add(newGuest);}

    public void add(Guest guest){
        guestList.add(guest);}

    //  public Guest getGuest(String name) {
     // return Guest.getName();   //nevim proc to nechce vzit
     // }



   public ArrayList<Guest>getAllGuest() {
       return new ArrayList<>(guestList);
    }

    List<Room> roomList =new ArrayList<>();
    public void addRoom(Room newRoom){
        roomList.add(newRoom);}

    public ArrayList<Room>getAllRoom(){
        return new ArrayList<>(roomList); }
    }

