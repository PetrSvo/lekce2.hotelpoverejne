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

    private LocalDate OneDay;

    private List<Guest>otherGuest=new ArrayList<>();

    public String getGuest() {
        return guest.getName();
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public List<Guest> getOtherGuest() {
        return otherGuest;
    }

    public void setOtherGuest(List<Guest> otherGuest) {
        this.otherGuest = otherGuest;
    }

    public LocalDate getOneDay() {
        return LocalDate.now().plusDays(1);
    }
//  public static LocalDate getOneDay() {
  //      return getDateStart()+DatePlusDays(1);;
  //  }

    public void setOneDay(LocalDate oneDay) {
        OneDay = oneDay;
    }

    public Booking(int id, int i, String abc, LocalDate dateStart, LocalDate dateEnd, int numberRooms, int countGuestInRoom, boolean workingStay) {
        this.id = id;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.numberRooms = numberRooms;
        this.countGuestInRoom = countGuestInRoom;
        this.workingStay = workingStay;
    }

    public Booking(int id, Room room, Guest guest,List<Guest>otherGuest, LocalDate dateStart, LocalDate dateEnd, int numberRooms, int countGuestInRoom, boolean workingStay) {
        this.id = id;
        this.room = room;
        this.guest = guest;
        this.otherGuest = otherGuest;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.numberRooms = numberRooms;
        this.countGuestInRoom = countGuestInRoom;
        this.workingStay = workingStay;

    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Booking.nextId = nextId;
    }

    public  LocalDate getDateEnd() {return dateEnd;
    }

    public static LocalDate getLocalDatePlusDays() {
        return getLocalDatePlusDays();
    }


    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", room=" + room +
                ", guest=" + guest +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", numberRooms=" + numberRooms +
                ", countGuestInRoom=" + countGuestInRoom +
                ", workingStay=" + workingStay +
                ", OneDay=" + OneDay +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public  LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public int getNumberRooms() {
        return numberRooms;
    }

    public void setNumberRooms(int numberRooms) {
        this.numberRooms = numberRooms;
    }

    public int getCountGuestInRoom() {
        return countGuestInRoom;
    }

    public void setCountGuestInRoom(int countGuestInRoom) {
        this.countGuestInRoom = countGuestInRoom;
    }

    public boolean isWorkingStay() {
        return workingStay;
    }

    public void setWorkingStay(boolean workingStay) {
        this.workingStay = workingStay;
    }
}










