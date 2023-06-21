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

    public Booking(int id, LocalDate dateStart, LocalDate dateEnd, int numberRooms, int countGuestInRoom, boolean workingStay) {
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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










