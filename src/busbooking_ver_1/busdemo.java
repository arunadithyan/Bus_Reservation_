package busbooking_ver_1;

import java.text.ParseException;
import java.util.*;

public class busdemo {
    public static void main(String[] args) throws ParseException {
        ArrayList<Bus> buses=new ArrayList<Bus>();
        ArrayList<Booking> passenger =new ArrayList<>();
        //creating the buses
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,true,50));
        buses.add(new Bus(2,false,60));
        //printing buses
        for(Bus b:buses){
            b.displayinfo();
        }
        int useropt=1;
        while(useropt==1){
            System.out.println("Enter 1 to BOOK and 2 to Exit");
            Scanner in = new Scanner(System.in);
            useropt=in.nextInt();
            if(useropt==1){
                System.out.println("Booking.....");
                Booking booking =new Booking();
                if(booking.isAvailable(passenger,buses)==1){
                    passenger.add(booking);
                    System.out.println("Your Booking is Confirmed ");
                }else if (booking.isAvailable(passenger,buses)==0){
                    System.out.println("Retry in correct format");
                }else{
                    System.out.println("Sorry!Try another bus or date");
                }
            }
            if(useropt==2){
                System.out.println("Thank you");

            }
        }
    }
}
