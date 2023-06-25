import java.math.BigDecimal;

public class Room {
    int number;
    int beeds;
    boolean balkon;
     boolean seaView;
    BigDecimal price;



    public Room(int number, int beeds, boolean balkon, boolean seaView, BigDecimal price) {
        this.number = number;
        this.beeds = beeds;
        this.balkon = balkon;
        this.seaView = seaView;
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
        this.balkon = balkon;}

    public boolean isSeaView(){

    return seaView;}

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
