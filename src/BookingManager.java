import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {


   static List<Booking> bookingList = new ArrayList<>();
 //   public Booking addBooking(Booking newBooking){
   //     bookingList.add(newBooking);
   //     return newBooking;}


    //přidání další rezervace

public void add(Booking newBooking){
        bookingList.add(newBooking);}

        public Booking get(int nextIndex){
            return bookingList.get(nextIndex);
    }

    //  public List <Booking> bookingList(int index) {
   //   return bookingList(index);
 // }

    //Vypis všech rezervaci

    public ArrayList<Booking>getAllBooking() {
     return new ArrayList<>(bookingList);
    }
    public static int size(){return bookingList.size();} //měla by vypsat vsechny rezervace


    // Mazani rezervace
      // public ArrayList<Booking> getClearBooking(int index) {
      //  return getClearBooking(index);}
    // public ArrayList<Booking> getClearBooking(int index){
  //  return new ArrayList<Booking>();
   // }
    public int clearBooking(int index){
    return clearBooking(index);
    }

    // Mazani rezervace
   // public ArrayList<Booking> getClearBooking(int index)
    //   {return new ArrayList<Booking>(index);}


    //Metoda pro pracovní pobyty
      public static int getNumberOfWorkingsBookings()
      {
        int numberOfWorkingsBookings=0;
      for(Booking booking:bookingList)
      {
          if (!booking.isWorkingStay())
      {
          numberOfWorkingsBookings++;
      }
      }
      return numberOfWorkingsBookings;
               }


      //Pruměrný počet hostů na rezervaci
      public static double getAverageGuests() {
    for (Booking booking:bookingList) {
    double averageGuests=(booking.getNumberOfGuests())/bookingList.size();

        {
           System.out.println(averageGuests);
        }}
    return getAverageGuests();  }


//Vypis prvnich 8.pobytů rekreace

    public static List<Booking> getEightWorkingStay (boolean workingStay) {
        List<Booking> eightWorkingStay = new ArrayList<>();
        int eightHoliday=0;
       for (Booking booking:bookingList)
        if (!booking.isWorkingStay())
        {
            int i = eightHoliday++;

     //   while int i = eightHoliday<=8;
            };
        { for(Booking booking:bookingList)
                System.out.println(bookingList.get(booking.getNumberRooms()));

            } return null;
        }


    static List<Guest> guestList = new ArrayList<>();
    public void addGuest(Guest newGuest){
        guestList.add(newGuest);}

    public void add(Guest guest){
        guestList.add(guest);}



   public ArrayList<Guest>getAllGuest() {
       return new ArrayList<>(guestList);
    }

    List<Room> roomList =new ArrayList<>();
    public void addRoom(Room newRoom){
        roomList.add(newRoom);}

    public ArrayList<Room>getAllRoom(){
        return new ArrayList<>(roomList); }
    }



