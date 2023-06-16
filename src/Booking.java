import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.math.BigDecimal;



public class Booking {

   private Rooms room;  //odendal jsem private a getry a setry, který v Listu nemají význam
    private Guest guest;




    List<Guest> GuestList = new ArrayList<>();
    public void add(Guest newGuest){  //dal jsem bokem, při vypisu bylo červeny
    GuestList.add(newGuest);}

    List<Rooms>RoomsList=new ArrayList<>();
    public void add(Rooms newRooms){
        RoomsList.add(newRooms);






        //Guest Guest1=new Guest("Adela Malikova","1990.13.03.",true);
    // Guest Guest2= new Guest("Jan Dvoracek","1995.05.05.",false);//pridal jsem konstruktor s pokojem

    //pomoci adelaName tam nedostanu set.Name. chce to konstruktor, co s tím?


}
}









