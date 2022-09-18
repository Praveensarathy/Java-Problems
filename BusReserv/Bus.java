package BusReserv;

public class Bus {
	int Busno;
	int cap;
	int price;
	public Bus(int BusNo , int capacity,int price) {
		Busno = BusNo;
		cap = capacity;
		price = price;
	}
	public void display() {
		System.out.println("busNo :" + Busno + "Capacity:" + cap);
	}
}
