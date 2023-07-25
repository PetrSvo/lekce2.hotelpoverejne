import java.util.ArrayList;
import java.util.List;

public class BookingManager {


    private static List<Booking> bookingList = new ArrayList<>();

        //Metoda pro vraceni Bookingmanager v metodách Main
        public List<Booking>getBooking()
        {
            return new ArrayList<>(bookingList);
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

        // Mazani jinak nez v tride Booking
         public void remove(Booking booking){
            bookingList.remove(booking);
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
        for (Booking booking: bookingList)
            {
            totalGuests += (booking.getNumberOfGuests());
            }
            return ((double) totalGuests) /bookingList.size();

         }


     //Metoda pro pracovní pobyty

      public static int getNumberOfWorkingsBookings ()
        {
         int numberOfWorkingsBookings=0;
             for(Booking booking:bookingList)
            {
             if (booking.isWorkingStay())
                 {
                    numberOfWorkingsBookings++;
                 }
           }
         return numberOfWorkingsBookings;
        }



         //Vypis prvnich 8.pobytů rekreace


         public static List<Booking> getEightWorkingStay ()
        {
            List<Booking> eightWorkingStay = new ArrayList<>();

           // int eightHoliday;

            //     for ( eightHoliday = 0; eightHoliday <= 8; eightHoliday=++)
            {

                    for (Booking booking : bookingList)
                        if (!booking.isWorkingStay())
                        {
                 //          eightHoliday +=(booking.getIndex());
                        }
                    {
                        for (Booking booking : bookingList)
                            {
                    //            booking.getIndex()= eightWorkingStay();
                            }

                    }
            } return  eightWorkingStay;

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



