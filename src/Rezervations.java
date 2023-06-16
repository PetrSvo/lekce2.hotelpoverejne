import java.time.LocalDate;

public class Rezervations {

    public static int nextID=1;
int id;

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        Rezervations.nextID = nextID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Rezervations(int id, String guest, LocalDate dateStart, LocalDate dateEnd, int rooms) {
        this.id = id;
        Guest = guest;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        Rooms = rooms;
    }

    @Override
    public String toString() {
        return "Rezervations{" +
                "id=" + id +
                ", Guest='" + Guest + '\'' +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", Rooms=" + Rooms +
                '}';
    }

    String Guest;
LocalDate dateStart;
LocalDate dateEnd;
int Rooms;

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

    public int getRooms() {
        return Rooms;
    }

    public void setRooms(int rooms) {
        Rooms = rooms;
    }

    public Rezervations(String guest, LocalDate dateStart, LocalDate dateEnd, int rooms) {
        Guest = guest;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        Rooms = rooms;
    }
}