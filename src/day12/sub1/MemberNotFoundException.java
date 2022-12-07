package day12.sub1;

public class MemberNotFoundException extends RuntimeException {
	public MemberNotFoundException(String message) {
		//super() <-- 상위 클래스의 기본 생성자 super() 자동 추가
		super(message);
	}

}
