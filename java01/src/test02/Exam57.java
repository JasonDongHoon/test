package test02; // for문 활용하여 count + 문자열 입력 가능

// 2016년 10월 20일 목요일
public class Exam57 {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(i + 1 + "순위 : " + args[i]);
		}
	}
}