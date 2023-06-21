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
       // bookingList.add(new Booking(2,LocalDate.of(2023,8,18),LocalDate.of(2023,8,21),2,2,false));



        List<Guest> guestList = new ArrayList<>();

        guestList.add(new Guest("Karel Dvorak",LocalDate.of(1990,5,15)));
        guestList.add(new Guest("Karel Dvorak",LocalDate.of(1979,3,1)));

        List<Room> roomList =new ArrayList<>();
        roomList.add(new Room(1, 1, true, true, BigDecimal.valueOf(1000)));
        roomList.add(new Room(2,1,true,true,BigDecimal.valueOf(1000)));
        roomList.add(new Room(3,3,false,true,BigDecimal.valueOf(2400)));




   //   for(Booking Booking : bookingList)
  //      System.out.println("Počet rezervaci je "+ bookingList.size());
    }}





