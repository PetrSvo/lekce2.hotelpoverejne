import java.time.LocalDate;

public class Guest {
    String name;
    LocalDate born;//string protože, konstruktor v třídě Booking chtěl text, asi by lepe slo Local.Date.of

    boolean work;
    LocalDate dateStart;
    LocalDate dateEnd;

    public Guest(String name, LocalDate born) {
        this.name = name;
        this.born = born;
    }
    //měl bych použit tenhle konstruktor, zacatek a konec pobytu bych mohl dat do BookingManager

    public Guest(String name, LocalDate born, boolean work) {
        this.name = name;
        this.born = born;
        this.work = work;
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

    public Guest(String name, LocalDate born, boolean work, int room, LocalDate dateStart, LocalDate dateEnd) {
        this.name = name;
        this.born = born;
        this.work = work;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }


    public Guest(String name, LocalDate born, boolean work, int room) {
        this.name = name;
        this.born = born;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBorn() {
        return born;
    }

    public void setBorn(LocalDate born) {
        this.born = born;
    }

    public boolean isWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }}
