import java.time.LocalDate;
import java.util.ArrayList;


public class Booking {


    private static int nextIndex = 1;
    int index;
    private int room;
    private String guest;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private int numberRooms;
    private int numberOfGuests;
    private boolean workingStay;
    private LocalDate startDateRezervation;
    private LocalDate endDateRezervation;

   // public Booking(int index, String i, String guest, LocalDate dateStart, LocalDate dateEnd, int numberRooms, int numberOfGuests, boolean workingStay) {
  //  }


    public static void setNextIndex(int nextIndex) {
        Booking.nextIndex = nextIndex;
    }

    public void setStartDateRezervation(LocalDate startDateRezervation) {
        this.startDateRezervation = startDateRezervation;
    }

    public void setEndDateRezervation(LocalDate endDateRezervation) {
        this.endDateRezervation = endDateRezervation;
    }

    public LocalDate getStartDateRezervation() {
        return startDateRezervation;
    }



    public LocalDate getEndDateRezervation() {
        return endDateRezervation;
    }


    private LocalDate OneDay;


    private String otherGuest= String.valueOf(new ArrayList<>());

    public String getGuest() {
        return otherGuest.toString();
    }

    public void setGuest() {
        setGuest(null);
    }

    public void setGuest(Guest guest) {
        this.guest = String.valueOf(guest);
    }

    public String getOtherGuest() {
        return otherGuest;
    }

    public void setOtherGuest(String otherGuest) {
        this.otherGuest = otherGuest;
    }

    public LocalDate getOneDay() {for (int id = 1; id <= 30; id++)
        return getDateStart().plusDays(1);
       return getOneDay().plusDays(1);
    }



    public void setOneDay(LocalDate oneDay) {
        OneDay = oneDay;
    }


   // Metoda pro vracení počtu hostu na pokoji
    public String add(Booking getNumberOfGuests)
    { return getNumberOfGuests.getOtherGuest();}






    public Booking(int index, int room, String guest, String otherGuest, LocalDate dateStart, LocalDate dateEnd, int numberRooms, int numberOfGuests, boolean workingStay) {
        this.index = index;
        this.room = room;
        this.guest = guest;
        this.otherGuest = otherGuest;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.numberRooms = numberRooms;
        this.numberOfGuests = numberOfGuests;
        this.workingStay = workingStay;

    }



    public Booking(int index, Guest guest, String otherGuest, LocalDate dateStartRezervation, LocalDate dateEndRezervation, int numberRooms, int numberOfGuests, boolean workingStay) {
       this.index = index;
       this.guest= String.valueOf(guest);
       this.otherGuest=otherGuest;
       this.dateStart = dateStartRezervation;
     this.dateEnd = dateEndRezervation;
     this.numberRooms = numberRooms;
    this.numberOfGuests = numberOfGuests;
     this.workingStay = workingStay;
    }
    public static int getNextIndex() {
        return nextIndex;
    }

    public static void setNextId(int nextIndex) {
        Booking.nextIndex = nextIndex;
    }

    public  LocalDate getDateEnd() {return dateEnd;
    }

    public static LocalDate getLocalDatePlusDays() {
        return getLocalDatePlusDays();
    }

    @Override
    public String toString() {
        return "Booking{" +
                "index=" + index +
                ", room=" + room +
                ", guest=" + guest +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", numberRooms=" + numberRooms +
                ", numberOfGuests=" + numberOfGuests +
                ", workingStay=" + workingStay +
                ", startDateRezervation=" + startDateRezervation +
                ", endDateRezervation=" + endDateRezervation +
                ", OneDay=" + OneDay +
                ", otherGuest=" + otherGuest +
                '}';
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
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

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public boolean isWorkingStay() {
        return workingStay;
    }

    public void setWorkingStay(boolean workingStay) {
        this.workingStay = workingStay;
    }
}










