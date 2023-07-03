import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {


    List<Booking> bookingList = new ArrayList<>();
    public Booking addBooking(Booking newBooking){
        bookingList.add(newBooking);
        return newBooking;
    }

    //přidání další rezervace
    public Booking getBooking(int id) {//zkusil jsem si místo index zadat id
        return bookingList.get(id);
    } //dal by se použit index

    //Vypis všech rezervaci

    public ArrayList<Booking>getAllBooking() {
     return new ArrayList<>(bookingList);
    }

    // Mazani rezervace
    public Booking clearBooking(int id) {
        return bookingList.get(id);}


    public int size(BookingManager BookingList) {return BookingList.size(BookingList);} //zkouska vypsat rezervace jinak nez z ArrayListu


    List<Guest> guestList = new ArrayList<>();
    public void addGuest(Guest newGuest){
        guestList.add(newGuest);}

    public void add(Guest guest){
        guestList.add(guest);}

    // public Guest getGuest(String name) {
   //  return Guest.getName();   //nevim proc to nechce vzit
   //   }



   public ArrayList<Guest>getAllGuest() {
       return new ArrayList<>(guestList);
    }

    List<Room> roomList =new ArrayList<>();
    public void addRoom(Room newRoom){
        roomList.add(newRoom);}

    public ArrayList<Room>getAllRoom(){
        return new ArrayList<>(roomList); }
    }



