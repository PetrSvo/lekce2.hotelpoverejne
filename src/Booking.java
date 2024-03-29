import java.time.LocalDate;
import java.util.ArrayList;


public class Booking {


    private static int nextIndex = 1;
    private String workingStayText;
    public boolean isWorkingStay;
    int index;
    private int room;
    private String guest;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private int numberRooms;
    private int numberOfGuests;
    private LocalDate startDateRezervation;
    private LocalDate endDateRezervation;



    public void setWorkingStayText ()
    {
        workingStayText = isWorkingStayText();
    }

    public String getWorkingStayText ()
    {
        return workingStayText;
    }

    //  Mazani rezervace
    public static int clearBooking(int i) {
        return nextIndex;
    }


    public static void setNextIndex(int nextIndex)
    {
        Booking.nextIndex = nextIndex;
    }

    public static int getNextIndex()
    {
        return nextIndex;
    }

    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public  LocalDate getDateStart()
    {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart)
    {
        this.dateStart = dateStart;
    }

    public void setDateEnd(LocalDate dateEnd)
    {
        this.dateEnd = dateEnd;
    }


    public  LocalDate getDateEnd()
    {
        return dateEnd;
    }

    public int getNumberRooms()
    {
        return numberRooms;
    }

    public void setNumberRooms(int numberRooms)
    {
        this.numberRooms = numberRooms;
    }

    public int getNumberOfGuests()
    {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests)
    {
        this.numberOfGuests = numberOfGuests;
    }


    public boolean isWorkingStay(){
        return isWorkingStay;
    }

    public String isWorkingStayText()
    {
        if (isWorkingStay)
        {
            return ("ANO");
        } else
            {
                return ("Ne");
            }
    }



    public void setStartDateRezervation(LocalDate startDateRezervation)
    {
        this.startDateRezervation = startDateRezervation;
    }

    public void setEndDateRezervation(LocalDate endDateRezervation)
    {
        this.endDateRezervation = endDateRezervation;
    }

    public LocalDate getStartDateRezervation()
    {
        return startDateRezervation;
    }


    public LocalDate getEndDateRezervation()
    {
        return endDateRezervation;
    }


    private String otherGuest= String.valueOf(new ArrayList<>());

    public String getGuest()
    {
        return otherGuest.toString();
    }

    public void setGuest()
    {
        setGuest(null);
    }

    public void setGuest(Guest guest)
    {
        this.guest = String.valueOf(guest);
    }

    public String getOtherGuest()
    {
        return otherGuest;
    }

    public void setOtherGuest(String otherGuest)
    {
        this.otherGuest = otherGuest;
    }




    // Metoda pro vracení počtu hostu na pokoji
    public int add(Booking getNumberOfGuests)
    {
        return getNumberOfGuests();
    }


    // Metoda pobyt pracovni ANO/NE
     public String notIsWorkingStay()
    {
        for(Booking booking: BookingManager.bookingList)
        if(booking.isWorkingStay)
        {
            return "ANO";
        }

      else
                  {
                    return "NE";
                  }

        return "ANO";
    }




    public Booking(int index, int room, String guest, String otherGuest, LocalDate dateStart, LocalDate dateEnd, int numberRooms, int numberOfGuests, boolean workingStay, String workingStayText) {
        this.index = index;
        this.room = room;
        this.guest = guest;
        this.otherGuest = otherGuest;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.numberRooms = numberRooms;
        this.numberOfGuests = numberOfGuests;
        this.isWorkingStay = workingStay;
        this.workingStayText = workingStayText;
       


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
                ", workingStay=" + workingStayText +
                ", startDateRezervation=" + startDateRezervation +
                ", endDateRezervation=" + endDateRezervation +
                ", otherGuest=" + otherGuest +
                '}';
    }

    //  Pokus udelat metodu na pocet noci
    public long getDaysBetween()
    {
        //    for (Booking booking: BookingManager.bookingList)
        {
            // return booking.daysBetween;
        } return 0;
    };

    //  long daysBetween = ChronoUnit.DAYS.between(dateStart,dateEnd);


    //Pokus o celkovou cenu
    //  BigDecimal priceTotal=bookinList.getDaysBetween * roomList.getPrice;
    //  public void getPrice
    //  {
    //     BigDecimal priceTotal=bookinList.getDaysBetween * roomList.getPrice;
    //     return BookingManager.bookingList.priceTotal;
    //      }
}










