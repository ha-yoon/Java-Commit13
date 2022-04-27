package interface1;

import java.util.Scanner;

class LOLUser {
	
	LOLService service;
	
	public LOLUser(LOLService service) {
		this.service = service;
	}
	
	public void attack() {
		service.fight();
		
		if(service instanceof RangeDealer) {
			RangeDealer rangeDealer = (RangeDealer)service;
			rangeDealer.help();
		}
	}
}

interface LOLService {
	public abstract void fight();
}

abstract class LOLServiceImpl implements LOLService {
	String character;
	
	public LOLServiceImpl(String character) {
		this.character = character; 
	}
}


class Dealer extends LOLServiceImpl {

	public Dealer(String character) {
		super(character);
	}
	
	@Override
	public void fight() {
		System.out.println(character + "이(가) 몬스터를 공격합니다.");
	}
}

class RangeDealer extends LOLServiceImpl {

	public RangeDealer(String character) {
		super(character);
	}	
	
	@Override
	public void fight() {
		System.out.println(character + "이(가) 몬스터를 원거리 공격합니다.");
	}
	
	public void help() {
		System.out.println(character + "이(가) 서포터한테 도움을 요청합니다.");
	}
}



public class Ex06 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.근거리딜러 2.원거리딜러");
		
		int choice = scan.nextInt();
		
		if(choice == 1) {
			
			System.out.print("캐릭터이름: ");
			String charname = scan.next();
			LOLService myLOL = new Dealer(charname);
			
			LOLUser user = new LOLUser(myLOL);
			
			System.out.println("환영합니다😊" + charname + "님");
			System.out.println("몬스터를 잡을까요? 1.YES 2.NO");
			int choice2 = scan.nextInt();
			
			if(choice2 != 1) {
				System.out.println("몬스터에 의해 사망하였습니다.");
				System.exit(0);
			}
			
			user.attack();
			
		}else if(choice == 2) {
			
			System.out.print("캐릭터이름: ");
			String charname = scan.next();
			LOLService myLOL = new RangeDealer(charname);
			
			LOLUser user = new LOLUser(myLOL);
			
			System.out.println("환영합니다😊" + charname + "님");
			System.out.println("몬스터를 잡을까요? 1.YES 2.NO");
			int choice2 = scan.nextInt();
			
			if(choice2 != 1) {
				System.out.println("몬스터에 의해 사망하였습니다.");
				System.exit(0);
			}
			
			user.attack();
			
			
			
		}else {
			System.out.println("입력 오류 입니다.");
		}
		

	}

}
