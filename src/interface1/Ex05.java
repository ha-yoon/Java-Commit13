package interface1;

import java.util.Scanner;

class Person {
	
	private String name;
	private int age;
	private String tel;
	private String address;

	
	public Person(String name, int age, String tel, String address) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.address = address;
	}
	
	public void profileInfo() {
		System.out.println("----------------------------");
		System.out.println(name + "나이: " + age);
		System.out.println(name + "전화번호: " + tel);
		System.out.println(name + "주소: " + address);
		System.out.println("----------------------------");
	}
}


interface PersonService {
	
	public abstract void personList(Person[] person);
	
	public abstract Person[] insert(int personSu);
}


class PersonServiceImpl implements PersonService {

	Scanner scan = new Scanner(System.in);

	
	
	@Override
	public void personList(Person[] person) {
		
		for(int i = 0; i < person.length; i++) {
			person[i].profileInfo();
		}
	}

	@Override
	public Person[] insert(int personSu) {
		
		Person[] person = new Person[personSu];
		
		for(int i = 0; i < personSu; i++) {
			
			System.out.println(i+1 + "번째 사람의 정보를 입력하세요");
			System.out.println("이름: ");
			String name = scan.next();
			
			System.out.println("나이: ");
			int age = scan.nextInt();
			
			System.out.println("전화번호: ");
			String tel = scan.next();
			
			System.out.println("주소: ");
			String address = scan.next();
			
			person[i] = new Person(name, age, tel, address);
		}
		
		return person;
	}
	
}



public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("사람 인원 수:");
		int su = scan.nextInt();
		
		PersonService ps = new PersonServiceImpl();
		
		Person[] person = ps.insert(su);
		
		ps.personList(person);
	}

}
