package busbooking_ver_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    String name;
    int Busno;
    Date date;

    Booking() throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        this.name=in.next();
        System.out.println("Enter the BusNO : ");
        this.Busno=in.nextInt();
        System.out.println("Enter the date (dd-mm-yyyy); ");
        String dateInput=in.next();
        SimpleDateFormat dateFormat =new SimpleDateFormat("dd-MM-yyyy");
        try{
            date=dateFormat.parse(dateInput);
        }
        catch (ParseException e) {
            System.out.println("Error parsing the date. Please enter the date in the format dd-mm-yyyy.");
            this.date=null;

        }
    }
    public int isAvailable (ArrayList<Booking> booking,ArrayList<Bus> buses){
        int capacity=0;
        if(date==null){
            return 0 ;
        }
        for(Bus b:buses){
                if(b.getBusno()==Busno){
                    capacity=b.getcapacity();
                }
        }

        int booked=0;
        for(Booking book:booking){
            if(book.Busno==Busno && book.date.equals(date)){
                booked++;
            }
        }
        final int b = booked < capacity ? 1 : 2;
        return b;

    }
}
