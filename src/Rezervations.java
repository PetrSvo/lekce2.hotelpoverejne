import java.time.LocalDate;

public class Rezervations {

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