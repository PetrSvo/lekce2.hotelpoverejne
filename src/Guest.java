import java.time.LocalDate;

public class Guest {
    String name;
    String born;//string protože, konstruktor v třídě Booking chtěl text, asi by lepe slo Local.Date.of

    boolean work;
    //int Room; prozatim pryč, dle doporuceni
    LocalDate datestart;
    LocalDate dateend;//pridal jsem do konstruktoru nejprve čislo pokoje a pak data pobytu




    public LocalDate getDatestart() {
        return datestart;
    }

    public void setDatestart(LocalDate datestart) {
        this.datestart = datestart;
    }

    public LocalDate getDateend() {
        return dateend;
    }

    public void setDateend(LocalDate dateend) {
        this.dateend = dateend;
    }

    public Guest(String name, String born, boolean work, int room, LocalDate datestart, LocalDate dateend) {
        this.name = name;
        this.born = born;
        this.work = work;
       // Room = room;
        this.datestart = datestart;
        this.dateend = dateend;
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
