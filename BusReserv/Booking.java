package BusReserv;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
	int passengerCount;
	String passergerName;
	int Busno;
	static int id =1;
	int passengerId;
	Booking(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Your name:");
		passergerName = sc.next();
		System.out.println("Enter the How many persons:");
	
		try {
		passengerCount = Integer.parseInt(sc.next());
		}
		catch (Exception e) {
			System.out.println(e + "so enter the valid input");
			break;
		}
		System.out.println("Enter the Bus Number:");
		passengerCount = Integer.parseInt(sc.next());
		passengerId = id++;
	}
	public boolean isAvail(ArrayList<Bus> buses, ArrayList<Booking> bookings, Booking p1) {
		int capacity =0;
		for(Bus b : buses) {
			if(b.Busno == p1.Busno) {
				capacity = b.cap;
				if(capacity >= p1.passengerCount) {
						b.cap -= p1.passengerCount;
						b.price *= p1.passengerCount;
						System.out.println();
						return true;
				}
			}
		}
		return false;
	}
	public static void BookingDetails(ArrayList<Booking>bookings) {
		System.out.println("Bookings Details...");
		for(Booking p : bookings) {
			System.out.println(p.passergerName +"  " +p.passengerId + "  " +p.Busno + " "+ p.passengerCount+"\n");
		}
	}

}