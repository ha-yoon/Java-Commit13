package interface1;

// 인터페이스(interface)


interface Animal {
	
	public static final int MAX_AGE = 500;
	public abstract void sound();


	public default void defaultMethod() {
		System.out.println("디폴트 메소드");
	}
	// default 메소드

}

class Cat implements Animal {
	
	@Override
	public void sound() {
		System.out.println("냥냥");
	}
}

class Dog implements Animal {
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}



public class Ex01 {

	public static void main(String[] args) {
	
		
		Cat myCat = new Cat();
		myCat.sound();
		
		Dog myDog = new Dog();
		myDog.sound();
		System.out.println();
		
		Animal myAnimal = new Cat();
		myAnimal.sound();
	
		myAnimal = new Dog();
		myAnimal.sound();
	
		
		Animal[] myAnimals = new Animal[2]; 
	
		myAnimals[0] = new Cat();
		myAnimals[1] = new Dog();
		
		myAnimals[0].sound();
		myAnimals[1].sound();
	}

}
