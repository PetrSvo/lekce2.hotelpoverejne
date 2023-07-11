import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Main {


    public static void main(String... args) {
        // BookingManager bookingManager = new BookingManager();


        List<Room> roomList = new ArrayList<>();
        Room room1 = new Room(1, 1, true, true, BigDecimal.valueOf(1000));
        Room room2 = (new Room(2, 1, true, true, BigDecimal.valueOf(1000)));
        Room room3 = (new Room(3, 3, false, true, BigDecimal.valueOf(2400)));

        List<Guest> guestList = new ArrayList<>();
        Guest guest1 = new Guest("Karel Dvorak", LocalDate.of(1990, 5, 15));
        Guest guest2 = new Guest("Karel Dvorak", LocalDate.of(1990, 5, 15));
        Guest guest3 = new Guest("Cestovní kancelář ABC Relax", LocalDate.of(2020, 5, 30));
        Guest guest4 = new Guest("Alena Krasova", LocalDate.of(2002, 5, 30));

        List<Booking> bookingList = new ArrayList<>();
        Booking booking1 = new Booking(1, 3, "Karel Dvorak", LocalDate.of(2023, 6, 1),
                LocalDate.of(2023, 6, 7), 3, 5, true);
        bookingList.add(booking1);

        Booking booking2 = new Booking(2, 2, "Karel Dvorak", LocalDate.of(2023, 8, 18),
                LocalDate.of(2023, 8, 21), 2, 2, false);
        bookingList.add(booking2);


            for (int den = 1; den <= 30; den++) {
                Booking booking3 =
                        new Booking(1, 2, " CK Abc",
                                LocalDate.of(2023, 6, den), LocalDate.of(2023, 6, den + 1),
                                2, 1, true);
                bookingList.add(booking3);
              for (den = 1; den <= 30; den++) {
                    //   {bookingList.add(booking3.getDateStart().plusDays(1);
                    //    return booking3.getDateStart();};
                   //   for(Booking booking: bookingList){
                    System.out.println(guest3.getName() + " zalozena " + guest3.getBorn() + " má rezervaci" +
                            " od " + booking3.getStartDateRezervation() + " do " + booking3.getEndDateRezervation()
                            + " na pokoji " + booking3.getNumberRooms() + " , kde ubytováno bude "
                            + booking3.getNumberOfGuests() + " hostů pracovně " + booking3.isWorkingStay());
               }
            }

            //}
            Booking booking4 = new Booking(1, 1, "Alena Karasova", LocalDate.of(2023, 6, 1),
                    LocalDate.of(2023, 6, 5), 1, 1, false);
            bookingList.add(booking4);
            for (int id = 1; id <= 7; id++) {
                bookingList.add((new Booking(1, 1, "Alena Karasova",
                        LocalDate.of(2023, 6, 1).plusMonths(1),
                        LocalDate.of(2023, 6, 5).plusMonths(1),
                        1, 1, false)));

                //       Booking clearbooking(4);

                System.out.println(guest4.getName() + " zalozena " + guest4.getBorn() + " má rezervaci" +
                        " od " + booking4.getDateStart().plusMonths(1) + " do " +
                        booking4.getDateEnd().plusMonths(1) + " na pokoji " + booking4.getNumberRooms()
                        + " , kde ubytováno bude " + booking4.getNumberOfGuests() + " hostů pracovně "
                        + booking4.isWorkingStay());
            }


            Booking booking5 = new Booking(1, 2, " CK Abc",
                    LocalDate.of(2023, 8, 1),
                    LocalDate.of(2023, 8, 4), 2, 1, true);
            bookingList.add(booking5);
            for (int id = 1; id <= 3; id++) {
                bookingList.add(new Booking(1, 2, "CK Abc",
                        LocalDate.of(2023, 8, 1).plusDays(7),
                        LocalDate.of(2023, 8, 4).plusDays(7),
                        2, 1, true));

                System.out.println((guest3.getName() + " zalozena " + guest3.getBorn() +
                        " má rezervaci" + " od " + booking5.getDateStart().plusDays(1)
                        + " do " + booking5.getDateEnd().plusDays(1) + " na pokoji " +
                        booking5.getNumberRooms() + " , kde ubytováno bude " + booking5.getNumberOfGuests()
                        + " hostů pracovně " + booking5.isWorkingStay()));
            }


            System.out.println("Počet rezervaci je " + bookingList.size());
            for (Booking booking : bookingList)
                if (booking.isWorkingStay()) {
                    System.out.println("Pracovní pobyt");
                }
            for (Booking booking : bookingList)
                if (!booking.isWorkingStay()) {
                    System.out.println("Dovolena");
                }

            System.out.println(guest1.getName() + " narozen(a) " + guest1.getBorn()
                    + " má rezervaci" + " od " + booking1.getDateStart() + " do " + booking1.getDateEnd()
                    + " na pokoji " + booking1.getNumberRooms() + " , kde ubytováno bude " + booking1.getNumberOfGuests()
                    + " hostů pracovně " + booking1.isWorkingStay() + " má lůžek " + room1.getBeeds() + " s balkonem "
                    + room1.isBalkon() + " výhledem na moře " + room1.isSeaView());


            System.out.println(guest2.getName() + " narozen(a) " + guest2.getBorn() + " má rezervaci" + " od "
                    + booking2.getDateStart() + " do " + booking2.getDateEnd() + " na pokoji "
                    + booking2.getNumberRooms() + " , kde ubytováno bude " + booking2.getNumberOfGuests()
                    + " hostů pracovně " + booking2.isWorkingStay() + " má lůžek " + room2.getBeeds()
                    + " s balkonem " + room2.isBalkon() + " výhledem na moře " + room2.isSeaView());

            System.out.println("Pocet hostu na pokoji je " + booking2.getNumberOfGuests());

            // for (Booking clearBooking : bookingList)

            System.out.println(BookingManager.getClearBooking(10));


            System.out.println(BookingManager.getNumberOfWorkingsBookings());

            //    System.out.println(guest3.getName() + " zalozena " + guest3.getBorn() + " má rezervaci" + " od " + booking3.getDateStart() + " do " + booking3.getDateEnd() + " na pokoji " + booking3.getNumberRooms() + " , kde ubytováno bude " + booking3.getCountGuestInRoom() + " hostů pracovně " + booking3.isWorkingStay());


            //    System.out.println(guest4.getName() +" narozena "+ guest4.getBorn() + " má rezervaci" + " od " + booking4.getDateStart() + " do " + booking4.getDateEnd() + " na pokoji " + booking4.getNumberRooms() + " , kde ubytováno bude " + booking4.getCountGuestInRoom() + " hostů pracovně " + booking4.isWorkingStay());;
            //Alena Krasova dalších 7 rezervací po 5 dnech v následujích měsicích LocalDate.plusMonths()

            //ABCRelax další 3 třídenní pobyty od 8.15,21.srpna
            //   {System.out.println(guest3.getName() +" zalozena "+ guest3.getBorn() + " má rezervaci" + " od " + booking5.getDateStart() + " do " + booking5.getDateEnd() + " na pokoji " + booking5.getNumberRooms() + " , kde ubytováno bude " + booking5.getCountGuestInRoom() + " hostů pracovně " + booking5.isWorkingStay());;

            //    ArrayList<Booking> allWorkingStay = bookingManager.getAllBooking();
            //    for (Booking booking : allWorkingStay)
            // System.out.println("Počet pracovních pobytů je " + allWorkingStay.size());}
        }

    }

















