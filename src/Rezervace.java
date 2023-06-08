import java.time.LocalDate;

public class Rezervace {

    String poradi;
    LocalDate datumstart;
    LocalDate datumend;


    public Rezervace(String poradi, LocalDate datumstart, LocalDate datumend) {
        this.poradi = poradi;
        this.datumstart = datumstart;
        this.datumend = datumend;
    }
}
