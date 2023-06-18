import java.time.LocalDate;

public class BookingManager {


    public static int nextID=1; //zatim si necham, mohlo by pak posloužit pro vypis sumy rezervaci
    int id;
    String Guest;
    LocalDate bornGuest;
    LocalDate dateStart;
    LocalDate dateEnd;
    int RoomsRooms;
    int countGuestInRoom;
    boolean workingStay;

    int rezervationABCRelax;{
        for(int i = 1; i<=30;i++);}







    public BookingManager(int id, String guest, LocalDate bornGuest, LocalDate dateStart, LocalDate dateEnd, int roomsRooms, int countGuestInRoom, boolean workingStay) {
        this.id = id;
        Guest = guest;
        this.bornGuest = bornGuest;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        RoomsRooms = roomsRooms;
        this.countGuestInRoom = countGuestInRoom;
        this.workingStay = workingStay;
    }


    public int getRezervationABCRelax() {
        return rezervationABCRelax;
    }

    public void setRezervationABCRelax(int rezervationABCRelax) {
        this.rezervationABCRelax = rezervationABCRelax;
    }

    public BookingManager(int id, String guest, LocalDate bornGuest, LocalDate dateStart, LocalDate dateEnd, int roomsRooms, int countGuestInRoom, boolean workingStay, int rezervationABCRelax) {
        this.id = id;
       Guest = guest;
        this.bornGuest = bornGuest;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        RoomsRooms = roomsRooms;
        this.countGuestInRoom = countGuestInRoom;
        this.workingStay = workingStay;
        this.rezervationABCRelax = rezervationABCRelax;
    }

    // if(i<30)return =+1;
   // return rezervationABCRelax
    //    for(int i=1,i<=limitrezervationABCRelax,i++);{
     //       rezervationABCRelax +1;}

    int limitrezervationABCRelax=30;








    public LocalDate getBornGuest() {
        return bornGuest;
    }

    public void setBornGuest(LocalDate bornGuest) {
        this.bornGuest = bornGuest;
    }

    public int getCountGuestInRoom() {
        return countGuestInRoom;
    }

    public void setCountGuestInRoom(int countGuestInRoom) {
        this.countGuestInRoom = countGuestInRoom;
    }

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        BookingManager.nextID = nextID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BookingManager(int id, String guest, LocalDate dateStart, LocalDate dateEnd, int rooms) {
        this.id = id;
        Guest = guest;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        RoomsRooms = rooms;
    }






    public String getGuest() {
        return Guest;
    }

    public void setGuest(String guest) {
        Guest = guest;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public int getRoomsRooms() {
        return RoomsRooms;
    }

    public void setRoomsRooms(int roomsRooms) {
        RoomsRooms = roomsRooms;
    }

    public BookingManager(String guest, LocalDate dateStart, LocalDate dateEnd, int roomsRooms) {
        Guest = guest;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        RoomsRooms = roomsRooms;
    }
}