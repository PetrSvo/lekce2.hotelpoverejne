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
          System.out.println(BookingManager.getGuest()+ " se má(jí) ubytovat od " + BookingManager.getDateStart()+ " do " + BookingManager.getDateEnd() + " na pokoji  " + BookingManager.getRoomsRooms());
        System.out.println("Počet rezervaci je "+ bookingManagerList.size());}







        List<Rooms>RoomsList=new ArrayList<>();
        RoomsList.add(new Rooms(1, 1, true, true, BigDecimal.valueOf(1000)));
        RoomsList.add(new Rooms(2,1,true,true,BigDecimal.valueOf(1000)));
        RoomsList.add(new Rooms(3,3,false,true,BigDecimal.valueOf(2400)));


      //  System.out.println(RoomsList);
        {
        for(Rooms Rooms:RoomsList){
            System.out.println("číslo pokoje "+ Rooms.getNumber() + " má " + Rooms.getBeeds() + " lužka/lužek " + " balkon " + Rooms.isBalkon() + " výhledna na moře  " + Rooms.isSea() + " cena " +Rooms.getPrice()+ " Kč ");
        }}

        List<Guest> GuestList = new ArrayList<>();
        GuestList.add((new Guest("Adela Maliková","1990.13.3",true, 1))); // změnil jsem typ konsturktoru
        GuestList.add(new Guest("Jan Dvoracek", "1995.05.05.", false, 3)); //chci oba dva
       // GuestList.add(new Guest("Adela Malikova " + "Jan Dvoracek ", " 1990.13.03. " + "1995.05.05.", false, 1, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14)));
        //třidu rezervace ted nepotřebuji

       // System.out.println(GuestList);


        //System.out.println(GuestList);
        for(Guest Guest:GuestList){

          //  Guest.setName(String.valueOf(Guest1));//chtělo to String.valueOf, jinak cerveně podrzený Guest1, tak jsem to tam dal
          // Guest.setNarozeni(String.valueOf(Guest1));
            System.out.println(Guest.getName()+" narozen(a)"+Guest .getBorn());
        //  if (Guest.getDatumstart()=;
         //  return "nemá rezervaci")
         //   System.out.println(GuestList.size());
            }
        //mělo by to vypsat, jenze Guest1 je podrzeny, metoda toString vracela pochybně Main, tak jsem zkusil takto
       //System.out.println(GuestList);
      //  for(Guest Guest:GuestList){
     //       Guest.setName(""+Guest2);
      //   Guest.setNarozeni(""+Guest2);
      //      System.out.println(Guest.getName()+"narozen"+Guest.getNarozeni());
      }



    }//druhý zpusob převodu na text, asi odkazuju na něco jineho v ArrayListu
      //  RoomsList.clear();}//měl by se vymazat Rooms3, nejde zapsat -cervene,ale podrzeno a RoomList vypiše jen zavorky


      //  List<Rezervace>RezervaceList=new ArrayList<>();
      //  Rezervace Rezervace1=new Rezervace("prvni", LocalDate.of(2021,7,19),LocalDate.of(2021,7,26));
      //  Rezervace Rezervace2=new Rezervace("druha",LocalDate.of(2021,9,01),LocalDate.of(2021,9,14));
    //ListRezervace nepotřebuju, tak v podstatě mohu smazat








    //String vse;//ted bych měl pomoci setteru a  getteru v tridě Booking vše privolat, jen nevim jak




        //  Guest Adelaname=new Guest("Adela Malikova","1990.13.03",true);

       // System.out.println(new Guest("Adela Malikova","1990.13.03",true));//vytiskne se, ale uplně něco jineho, jde to jinak obejit?



