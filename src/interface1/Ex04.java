package interface1;



interface Vehicle {
	public abstract void run();
}

class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	public void checkFare() {
		System.out.println("승차요금을 확인합니다.");
	}
}

class Taxi implements Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}

class Driver {

	public void drive(Vehicle vehicle) {
	
		vehicle.run();

		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
	
	}
	
}



public class Ex04 {

	public static void main(String[] args) {

		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);

	}

}
