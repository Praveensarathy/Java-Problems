package BusReserv;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();        
		
		buses.add(new Bus(1,2,200));
		buses.add(new Bus(3,42,230));
		buses.add(new Bus(2,43,240));
		for(Bus b : buses) {
			b.display();
		}
		do {
			System.out.println("1.Are you want book a tickets");
			System.out.println("2.Already Booked Tickets");
			System.out.println("3.Available Tickets");
			System.out.println("4.Cancellation");
			System.out.println("5. Exit...");
			int n = sc.nextInt();
			if(n==1) {
				int sum =0;
				for(Bus b : buses) {
					sum += b.cap;
				}
				if(sum==0) {
					System.out.println("Sorry All buses are booked please try another login..!");
				}
				Booking p1 = new Booking();
				System.out.println( "\n Pname  " + p1.passergerName +"\nid  "+p1.passengerId+"\nBusNo.  "+ p1.Busno + "\nPCount  "+ p1.passengerCount);
				if(p1.isAvail(buses,bookings,p1)) {					
					System.out.println("--------------"+p1.passergerName + "  You Booking is Confirmed\n");
                                                       
					bookings.add(p1);
				}
				else
					System.out.println("--------------sorry " + p1.Busno +" Busno tickets are already booked\n");
			}
			
			if(n==2) 
				Booking.BookingDetails(bookings);
			if(n==3) {
				for(Bus b : buses)
					b.display();
			}
			if(n==4) {
				System.out.println("Enter your BookingId");
				int id = sc.nextInt();
				Main.cancellation(id,bookings,buses);
				
			}
				
			if(n==5) {
				return;
			}
		}while(true);
	}
	public static void cancellation(int id,ArrayList<Booking>bookings,ArrayList<Bus>buses) {
		for(Booking p : bookings) {
			if(id==p.passengerId) {
				String name = p.passergerName;
				for(Bus b:buses) {
					if(p.Busno==b.Busno) {
						b.cap +=p.passengerCount;
						break;
					}
				}
				bookings.remove(p);
				System.out.println(name +" Your tickets are successfully Cancelled ...");
				break;
			}
			else
				System.out.println("your id is Not found");
		}
		
	}

}
