package test.mypac;

public abstract class Weapon {
	
	// 생성자
	public Weapon(){
		System.out.println("Weapon() 생성자 호출됨");
	}
	
	// 멤버 메소드
	public void prepare(){
		System.out.println("무기의 작동을 준비 합니다.");
	}
	// 추상 메소드
	public abstract void attack();
}
