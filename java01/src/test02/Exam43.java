package test02; // switch case default 활용하기

// 2016년 10월 20일 금요일
public class Exam43 {

	public static void main(String[] args) {

		switch (args[0]) {
		case "손님":
			System.out.println("조회만 가능합니다.");
			break;
		case "회원":
			System.out.println("조회, 변경, 삭제 가능합니다.");
			break;
		case "관리자":
			System.out.println("회원 등록 가능합니다.");
			break;
		default:
			System.out.println("유효하지 않는 권한입니다.");
			break;
		}
	}
}