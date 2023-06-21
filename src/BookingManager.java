import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {


    List<Booking> bookingList = new ArrayList<>();
    public void addBooking(Booking newBooking){
        bookingList.add(newBooking);}

    public Booking getBooking(int id) {//zkusil jsem si místo index zadat id
        return bookingList.get(id);
    }

    public ArrayList<Booking>getAllBooking() {
     return new ArrayList<>(bookingList);
    }




    List<Guest> guestList = new ArrayList<>();
    public void addGuest(Guest newGuest){
        guestList.add(newGuest);}

    public Guest getGuest(String name) {
        return guestList.get(1);   //chce to číslo, zatim necham, uvidim co udela
    }

    public ArrayList<Guest>getAllGuest() {
        return new ArrayList<>(guestList);
}

    List<Room> roomList =new ArrayList<>();
    public void addRoom(Room newRoom){
        roomList.add(newRoom);}

    public ArrayList<Room>getAllRoom(){
        return new ArrayList<>(roomList); }
    }

