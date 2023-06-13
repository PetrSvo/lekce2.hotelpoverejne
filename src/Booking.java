import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.math.BigDecimal;



public class Booking {
    public static void main(String... args){//pokud nebudu tisknout tak odendat
    Rooms room;  //odendal jsem private a getry a setry, který v Listu nemají význam
     Guest guest;

        {
     List<Guest> GuestList = new ArrayList<>();
    //Guest Guest1=new Guest("Adela Malikova","1990.13.03.",true);
    // Guest Guest2= new Guest("Jan Dvoracek","1995.05.05.",false);//pridal jsem konstruktor s pokojem

    //pomoci adelaName tam nedostanu set.Name. chce to konstruktor, co s tím?

    Guest Guest1 = new Guest("Adela Malikova", "1990.13.03.", true, 1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26));
    Guest Guest2 = new Guest("Jan Dvoracek", "1995.05.05.", false, 3); //chci oba dva
    Guest Guest3 = new Guest("Adela Malikova" + "Jan Dvoracek", "1990.13.03." + "1995.05.05.", false, 1, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14));
    //třidu rezervace ted nepotřebuji




     System.out.println(GuestList);
        for(Guest Guest:GuestList){
        Guest.setName(String.valueOf(Guest1));//chtělo to String.valueOf, jinak cerveně podrzený Guest1, tak jsem to tam dal
            Guest.setNarozeni(String.valueOf(Guest1));
            System.out.println(Guest.getName()+"narozen(a)"+Guest.getNarozeni()); }
            //mělo by to vypsat, jenze Guest1 je podrzeny, metoda toString vracela pochybně Main, tak jsem zkusil takto
            System.out.println(GuestList);
            for(Guest Guest:GuestList){
                Guest.setName(""+Guest2);
                Guest.setNarozeni(""+Guest2);
                System.out.println(Guest.getName()+"narozen"+Guest.getNarozeni());
            }//druhý zpusob převodu na text, asi odkazuju na něco jineho v ArrayListu

}}}









