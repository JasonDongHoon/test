package test; // 블록 변수 응용

// 2016년 10월 20일 목요일
public class Exam036 {

	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		
		if (age < 19) System.out.println("미성년입니다.");
		if (age >= 19) System.out.println("성년입니다.");
	}
}
