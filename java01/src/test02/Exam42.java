package test02; // 유아 어린이 청소년 청년 중년 노인 else if 문법으로 출력하기

// 2016년 10월 20일 금요일
public class Exam42 {

	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);

		if (age < 8) {
			System.out.println("유아 입니다.");
		} else if (age >= 8 && age < 14) {
			System.out.println("어린이 입니다.");
		} else if (age >= 14 && age < 19) {
			System.out.println("청소년 입니다.");
		} else if (age >= 19 && age < 40) {
			System.out.println("청년 입니다.");
		} else if (age >= 40 && age < 60) {
			System.out.println("중년 입니다.");
		} else {
			System.out.println("노인 입니다.");
		}
	}
}
