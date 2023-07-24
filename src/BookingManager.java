import java.util.ArrayList;
import java.util.List;

public class BookingManager {


    static List<Booking> bookingList = new ArrayList<>();

        //Metoda pro vraceni Booking -nefunguje
      // public static String vypisRezervace(List<Booking> bookingList)
        {
        for (Booking booking:bookingList)
             {
         //   return String.valueOf(booking.getIndex());
                    String.valueOf(booking.getNumberOfGuests());
                     booking.getDateStart();
                     booking.getDateEnd();
                     booking.getNumberRooms();
                     booking.getNumberOfGuests();
                     booking.isWorkingStay();
             }


              //  return null;
        }



        //Přidání další rezervace

        public void add(Booking newBooking)
        {
        bookingList.add(newBooking);
        }

         public Booking get(int nextIndex)
         {
            return bookingList.get(nextIndex);
         }


        //Vypis všech rezervaci

          public ArrayList<Booking>getAllBooking()
         {
         return new ArrayList<>(bookingList);
         }

         public static int size()
         {
        return bookingList.size();
         } //měla by vypsat vsechny rezervace



    //Pruměrný počet hostů na rezervaci

     public static double getAverageGuests()
         {
             int totalGuests = 0;
        for (Booking booking:bookingList)
            {
            totalGuests += (booking.getNumberOfGuests());
            }
            return ((double) totalGuests) /bookingList.size();

         }



     //Metoda pro pracovní pobyty

      public int getNumberOfWorkingsBookings()
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



    //Vypis prvnich 8.pobytů rekreace

         public static List<Booking> getEightWorkingStay (int eigthtHoliday)
        {
       // int eightHoliday=(i = 0, i <= 8, i++;)
        List<Booking> eightWorkingStay = new ArrayList<>();
            {

            for (Booking booking : bookingList)
                if (!booking.isWorkingStay())
                {
                        System.out.println(booking.getIndex());

                }
          } return null;
        }


        static List<Guest> guestList = new ArrayList<>();
        public void addGuest(Guest newGuest)
         {
        guestList.add(newGuest);
         }

        public void add(Guest guest)
        {
        guestList.add(guest);
        }


        public ArrayList<Guest>getAllGuest()
         {
       return new ArrayList<>(guestList);
        }

        List<Room> roomList =new ArrayList<>();
         public void addRoom(Room newRoom)
         {
        roomList.add(newRoom);
         }

         public ArrayList<Room>getAllRoom()
         {
        return new ArrayList<>(roomList);
        }

    }



