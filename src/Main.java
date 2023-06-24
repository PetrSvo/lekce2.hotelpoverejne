import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Main {


    public static void main(String... args) {

        BookingManager bookingManager = new BookingManager();


        ArrayList<Booking> allBooking = bookingManager.getAllBooking();
        for (Booking booking : allBooking) ;
        {
            System.out.println("Počet rezervaci je " + allBooking.size());}

            ArrayList<Guest>guestList=new ArrayList<>();
            Guest guest1=new Guest("Karel Dvorak",LocalDate.of(1990,5,15));
             bookingManager.addBooking(new Booking(1, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 7), 3, 5, true));
             for(Booking booking: allBooking);{
            System.out.println(guest1.getName()+" narozen(a) "+guest1.getBorn()+" má rezervaci"+" od "+Booking.getDateStart()+" do "+Booking.getDateEnd()+" na pokoji "+ Booking.getNumberRooms()+" , kde ubytováno bude "+Booking.getCountGuestInRoom()+" hostů pracovně "+ Booking.isWorkingStay());


            Guest guest2 = new Guest("Karel Dvorak",LocalDate.of(1990,5,15));
            bookingManager.addBooking(new Booking(2, LocalDate.of(2023, 8, 18), LocalDate.of(2023, 8, 21), 2, 2, false));
            for(Booking booking: allBooking);{
                System.out.println(guest2.getName() + " narozen(a) " + guest2.getBorn() + " má rezervaci" + " od " + Booking.getDateStart() + " do " + Booking.getDateEnd() + " na pokoji " + Booking.getNumberRooms() + " , kde ubytováno bude " + Booking.getCountGuestInRoom() + " hostů pracovně " + Booking.isWorkingStay());

                Guest guest3 = new Guest("Cestovní kancelář ABC Relax", LocalDate.of(2020, 5, 30));
                 //   for (int i = 1; i <= 30; i++){System.out.println(guest3.getName() +" zalozena "+ guest3.getBorn(LocalDate.plusDays(1)) + " má rezervaci" + " od " + Booking.getDateStart() + " do " + Booking.getDateEnd() + " na pokoji " + Booking.getNumberRooms() + " , kde ubytováno bude " + Booking.getCountGuestInRoom() + " hostů pracovně " + Booking.isWorkingStay());;
               bookingManager.addBooking(new Booking(3, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 2), 2, 1, true));

               Guest guest4 = new Guest("Alena Krasova", LocalDate.of(2002, 5, 30));
               for (int i = 1; i <= 7; i++) {System.out.println(guest4.getName() +" narozena "+ guest4.getBorn() + " má rezervaci" + " od " + Booking.getDateStart() + " do " + Booking.getDateEnd() + " na pokoji " + Booking.getNumberRooms() + " , kde ubytováno bude " + Booking.getCountGuestInRoom() + " hostů pracovně " + Booking.isWorkingStay());;
                            //Alena Krasova dalších 7 rezervací po 5 dnech v následujích měsicích LocalDate.plusMonths()
                   bookingManager.addBooking(new Booking(4, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 5), 1, 1, false));
                        }

               //ABCRelax další 3 třídenní pobyty od 8.15,21.srpna
                for (int i = 1; i <= 3; i++) {System.out.println(guest3.getName() +" zalozena "+ guest3.getBorn() + " má rezervaci" + " od " + Booking.getDateStart() + " do " + Booking.getDateEnd() + " na pokoji " + Booking.getNumberRooms() + " , kde ubytováno bude " + Booking.getCountGuestInRoom() + " hostů pracovně " + Booking.isWorkingStay());;
                    bookingManager.addBooking(new Booking(5, LocalDate.of(2023, 8, 1), LocalDate.of(2023, 8, 4), 2, 1, true));


                            }}


            //ABCRelax dalsích 30jednodenních pobytů
            int limitrezervationABCRelax = 30;
            int rezervationABCRelax;
            //  LocalDate jedenDen =LocalDatePLusDays(1);
            int getDayOfYear=1;
               //     Booking booking = bookingManager.addBooking(new Booking("" + 1, LocalDateplusDays(1)));



              //  for(Booking booking: allBooking);{for (int i=1; i <= 30; i++) ; {bookingManager.addBooking(new Booking(+1,LocalDate.of(2023,6,1),LocalDate.of(2023,6,2),2,1,true));}
                //    System.out.println(guest3.getName()+" zalozena(a) "+guest3.getBorn()+" má rezervaci"+" od "+Booking.getDateStart(DatePlusDays(1))+" do "+Booking.getDateEnd()+" na pokoji "+ Booking.getNumberRooms()+" , kde ubytováno bude "+Booking.getCountGuestInRoom()+" hostů pracovně "+ Booking.isWorkingStay());
                for(Booking booking: allBooking)
               //  if (int i<int limitrezervationABCRelax)

                      // {System.out.println(guest3.getName()+" zalozena(a) "{if (int i<=30)}+bookingManager.addBooking(new Booking(+1,LocalDate.of(2020,6,2), LocalDate.ofYearDay(0,1),2,1,true)));
                        ;
          //       } else {
            //        int i = 30;
          //       } {System.out.println(bookingManager.addBooking(new Booking(+1,LocalDate.EPOCH.plusDays(1), LocalDate.ofYearDay(0,1),2,1,true)));
                   //     }



                    //         for (Guest guest:guestList);{
        //    System.out.println(guest1.getName()+" narozen(a) "+guest1.getBorn()+" má rezervaci");
                }







     //    bookingManager.addGuest(new Guest("Karel Dvorak",LocalDate.of(1990,5,15)));

    //    ArrayList<Guest>allGuest=bookingManager.getAllGuest();
    //    for(Guest guest:allGuest);{
    //        System.out.println(allGuest.size());}
   //     for(Guest guest:allGuest){
   //         System.out.println(AllGuest.getName());}
     //   for(int i=1;i<10;i++){
    //        System.out.println();      //  bookingManager.addGuest(new Guest("Karel Dvorak",LocalDate.of(1979,3,1)));
    //    }

       bookingManager.addRoom(new Room(1, 1, true, true, BigDecimal.valueOf(1000)));
      bookingManager.addRoom(new Room(2,1,true,true,BigDecimal.valueOf(1000)));
       bookingManager.addRoom(new Room(3,3,false,true,BigDecimal.valueOf(2400)));}}

















