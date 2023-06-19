import java.time.LocalDate;

public class Guest {
    String name;
    String born;//string protože, konstruktor v třídě Booking chtěl text, asi by lepe slo Local.Date.of

    boolean work;
    //int Room; prozatim pryč, dle doporuceni
    LocalDate dateStart;
    LocalDate dateEnd;//pridal jsem do konstruktoru nejprve čislo pokoje a pak data pobytu




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

    public Guest(String name, String born, boolean work, int room, LocalDate dateStart, LocalDate dateEnd) {
        this.name = name;
        this.born = born;
        this.work = work;
       // Room = room;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }


    public Guest(String name, String born, boolean work, int room) {
        this.name = name;
        this.born = born;
        this.work = work;
      //  Room = room;
    }

    public Guest(String name, String born, boolean work) {
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

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public boolean isWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }}
