package day12.sub1;

public class Ex01 {
	public static void main(String[] args) {
		MemberLogin memberLogin = new MemberLogin();
		
		try {
			memberLogin.login("user01", "1233");
		}catch(MemberNotFoundException | PasswordIncorrectException e) {
			String message = e.getMessage();
			System.out.println(message);
		}
		
	}

}
