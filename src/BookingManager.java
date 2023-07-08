import java.util.ArrayList;
import java.util.List;

public class BookingManager {


    static List<Booking> bookingList = new ArrayList<>();
    public Booking addBooking(Booking newBooking){
        bookingList.add(newBooking);
        return newBooking;
    }

    //přidání další rezervace
    public Booking getBooking(int index) {//zkusil jsem si místo index zadat id
        return bookingList.get(index);
    } //dal by se použit index

    //Vypis všech rezervaci

    public ArrayList<Booking>getAllBooking() {
     return new ArrayList<>(bookingList);
    }
    public int size(){return bookingList.size();} //měla by vypsat vsechny rezervace


    // Mazani rezervace
    public static ArrayList<BookingManager> getClearBooking(int index)
    {return new ArrayList<BookingManager>();}


    public int size(BookingManager bookingList) {return bookingList.size(bookingList);} //zkouska vypsat rezervace jinak nez z ArrayListu


    //Metoda pro pracovní pobyty
      public static int getNumberOfWorkingsBookings() {
      List<String> result = new ArrayList<>();
      for(Booking booking:bookingList)
      {if (booking.isWorkingStay())
      {
          System.out.println("Pracovní pobyty "+bookingList.size());}

     // else{ if(!booking.isWorkingStay())

   //   {System.out.println("Dovolená"+!booking.isWorkingStay()); }}

      }

      return Booking.getNextIndex();
               }


      //Pruměrný počet hostů na rezervaci
      public List<Booking>getAverageGuests() {
        List<Booking>averageGuests=new ArrayList<>();
        for (Booking booking:bookingList)
        {
           System.out.println((booking.getNumberOfGuests())/bookingList.size());
        }
    return null;  }

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



