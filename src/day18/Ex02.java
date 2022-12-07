package day18;

import java.util.*;

public class Ex02 {
	public static void main(String[] args) {
		HashMap<String, String> members = new HashMap<>();
		members.put("user01", "123456");
		members.put("user02", "234567");
		members.put("user03", "123456");
		members.put("user04", "234567");
		
		members.put("user02", "123456"); // put의 마지막 값으로 비교
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("아이디:");
			String userId = sc.nextLine();
			System.out.println("비밀번호:");
			String userPass = sc.nextLine();
			
			String _userPass = members.get(userId);
			if(_userPass==null) {
				System.out.println("등록된 회원이 아닙니다.");
				continue;
			}
			
			if(_userPass.equals(userPass)) { //비번이 일치
				System.out.println("로그인 성공!");
				break;
			}else {// 비번이 불일치
				System.out.println("비밀번호가 불일치 합니다.");
			}
			
		}		
	}
}
