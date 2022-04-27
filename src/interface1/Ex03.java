package interface1;

// 필드의 다형성

class Car {

	Tire tire = new HankookTire();
	
	public void run() {
		tire.roll();
	}
}

interface Tire {
	public abstract void roll();
}

class HankookTire implements Tire {
	@Override
	public void roll() {
		System.out.println("한국타이어가 굴러갑니다.");
	}
	
}

class KumhoTire implements Tire {
	@Override
	public void roll() {
		System.out.println("금호타이어가 굴러갑니다.");
	
	}
}

public class Ex03 {

	public static void main(String[] args) {
	
		Car myCar = new Car();
		myCar.run();
		
		myCar.tire = new KumhoTire(); // 필드의 다형성
		myCar.run();

	}

}
