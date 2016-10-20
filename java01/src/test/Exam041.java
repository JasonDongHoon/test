package test; // 블록 변수 응용

// 2016년 10월 20일 목요일
public class Exam041 {

	public static void main(String[] args) {
		int age = Integer.parseInt(args[0]);
		// int age = 15;

/*		if (age < 8)
		if (age <2)
			System.out.println("아기");
		else
			System.out.println("어린이");  10세 이상은 안쳐진다. else문은 가까운 if문에 소속된다.*/
		
		if (age < 8) {
			if (age < 2)
				System.out.println("아기");
		} else
			System.out.println("어린이");

	}
}
