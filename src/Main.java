import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Main {


    public static void main(String... args){


        int rezervationABCRelax;{
            for(int i = 1; i<=30;i++);}


        // if(i<30)return =+1;
        // return rezervationABCRelax
        //    for(int i=1,i<=limitrezervationABCRelax,i++);{
        //       rezervationABCRelax +1;}

        int limitrezervationABCRelax=30;


        BookingManager bookingManager =new BookingManager();



      bookingManager.addBooking(new Booking(1, LocalDate.of(2023,6,1),LocalDate.of(2023,6,7),3,5,true));
       bookingManager.addBooking(new Booking(2,LocalDate.of(2023,8,18),LocalDate.of(2023,8,21),2,2,false));

       //ABCRelax dalsích 30jednodenních pobytů
       bookingManager.addBooking (new Booking(3,LocalDate.of(2023,6,1),LocalDate.of(2023,6,2),2,1,true));

       //Alena Krasova dalších 7 rezervací po 5 dnech v následujích měsicích
       bookingManager.addBooking(new Booking(4,LocalDate.of(2023,6,1),LocalDate.of(2023,6,5),1,1,false));

       //ABCRelax další 3 třídenní pobyty od 8.15,21.srpna
        bookingManager.addBooking(new Booking(5,LocalDate.of(2023,8,1),LocalDate.of(2023,8,4),2,1,true));





         bookingManager.addGuest(new Guest("Karel Dvorak",LocalDate.of(1990,5,15)));
        bookingManager.addGuest(new Guest("Karel Dvorak",LocalDate.of(1979,3,1)));

        ArrayList<Guest>allGuest=bookingManager.getAllGuest();
        for(Guest guest:allGuest);{
            System.out.println(allGuest.size());}


       bookingManager.addRoom(new Room(1, 1, true, true, BigDecimal.valueOf(1000)));
      bookingManager.addRoom(new Room(2,1,true,true,BigDecimal.valueOf(1000)));
       bookingManager.addRoom(new Room(3,3,false,true,BigDecimal.valueOf(2400)));



    ArrayList<Booking>allBooking=bookingManager.getAllBooking();
    for(Booking booking :allBooking);{
            //System.out.println("Počet rezervaci je "+  allBooking.size());
            System.out.println(booking.getDateStart());}}







    }





