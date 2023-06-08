import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.math.BigDecimal;
public class Booking {
    private Rooms room;
    private Guest guest;
    private Rezervace rezervace;




    private List<Guest>GuestList=new ArrayList<>();
    //Guest Guest1=new Guest("Adela Malikova","1990.13.03.",true);
   // Guest Guest2= new Guest("Jan Dvoracek","1995.05.05.",false);//pridal jsem konstruktor s pokojem

  //pomoci adelaName tam nedostanu set.Name. chce to konstruktor, co s tím?

    Guest Guest1=new Guest("Adela Malikova","1990.13.03.",true,1,LocalDate.of(2021,7,19),LocalDate.of(2021,7,26));
   Guest Guest2= new Guest("Jan Dvoracek","1995.05.05.",false,3); //chci oba dva
    Guest Guest3=new Guest("Adela Malikova"+"Jan Dvoracek","1990.13.03."+"1995.05.05.",false,1,LocalDate.of(2021,9,1),LocalDate.of(2021,9,14));
    //třidu rezervace ted nepotřebuji

    private List<Rooms>RoomsList=new ArrayList<>();
    Rooms Rooms1=new Rooms(1,1,true,true,1000.0);
    Rooms Rooms2=new Rooms(2,1,true,true,1000.0);
    Rooms Rooms3=new Rooms(3,3,false,true,2400.0);


    private List<Rezervace>RezervaceList=new ArrayList<>();
    Rezervace Rezervace1=new Rezervace("prvni",LocalDate.of(2021,7,19),LocalDate.of(2021,7,26));
    Rezervace Rezervace2=new Rezervace("druha",LocalDate.of(2021,9,01),LocalDate.of(2021,9,14));

    public Guest getGuest1() {
        return Guest1;
    }

    public void setGuest1(Guest guest1) {
        Guest1 = guest1;
    }

    public Guest getGuest2() {
        return Guest2;
    }

    public Guest getGuest3() {
        return Guest3;
    }

    public void setGuest3(Guest guest3) {
        Guest3 = guest3;
    }

    public void setGuest2(Guest guest2) {
        Guest2 = guest2;
    }

    public Rooms getRooms1() {
        return Rooms1;
    }

    public void setRooms1(Rooms rooms1) {
        Rooms1 = rooms1;
    }

    public Rooms getRooms2() {
        return Rooms2;
    }

    public void setRooms2(Rooms rooms2) {
        Rooms2 = rooms2;
    }

    public Rooms getRooms3() {
        return Rooms3;
    }

    public Rezervace getRezervace1() {
        return Rezervace1;
    }

    public void setRezervace1(Rezervace rezervace1) {
        Rezervace1 = rezervace1;
    }

    public Rezervace getRezervace2() {
        return Rezervace2;
    }

    public void setRezervace2(Rezervace rezervace2) {
        Rezervace2 = rezervace2;
    }

    public void setRooms3(Rooms rooms3) {
        Rooms3 = rooms3;
    }
}









