import java.math.BigDecimal;

public class Room {
   private int number;
   private  int beeds;
   private boolean balkon;
   private  boolean seaView;
   private BigDecimal price;



    public Room(int number, int beeds, boolean balkon, boolean seaView, BigDecimal price) {
        this.number = number;
        this.beeds = beeds;
        this.balkon = balkon;
        this.seaView = seaView;
        this.price = price;
    }



    private int getNumber()
    {
        return number;
    }

    private void setNumber(int number)
    {
        this.number = number;
    }

    int getBeeds()
    {
        return beeds;
    }

    private void setBeeds(int beeds)
    {
        this.beeds = beeds;
    }

    boolean isBalkon()
    {
        return balkon;
    }

    private void setBalkon(boolean balkon)
    {
        this.balkon = balkon;
    }

    boolean isSeaView()
    {
    return seaView;
    }

    private void setSeaView(boolean seaView)
    {
        this.seaView = seaView;
    }

    private BigDecimal getPrice()
    {
        return price;
    }

    private void setPrice(BigDecimal price)
    {
        this.price = price;
    }
}
