package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;
import test.mypac.YourWeapon;

public class MainClass02 {
	public static void main(String[] args) {
		// MyWeapon 객체를 생성해서 Weapon type 으로 받은 다음
		Weapon w1 = new MyWeapon(); // 추상 클래스 단독으로 실행은 못하지만 데이터 타입으로는 충실히 역활을 함
													// 데이터의 타입으로써 필요한 것은 가지고 있어서.
		// 메소드 호출하기
		w1.prepare();
		w1.attack();
		
		// YourWeapon 객체를 생성해서 위와 같이 해볼 것.
		Weapon w2 = new YourWeapon();
		
		w2.prepare();
		w2.attack();
		
		
	}
}
