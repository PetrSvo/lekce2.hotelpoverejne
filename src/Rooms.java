import java.math.BigDecimal;

public class Rooms {
    int number;
    int luzka;
    boolean balkon;
    boolean more;
    double price; //puvodně jsem měl BigDecimal, asi je to tady možná prozatim zbytecny, tak jsem zkusil double v konstruktoru v třidě Booking nechtělo Bigdecimal prijmout

    public Rooms(int number, int luzka, boolean balkon, boolean more, double price) {
        this.number = number;
        this.luzka = luzka;
        this.balkon = balkon;
        this.more = more;
        this.price = price;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLuzka() {
        return luzka;
    }

    public void setLuzka(int luzka) {
        this.luzka = luzka;
    }

    public boolean isBalkon() {
        return balkon;
    }

    public void setBalkon(boolean balkon) {
        this.balkon = balkon;
    }

    public boolean isMore() {
        return more;
    }

    public void setMore(boolean more) {
        this.more = more;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
