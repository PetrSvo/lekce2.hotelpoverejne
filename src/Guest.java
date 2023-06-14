import java.time.LocalDate;

public class Guest {
    String name;
    String narozeni;//string protože, konstruktor v třídě Booking chtěl text, asi by lepe slo Local.Date.of

    boolean work;
    //int Room; prozatim pryč, dle doporuceni
    LocalDate datumstart;
    LocalDate datumend;//pridal jsem do konstruktoru nejprve čislo pokoje a pak data pobytu


    public LocalDate getDatumstart() {
        return datumstart;
    }

    public void setDatumstart(LocalDate datumstart) {
        this.datumstart = datumstart;
    }

    public LocalDate getDatumend() {
        return datumend;
    }

    public void setDatumend(LocalDate datumend) {
        this.datumend = datumend;
    }

    public Guest(String name, String narozeni, boolean work, int room, LocalDate datumstart, LocalDate datumend) {
        this.name = name;
        this.narozeni = narozeni;
        this.work = work;
       // Room = room;
        this.datumstart = datumstart;
        this.datumend = datumend;
    }


    public Guest(String name, String narozeni, boolean work, int room) {
        this.name = name;
        this.narozeni = narozeni;
        this.work = work;
      //  Room = room;
    }

    public Guest(String name, String narozeni, boolean work) {
        this.name = name;
        this.narozeni = narozeni;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNarozeni() {
        return narozeni;
    }

    public void setNarozeni(String narozeni) {
        this.narozeni = narozeni;
    }

    public boolean isWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }
}
