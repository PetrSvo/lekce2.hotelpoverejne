import java.math.BigDecimal;

public class Room {
    int number;
    int beeds;
    boolean balkon;
     boolean sea;
    BigDecimal price;

    public Room(int number, int beeds, boolean balkon, boolean sea, BigDecimal price) {
        this.number = number;
        this.beeds = beeds;
        this.balkon = balkon;
        this.sea = sea;
        this.price = price;
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBeeds() {
        return beeds;
    }

    public void setBeeds(int beeds) {
        this.beeds = beeds;
    }

    public boolean isBalkon() {
        return balkon;
    }

    public void setBalkon(boolean balkon) {
        this.balkon = balkon;
    }

    public boolean isSea() {
        return sea;
    }

    public void setSea(boolean sea) {
        this.sea = sea;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}