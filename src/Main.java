import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String... args)
    {
       //boolean Guest1;   //zda je ubytovaní host 1...
      // boolean Guest2;

        List<Rooms>RoomsList=new ArrayList<>();
        Rooms Rooms1=new Rooms(1,1,true,true, BigDecimal.valueOf(1000));
        Rooms Rooms2=new Rooms(2,1,true,true,BigDecimal.valueOf(1000));
        Rooms Rooms3=new Rooms(3,3,false,true,BigDecimal.valueOf(2400));


        System.out.println(RoomsList);


        }//druhý zpusob převodu na text, asi odkazuju na něco jineho v ArrayListu
      //  RoomsList.clear();}//měl by se vymazat Rooms3, nejde zapsat -cervene,ale podrzeno a RoomList vypiše jen zavorky


      //  List<Rezervace>RezervaceList=new ArrayList<>();
      //  Rezervace Rezervace1=new Rezervace("prvni", LocalDate.of(2021,7,19),LocalDate.of(2021,7,26));
      //  Rezervace Rezervace2=new Rezervace("druha",LocalDate.of(2021,9,01),LocalDate.of(2021,9,14));
    //ListRezervace nepotřebuju, tak v podstatě mohu smazat


        }





    //String vse;//ted bych měl pomoci setteru a  getteru v tridě Booking vše privolat, jen nevim jak




        //  Guest Adelaname=new Guest("Adela Malikova","1990.13.03",true);

       // System.out.println(new Guest("Adela Malikova","1990.13.03",true));//vytiskne se, ale uplně něco jineho, jde to jinak obejit?


    
