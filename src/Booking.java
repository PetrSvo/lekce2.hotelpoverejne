import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Booking {


    private static int nextIndex = 1;
    int index;
    private Room room;
    private Guest guest;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private int numberRooms;
    private int numberOfGuests;
    private boolean workingStay;
    private LocalDate startDateRezervation;
    private LocalDate endDateRezervation;



    //    public static ArrayList<BookingManager> getBooking(int index)
  //  {

   //         for(int index= 1,int index <=30,int index++);

  //  {
   //     LocalDate StartRezervation = LocalDate.of(2020, 6, getIndex());
  //      LocalDate EndRezervation = LocalDate.of(2020, 6, getIndex()).plusDays(getIndex());
   //     return new ArrayList<BookingManager>();}}

    public LocalDate getStartDateRezervation() {
        return startDateRezervation;
    }

    public void setStartDateRezervation(LocalDate startDateRezervation) {
        this.startDateRezervation = startDateRezervation;
    }

    public LocalDate getEndDateRezervation() {
        return endDateRezervation;
    }

    public void setEndDateRezervation(LocalDate endDateRezervation) {
        this.endDateRezervation = endDateRezervation;
    }

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

    public LocalDate getOneDay() {for (int id = 1; id <= 30; id++)
        return getDateStart().plusDays(1);
       return getOneDay().plusDays(1);
    }

    //LocalDate Oneday=LocalDate.getDateStart.plusDays();


//  public static LocalDate getOneDay() {
  //      return getDateStart()+DatePlusDays(1);;
  //  }

    public void setOneDay(LocalDate oneDay) {
        OneDay = oneDay;
    }


   // Metoda pro vracení počtu hostu na pokoji
    public  List<Guest> add(Booking getNumberOfGuests)
    { return getNumberOfGuests.getOtherGuest();}

    public Booking(int index, int i,Room room, Guest guest, List<Guest>otherGuest, LocalDate startDateRezervation, LocalDate endDateRezervation, int numberRooms, int numberOfGuests, boolean workingStay) {
        this.index = index;
        this.room = room;
        this.guest = guest;
        this.otherGuest = otherGuest;
        this.startDateRezervation = startDateRezervation;
        this.endDateRezervation = endDateRezervation;
        this.numberRooms = numberRooms;
        this.numberOfGuests = numberOfGuests;
        this.workingStay = workingStay;
    }

    public Booking(int index, int i, String abc, LocalDate dateStartRezervation, LocalDate dateEndRezervation, int numberRooms, int numberOfGuests, boolean workingStay) {
        this.index = index;
        this.dateStart = dateStartRezervation;
        this.dateEnd = dateEndRezervation;
        this.numberRooms = numberRooms;
        this.numberOfGuests = numberOfGuests;
        this.workingStay = workingStay;
    }

    public Booking(int index, Room room, Guest guest, List<Guest>otherGuest, LocalDate dateStart, LocalDate dateEnd, int numberRooms, int numberOfGuests, boolean workingStay) {
        this.index = index;
        this.room = room;
        this.guest = guest;
        this.otherGuest = otherGuest;
        this.dateStart = getOneDay();
        this.dateEnd = dateEnd;
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
                "id=" + index +
                ", room=" + room +
                ", guest=" + guest +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", numberRooms=" + numberRooms +
                ", countGuestInRoom=" + numberOfGuests +
                ", workingStay=" + workingStay +
                ", OneDay=" + OneDay +
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










