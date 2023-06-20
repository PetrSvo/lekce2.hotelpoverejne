import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String... args){



        {
            List<BookingManager> bookingManagerList =new ArrayList<>();


     //  bookingManagerList.add(new BookingManager(1,"Karel Dvorák",LocalDate.of(1990,5,15),LocalDate.of(2023,6,1),LocalDate.of(2023,6,7),3,1,true));
     //  bookingManagerList.add(new BookingManager(2,"Karel Dvorák",LocalDate.of(1979,3,1),LocalDate.of(2023,8,18),LocalDate.of(2023,8,21),2,1,false));






        //bookingManagerList.add(new BookingManager(1,"Adela Malikova", LocalDate.of(2021,7,19),LocalDate.of(2021,7,26),1));
       // bookingManagerList.add(new BookingManager(2,"Adela Malikova " + "Jan Dvoracek ", LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14),3));
        //System.out.println(bookingManagerList);


      for(BookingManager BookingManager : bookingManagerList)
          System.out.println(BookingManager.getGuest()+ " se má(jí) ubytovat od " + BookingManager.getDateStart()+ " do " + BookingManager.getDateEnd() + " na pokoji  " + BookingManager.getNumberRooms());
        System.out.println("Počet rezervaci je "+ bookingManagerList.size());}







        List<Room> roomList =new ArrayList<>();
        roomList.add(new Room(1, 1, true, true, BigDecimal.valueOf(1000)));
        roomList.add(new Room(2,1,true,true,BigDecimal.valueOf(1000)));
        roomList.add(new Room(3,3,false,true,BigDecimal.valueOf(2400)));



        {
        for(Room Room : roomList){
            System.out.println("číslo pokoje "+ Room.getNumber() + " má " + Room.getBeeds() + " lužka/lužek " + " balkon " + Room.isBalkon() + " výhledna na moře  " + Room.isSea() + " cena " + Room.getPrice()+ " Kč ");
        }}

        List<Guest> GuestList = new ArrayList<>();


       GuestList.add(new Guest("Adela Malikova",LocalDate.of(1990,03,13),true,1));
       GuestList.add(new Guest("Jan Dvoracek",LocalDate.of(1995,05,13),false,3));
        // GuestList.add(new Guest("Adela Malikova " + "Jan Dvoracek ", " 1990.13.03. " + "1995.05.05.", false, 1, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14)));






        for(Guest Guest:GuestList){


            System.out.println(Guest.getName()+" narozen(a)"+Guest .getBorn());
        //  if (Guest.getDatumstart()=;
         //  return "nemá rezervaci")
         //   System.out.println(GuestList.size());
            }


      //  for(Guest Guest:GuestList){
     //       Guest.setName(""+Guest2);
      //   Guest.setNarozeni(""+Guest2);
      //      System.out.println(Guest.getName()+"narozen"+Guest.getNarozeni());
      }



    }





