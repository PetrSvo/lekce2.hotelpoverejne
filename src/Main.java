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
        System.out.println("Počet rezervaci je " + allBooking.size());

        //    for (seaView:Booking booking); {
         //   boolean seaView = true;}
          //  {System.out.println("Ano");}

        List<Room>roomList=new ArrayList<>();
            Room room1=new Room(1, 1, true, true, BigDecimal.valueOf(1000));
            Room room2 =(new Room(2,1,true,true,BigDecimal.valueOf(1000)));
            Room room3=(new Room(3,3,false,true,BigDecimal.valueOf(2400)));

            List<Guest>guestList=new ArrayList<>();
            Guest guest1=new Guest("Karel Dvorak",LocalDate.of(1990,5,15));
            Guest guest2 = new Guest("Karel Dvorak",LocalDate.of(1990,5,15));
            Guest guest3 = new Guest("Cestovní kancelář ABC Relax", LocalDate.of(2020, 5, 30));
            Guest guest4 = new Guest("Alena Krasova", LocalDate.of(2002, 5, 30));

        List<Booking>bookingList=new ArrayList<>();
            Booking booking1=new Booking(1, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 7), 3, 5, true);
        bookingList.add(booking1);

            Booking booking2=new Booking(2, LocalDate.of(2023, 8, 18), LocalDate.of(2023, 8, 21), 2, 2, false);
        bookingList.add(booking2);

            Booking booking3=new Booking(3, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 2), 2, 1, true);
        bookingList.add(booking3);
            for (int i = 1; i<= 30; i++)
        {bookingList.add((new Booking(""+1,LocalDate.of(2023,6,1+LocalDate.plusDays(1)),LocalDate.of(2023,6,2+LocalDate.plusDays(1)),2,1,true)));

        }

      //  LocalDate.plusDays(1)

            Booking booking4=new Booking(40, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 5), 1, 1, false);
       // for (int id = 1; id <= 7; id++)

            Booking booking5=new Booking(50, LocalDate.of(2023, 8, 1), LocalDate.of(2023, 8, 4), 2, 1, true);
        //for (int id = 1; id <= 3; id++)


        //   bookingManager.addBooking(new Booking(1, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 7), 3, 5, true));
           //  for(Booking booking: allBooking);{
            System.out.println(guest1.getName()+" narozen(a) "+guest1.getBorn()+" má rezervaci"+" od "+booking1.getDateStart()+" do "+booking1.getDateEnd()+" na pokoji "+ booking1.getNumberRooms()+" , kde ubytováno bude "+booking1.getCountGuestInRoom()+" hostů pracovně "+ booking1.isWorkingStay()+" má lůžek "+room1.getBeeds()+ " s balkonem " +room1.isBalkon()+" výhledem na moře "+room1.isSeaView());



         //  bookingManager.addBooking(new Booking(2, LocalDate.of(2023, 8, 18), LocalDate.of(2023, 8, 21), 2, 2, false));
         //   for(Booking booking: allBooking);{
                System.out.println(guest2.getName() + " narozen(a) " + guest2.getBorn() + " má rezervaci" + " od " + booking2.getDateStart() + " do " + booking2.getDateEnd() + " na pokoji " + booking2.getNumberRooms() + " , kde ubytováno bude " + booking2.getCountGuestInRoom() + " hostů pracovně " + booking2.isWorkingStay()+" má lůžek "+room2.getBeeds()+ " s balkonem " +room2.isBalkon()+" výhledem na moře "+room2.isSeaView());


                  System.out.println(guest3.getName() +" zalozena "+ guest3.getBorn() + " má rezervaci" + " od " + booking3.getDateStart() + " do " + booking3.getDateEnd() + " na pokoji " + booking3.getNumberRooms() + " , kde ubytováno bude " + booking3.getCountGuestInRoom() + " hostů pracovně " + booking3.isWorkingStay());;
                //    bookingManager.addBooking(new Booking(3, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 2), 2, 1, true));


                System.out.println(guest4.getName() +" narozena "+ guest4.getBorn() + " má rezervaci" + " od " + booking4.getDateStart() + " do " + booking4.getDateEnd() + " na pokoji " + booking4.getNumberRooms() + " , kde ubytováno bude " + booking4.getCountGuestInRoom() + " hostů pracovně " + booking4.isWorkingStay());;
                            //Alena Krasova dalších 7 rezervací po 5 dnech v následujích měsicích LocalDate.plusMonths()
                //   bookingManager.addBooking(new Booking(4, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 5), 1, 1, false));


               //ABCRelax další 3 třídenní pobyty od 8.15,21.srpna
                 {System.out.println(guest3.getName() +" zalozena "+ guest3.getBorn() + " má rezervaci" + " od " + booking5.getDateStart() + " do " + booking5.getDateEnd() + " na pokoji " + booking5.getNumberRooms() + " , kde ubytováno bude " + booking5.getCountGuestInRoom() + " hostů pracovně " + booking5.isWorkingStay());;
                 //   bookingManager.addBooking(new Booking(5, LocalDate.of(2023, 8, 1), LocalDate.of(2023, 8, 4), 2, 1, true));



                    ArrayList<Booking> allWorkingStay = bookingManager.getAllBooking();
                    for (Booking booking : allWorkingStay) ;
                    {
                        System.out.println("Počet pracovních pobytů je " + allWorkingStay.size());}
                            }


            //ABCRelax dalsích 30jednodenních pobytů
            int limitrezervationABCRelax = 30;
            int rezervationABCRelax;
            //  LocalDate jedenDen =LocalDatePLusDays(1);
            int getDayOfYear=1;
               //     Booking booking = bookingManager.addBooking(new Booking("" + 1, LocalDateplusDays(1)));



              //  for(Booking booking: allBooking);{for (int i=1; i <= 30; i++) ; {bookingManager.addBooking(new Booking(+1,LocalDate.of(2023,6,1),LocalDate.of(2023,6,2),2,1,true));}
                //    System.out.println(guest3.getName()+" zalozena(a) "+guest3.getBorn()+" má rezervaci"+" od "+Booking.getDateStart(DatePlusDays(1))+" do "+Booking.getDateEnd()+" na pokoji "+ Booking.getNumberRooms()+" , kde ubytováno bude "+Booking.getCountGuestInRoom()+" hostů pracovně "+ Booking.isWorkingStay());
             //   for(Booking booking: allBooking)
               //  if (int i<int limitrezervationABCRelax)

                      // {System.out.println(guest3.getName()+" zalozena(a) "{if (int i<=30)}+bookingManager.addBooking(new Booking(+1,LocalDate.of(2020,6,2), LocalDate.ofYearDay(0,1),2,1,true)));
                        ;
          //       } else {
            //        int i = 30;
          //       } {System.out.println(bookingManager.addBooking(new Booking(+1,LocalDate.EPOCH.plusDays(1), LocalDate.ofYearDay(0,1),2,1,true)));
                   //     }



                    //         for (Guest guest:guestList);{
        //    System.out.println(guest1.getName()+" narozen(a) "+guest1.getBorn()+" má rezervaci");








     //    bookingManager.addGuest(new Guest("Karel Dvorak",LocalDate.of(1990,5,15)));

    //    ArrayList<Guest>allGuest=bookingManager.getAllGuest();
    //    for(Guest guest:allGuest);{
    //        System.out.println(allGuest.size());}
   //     for(Guest guest:allGuest){
   //         System.out.println(AllGuest.getName());}
     //   for(int i=1;i<10;i++){
    //        System.out.println();      //  bookingManager.addGuest(new Guest("Karel Dvorak",LocalDate.of(1979,3,1)));
    //    }
}}

















