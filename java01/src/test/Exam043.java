package test; // 블록 변수 응용

// 2016년 10월 20일 목요일
public class Exam043 {

	public static void main(String[] args) {
		// byte value = 10; ㅇㅇ
		// short value = 10; ㅇㅇ
		// int value = 10; ㅇㅇ
		// long value = 10; ㄴㄴ
		// float value = 10; ㄴㄴ
		// double value = 10; ㄴㄴ
		// boolean value = 10; ㄴㄴ
		// char value = '가'; ㅇㅇ
//		String value = "손님";
		switch (args[0]) {
		case "손님":
			System.out.println("조회만 가능합니다.");
			break;
		case "회원":
			System.out.println("조회,변경,삭제 가능합니다.");
			break;
		case "관리자":
			System.out.println("회원 등록 가능합니다.");
			break;
		default:
			System.out.println("유효하지 않은 권한입니다.");
			break;
		}

	}
}
