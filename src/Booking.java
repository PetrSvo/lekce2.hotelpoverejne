import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Booking {
public static int nextId=1;
    int id;
   private Room room;
    private Guest guest;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private int numberRooms;
   private int countGuestInRoom;
   private boolean workingStay;




    List<Guest>otherGuest;
   List<Room>otherRoom;



    List<Guest> GuestList = new ArrayList<>();
    public void add(Guest newGuest){
    GuestList.add(newGuest);}

    List<Room> roomList =new ArrayList<>();
    public void add(Room newRoom){
        roomList.add(newRoom);









}
}









