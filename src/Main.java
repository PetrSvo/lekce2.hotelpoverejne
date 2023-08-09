import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Main {



    public static  void main (String... args) {


        List<Room> roomList = new ArrayList<>();
        Room room1 = new Room(1, 1, true, true, BigDecimal.valueOf(1000));
        Room room2 = new Room(2, 1, true, true, BigDecimal.valueOf(1000));
        Room room3 = new Room(3, 3, false, true, BigDecimal.valueOf(2400));

        List<Guest> guestList = new ArrayList<>();
        Guest guest1 = new Guest("Karel Dvorak", LocalDate.of(1990, 5, 15));
        Guest guest2 = new Guest("Karel Dvorak", LocalDate.of(1990, 2, 5));
        Guest guest3 = new Guest("Cestovní kancelář ABC Relax", LocalDate.of(2020, 5, 30));
        Guest guest4 = new Guest("Alena Krasova", LocalDate.of(2002, 5, 30));

        List<Booking> bookingList = new ArrayList<>();
        Booking booking1 = new Booking(1, 3, "Karel Dvorak", "Karel Dvořak",
                LocalDate.of(2023, 6, 1),
                LocalDate.of(2023, 6, 7), 3, 5, true,"ano");
        bookingList.add(booking1);

        Booking booking2 = new Booking(2, 2, "Karel Dvorak", "Karel Dvorak",
                LocalDate.of(2023, 8, 18),
                LocalDate.of(2023, 8, 21), 2, 2, false,"Ne");
        bookingList.add(booking2);


        System.out.println(guest1.getName() + " narozen(a) "
                + guest1.getBorn() + " má rezervaci" + " od "
                + booking1.getDateStart() + " do "
                + booking1.getDateEnd() + " na pokoji "
                + booking1.getNumberRooms() + " , kde ubytováno bude "
                + booking1.getNumberOfGuests() + " hostů pracovně "
                + booking1.getWorkingStayText() + " má lůžek "
                + room1.getBeeds() + " s balkonem "
                + room1.isBalkon() + " výhledem na moře "
                + room1.isSeaView());


        System.out.println(guest2.getName() + " narozen(a) "
                + guest2.getBorn() + " má rezervaci" + " od "
                + booking2.getDateStart() + " do "
                + booking2.getDateEnd() + " na pokoji "
                + booking2.getNumberRooms() + " , kde ubytováno bude "
                + booking2.getNumberOfGuests() + " hostů pracovně "
                + booking2.getWorkingStayText() + " má lůžek "
                + room2.getBeeds() + " s balkonem "
                + room2.isBalkon() + " výhledem na moře "
                + room2.isSeaView());


        for (int den = 1; den <= 29; den++) {
            Booking booking3 = new Booking(3, 2, "CK Abc", " CK Abc",
                    LocalDate.of(2023, 6, den),
                    LocalDate.of(2023, 6, den + 1),
                    2, 1,true, "ano");
            bookingList.add(booking3);
        }


        for (Booking booking3 : bookingList) {
            System.out.println(//guest3.getName() + " zalozena "
                    //          + guest3.getBorn() + " má rezervaci od "
                    booking3.getDateStart() + " do "
                            + booking3.getDateEnd() + " na pokoji "
                            + booking3.getNumberRooms() + " , kde ubytováno bude "
                            + booking3.getNumberOfGuests() + " hostů pracovně "
                            + booking3.getWorkingStayText());

        }


        int Months;
        for (Months = 6; Months <= 12; Months++) {
            Booking booking4 = new Booking(4, 1, "Alena Karasova", "Alena Karasova",
                    LocalDate.of(2023, Months, 1),
                    LocalDate.of(2023, Months, 5), 1, 1,false, "ne");

            bookingList.add(booking4);
        }

        for (Booking booking4 : bookingList) {
            System.out.println(//guest4.getName() + " zalozena "
                    // + guest4.getBorn() + " má rezervaci" + " od "
                    booking4.getDateStart() + " do "
                            + booking4.getDateEnd() + " na pokoji "
                            + booking4.getNumberRooms() + " ,kde ubytováno bude "
                            + booking4.getNumberOfGuests() + " hostů pracovně "
                            + booking4.getWorkingStayText());
        }

        for (int den = 1; den <= 22; den = den + 7) {
            Booking booking5 = new Booking(5, 2, "CK Abc", " CK Abc",
                    LocalDate.of(2023, 8, den),
                    LocalDate.of(2023, 8, den + 4),
                    2, 1, true, "ano");

            bookingList.add(booking5);
        }

        for (Booking booking5 : bookingList) {
            System.out.println((//guest3.getName() + " zalozena "
                    //            + guest3.getBorn() + " má rezervaci" + " od "
                    booking5.getDateStart()) + " do "
                    + booking5.getDateEnd() + " na pokoji "
                    + booking5.getNumberRooms() + ", kde ubytováno bude"
                    + booking5.getNumberOfGuests() + " hostů pracovně "
                    + booking5.getWorkingStayText());


        }


        //Vypis pocet rezervaci -pro getNumberOfBooking
        System.out.println("Počet rezervaci je " + bookingList.size());


        //Vypis pro pracovni pobyty
        for (Booking booking : bookingList) {
            if (booking.isWorkingStay) {
                System.out.println(booking + " je pracovní pobyt");
            } else {
                System.out.println(booking + "je dovolena");
            }
        }

        //Vypis pro počet hostu na pokoji dane rezervace
        System.out.println("Pocet hostu na pokoji rezervace " + booking1.getIndex() + " je "
                + booking1.getNumberOfGuests());

        System.out.println("Pocet hostu na pokoji rezervace " + booking2.getIndex() + " je "
                + booking2.getNumberOfGuests());

        for (Booking booking3 : bookingList) {
            System.out.println("Pocet hostu na pokoji rezervace " + booking3.getIndex() + " je "
                    + booking3.getNumberOfGuests());
        }


        for (Booking booking4 : bookingList) {
            System.out.println("Pocet hostu na pokoji rezervace " + booking4.getIndex() + " je "
                    + booking4.getNumberOfGuests());
        }


        for (Booking booking5 : bookingList) {
            System.out.println("Pocet hostu na pokoji rezervace " + booking5.getIndex() + " je "
                    + booking5.getNumberOfGuests());
        }


        //Mazani z bookingManageru - výpis z tridy Booking odendán, pro booking3 nefunguje

        bookingList.remove(booking2);
        System.out.println("Smazana rezervace " + bookingList.remove(booking2));


        //Vypis Ano/Ne u pracovních pobytů

        System.out.println(booking1.notIsWorkingStay());
        System.out.println(booking2.notIsWorkingStay());

        {
            for(Booking booking3: bookingList)
                {
                    System.out.println(booking3.notIsWorkingStay());
                }

            for(Booking booking4: bookingList)
            {
                System.out.println(booking4.notIsWorkingStay());
            }

        }

        //Vypis pracovních pobytů


        //List<Booking> bookingList = bookingManager.getBooking();
        bookingList.forEach(System.out::println);

       for(Booking bookingManager: bookingList)
       {
                  System.out.println(" Pocet pracovních pobytu je " + bookingManager.getNumberOfWorkingsBookings());
       }

        // Vypis prumerný počet hostů na rezervaci -

     //    bookingList = bookingManager.getBooking();
            bookingList.forEach(System.out::println);


            for   (Booking bookingManager:bookingList)
         {
            System.out.println("Průměrný pocet hostu na rezervaci je " + bookingManager.getAverageGuests());
        }

        //Vypis pro 8 pobytů pro dovolenou

          System.out.println("Prvních 8 pobytů pro dovolenou je " + bookingManager.getEightWorkingStay());



    }
}





















